package Quoters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyContext {
  @Bean
  public Quoter quoter(){
    return new TerminatorQuoter();
  }

  @Bean
  public InjectedRandomIntAnnotationBeanPostProcessor getBeanPostProcessor(){
    return new InjectedRandomIntAnnotationBeanPostProcessor();
  }
}

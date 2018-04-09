package main;

import Quoters.MyContext;
import Quoters.Quoter;
import Quoters.TerminatorQuoter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext contextXML = new ClassPathXmlApplicationContext("context.xml");
    Quoter quoterXML = contextXML.getBean(TerminatorQuoter.class);
    quoterXML.sayQuot();

    ApplicationContext contextJava = new AnnotationConfigApplicationContext(MyContext.class);
    Quoter quoterJava = contextJava.getBean(TerminatorQuoter.class);
    quoterJava.sayQuot();
  }
}

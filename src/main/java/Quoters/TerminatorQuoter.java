package Quoters;

public class TerminatorQuoter implements Quoter {

  @InjectedRandomInt(min = 1, max = 7)
  private int count;

  public void sayQuot() {
    for (int i = 0; i < count; i++) {
      System.out.println("I'll be back");
    }
  }
}

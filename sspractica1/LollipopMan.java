public class LollipopMan extends TeamDriverA {

  public void operate() {
    System.out.print("  - (Lollipop Man) ");
    for (String person : super.getGroup()) {
      System.out.print(person + ", ");
    }
    System.out.println(" da la señal para que se libere el coche.");
    System.out.println();
  }
}

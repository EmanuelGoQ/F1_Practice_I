public class SideJack extends TeamDriverB {
  public void operate() {
    System.out.print("  - (Side Jack) ");
    for (String person : super.getGroup()) {
      System.out.print(person + ", ");
    }
    System.out.println(" están estabilizando el coche.");
    System.out.println();
  }
}

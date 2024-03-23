public class TyreOff extends TeamDriverB {

  public void operate() {
    System.out.print("  - (Tyre Off) ");
    for (String person : super.getGroup()) {
      System.out.print(person + ", ");
    }
    System.out.println(" están desmontando los neumaticos.");
    System.out.println();
  }
}

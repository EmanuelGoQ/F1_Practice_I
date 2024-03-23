public class TyreOn extends TeamDriverB {

  public void operate() {
    System.out.print("  - (Tyre On) ");
    for (String person : super.getGroup()) {
      System.out.print(person + ", ");
    }
    System.out.println(" están llevando los neumáticos al box y montarlos en el coche.");
    System.out.println();
  }
}

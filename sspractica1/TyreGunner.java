public class TyreGunner extends TeamDriverB {

  public void operate() {
    System.out.print("  - (Tyre Gunner) ");
    for (String person : super.getGroup()) {
      System.out.print(person + ", ");
    }
    System.out.println(" están accionando la pistola de ruedas para desmontar y montar la tuerca de rueda");
    System.out.println();
  }
}

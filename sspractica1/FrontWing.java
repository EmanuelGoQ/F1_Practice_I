public class FrontWing extends TeamDriverA {

  public void operate() {
    System.out.print("  - (Front Wing)  ");
    for (String person : super.getGroup()) {
      System.out.print(person + ", ");
    }
    System.out.println(" están aplicando cambios aerodinámicos al alerón delantero.");
    System.out.println();
  }

}

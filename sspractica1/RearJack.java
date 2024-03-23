public class RearJack extends TeamDriverA {

  public void operate() {
    System.out.print("  - (Rear Jack) ");
    for (String person : super.getGroup()) {
      System.out.print(person + ", ");
    }
    System.out.println(" están levantando el coche en el aire desde atrás para poder cambiar los neumáticos.");
    System.out.println();
  }
}

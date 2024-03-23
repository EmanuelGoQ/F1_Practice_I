public class FrontJack extends TeamDriverA {

  public void operate() {
    System.out.print("  - (Front Jack) ");
    for (String person : super.getGroup()) {
      System.out.print(person + ", ");
    }
    System.out.println(" están levantando la parte delantera del  en el aire para poder cambiar los neumáticos.");
    System.out.println();
  }
}
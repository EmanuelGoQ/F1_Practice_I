import java.util.Random;

public class RearJack extends TeamDriverA {
  //attributes
  private Random random = new Random(); //objeto random que permite generar numeros aleatorios
  private int tiempo = random.nextInt(899)+100; //tiempo de operacion en milisegundos
  private String miniMensaje = "Esta tarea tomó solo "; //mensaje que se mostrara en pantalla que se repite
  //own methods
  public void operate() {
    System.out.print("  - (Rear Jack) ");
    for (String person : super.getGroup()) {
      System.out.print(person + ", ");
    }
    System.out.println(" están levantando el coche en el aire desde atrás para poder cambiar los neumáticos.");
    InternalOperate();
    System.out.println();
  }
  private void InternalOperate(){
    System.out.println(miniMensaje + tiempo + " milisegundos!");
  }
}

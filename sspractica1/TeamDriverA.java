public class TeamDriverA extends PitCrewTeam {

  // attributes
  private String idCarro;

  // constructor
  public TeamDriverA(String marca) {
    this.idCarro = marca;
  }

  public TeamDriverA() {
  }

  // getters and setters
  public String getidCarro(){
    return this.idCarro;
  }
  public void setidCarro(String idCarro) {
    this.idCarro = idCarro;
  }

  // own methods
  public void reunionEquipo() {
    System.out.print("El equipo del vehiculo "+idCarro+" se está reuniendo... ");
    reclamarBebidas();
    System.out.println(" y descansando luego de la parada en los pit ");
  }

  private void reclamarBebidas() {
    System.out.print("El equipo está obteniendo unas bebidas");
  }

  public void cortaFuego() {
    System.out.println("¡El corta fuegos está siendo aplicado al vehiculo!");
  }
}

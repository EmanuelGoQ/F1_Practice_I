public class TeamDriverB extends PitCrewTeam {

  // attributes
  private String idCarro;

  // constructor
  public TeamDriverB(String marca) {
    this.idCarro = marca;
  }

  public TeamDriverB() {
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
    System.out.print("El equipo del vehiculo " + idCarro+ " se está reuniendo... ");
    reclamarBebidas();
    System.out.println(" y operando el vehiculo... ");
  }

  private void reclamarBebidas() {
    System.out.print("El equipo está obteniendo unas bebidas");
  }
}

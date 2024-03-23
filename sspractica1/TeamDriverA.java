public class TeamDriverA extends PitCrewTeam {

  // attributes
  private int paradas = 0;
  private String idCarro;
  private boolean damage = false;

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
  public void Drive(){
    System.out.println("El conductor lleva un tiempo en carrera y se está preparando para la siguiente parada por algunas deficiencias en el vehiculo");
    System.out.println();
    this.damage = true;
  }
  public void Pit() {
    System.out.println("El equipo del vehiculo "+idCarro+" se está prepara para recibir la parada en los pit");
    System.out.println();
    this.paradas++;
    this.damage = false;
  }
  
  public void reunionEquipo() {
    System.out.print("El equipo del vehiculo "+idCarro+" se está reuniendo... ");
    reclamarBebidas();
    System.out.println(" y descansando luego de la parada en los pit ");
  }

  private void reclamarBebidas() {
    System.out.print("El equipo está obteniendo unas bebidas");
  }
}

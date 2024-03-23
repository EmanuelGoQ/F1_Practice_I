import java.util.ArrayList;

public class PitCrewTeam {

  // attributes
  private int carrosTuneados = 0; // cantidad de carros que el Pit Crew ha manipulado/areglado éxitosamente.
  private boolean almorzado, agotado; // ¿el equipo ya almorzó? ¿el equipo está agotado?
  private ArrayList<String> group = new ArrayList<>();
  public FrontJack frontJack;
  public FrontWing frontWing;
  public LollipopMan lollipopMan;
  public RearJack rearJack;
  public SideJack sideJack;
  public TyreGunner tyreGunner;
  public TyreOff tyreOff;
  public TyreOn tyreOn;

  // get and setters

  public void tunearCarro() {
    System.out.println("El equipo de Pit Craw está tuneando el carro...");
    carrosTuneados++;
  }

  public int getCarrosTuneados() {
    return carrosTuneados;
  }

  public void almorzados(boolean bool) {
    almorzado = bool;
  }

  public boolean getAlmorzados() {
    return almorzado;
  }

  public void agotados(boolean bool) {
    agotado = bool;
  }

  public boolean getAgotados() {
    return agotado;
  }

  public ArrayList<String> getGroup() {
    return group;
  }

  public void setGroup(ArrayList<String> group) {
    this.group = group;
  }

  // own methods
  public void add(String person) {
    group.add(person);
  }

  public void defineTeam() {
    frontJack = new FrontJack();
    frontWing = new FrontWing();
    lollipopMan = new LollipopMan();
    rearJack = new RearJack();
    sideJack = new SideJack();
    tyreGunner = new TyreGunner();
    tyreOff = new TyreOff();
    tyreOn = new TyreOn();
  }
}

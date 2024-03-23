import java.util.ArrayList;

public class PitCrewTeam {

  // attributes
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
    Ready();
    frontJack = new FrontJack();
    frontWing = new FrontWing();
    lollipopMan = new LollipopMan();
    rearJack = new RearJack();
    sideJack = new SideJack();
    tyreGunner = new TyreGunner();
    tyreOff = new TyreOff();
    tyreOn = new TyreOn();
  }
  public void Ready(){
    System.out.print("En el Pitcrew se prepran los puestos del equipo del ");
  }
}

//Abstration (ability to create a class with properties and methods)
public class F1Team {
  // Encapsulation (the class has private parameters and
  // attributes will be modified with the class's own methods)
  private String name, foundationYear, headquarters, manager;
  public TeamDriverA teamDriverA;
  public TeamDriverB teamDriverB;

  // Constructor
  public F1Team(String name, String foundationYear, String headquarters, String manager, TeamDriverA teamDriverA,
      TeamDriverB teamDriverB) {
    this.name = name;
    this.foundationYear = foundationYear;
    this.headquarters = headquarters;
    this.manager = manager;
    this.teamDriverA = teamDriverA;
    this.teamDriverB = teamDriverB;
  }

  // Getter and Setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFoundationYear() {
    return foundationYear;
  }

  public void setFoundationYear(String foundationYear) {
    this.foundationYear = foundationYear;
  }

  public String getHeadquarters() {
    return headquarters;
  }

  public void setHeadquarters(String headquarters) {
    this.headquarters = headquarters;
  }

  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  // own methods
  public void presentation() {
    System.out.println("**Presentación del Equipo de Fórmula 1**");
    System.out.println("Nombre del Equipo: " + name);
    System.out.println("Año de Fundación: " + foundationYear);
    System.out.println("Sede: " + headquarters);
    System.out.println("Manager: " + manager);
  }
  public void CheerUpTeam(){
    System.out.println("!"+this.manager+" está haciendo todo lo posible por animar a sus conductores desde su sede en "+this.headquarters+"!\n");
  }
}

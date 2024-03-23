public class Main {
  public static void main(String[] args) {

    // Instancias del equipo que apoya al TeamDriverA
    TeamDriverA TeamDriverA = new TeamDriverA("Supra");
    TeamDriverA.defineTeam();

    // Instancias del equipo que apoya al TeamDriverB
    TeamDriverB TeamDriverB = new TeamDriverB("Ferrari");
    TeamDriverB.defineTeam();

    // Instancias del equipo Eafun
    F1Team Eafun = new F1Team("Eafun", "1999", "Medellín", "Saitama", TeamDriverA, TeamDriverB);

    // DECLARACIÓN DE LAS 5 PERSONAS QUE APOYAN EXCLUSIVAMENTE A eafunTeamDriverA
    // Persona 1
    Eafun.teamDriverA.tyreOn.add("Emanuel");
    Eafun.teamDriverA.sideJack.add("Emanuel");
    Eafun.teamDriverA.frontJack.add("Emanuel");

    // Persona 2
    Eafun.teamDriverA.tyreOn.add("Simón");
    Eafun.teamDriverA.sideJack.add("Simón");

    // Persona 3
    Eafun.teamDriverA.rearJack.add("Samuel");
    Eafun.teamDriverA.frontWing.add("Samuel");

    // Persona 4
    Eafun.teamDriverA.rearJack.add("Alejandro");
    Eafun.teamDriverA.frontWing.add("Alejandro");

    // Persona 5
    Eafun.teamDriverA.lollipopMan.add("Silvana");
    Eafun.teamDriverA.frontJack.add("Silvana");

    // DECLARACIÓN DE LAS PERSONAS QUE APOYAN EXLUSIVAMENTE eafunTeamDriverB
    // Persona 6
    Eafun.teamDriverB.tyreOn.add("Real");
    Eafun.teamDriverB.sideJack.add("Real");
    Eafun.teamDriverB.frontJack.add("Real");

    // Persona 7
    Eafun.teamDriverB.tyreOn.add("Salomon");
    Eafun.teamDriverB.sideJack.add("Salomon");

    // Persona 8
    Eafun.teamDriverB.rearJack.add("Baltazar");
    Eafun.teamDriverB.frontWing.add("Baltazar");

    // Persona 9
    Eafun.teamDriverB.rearJack.add("Rigby");
    Eafun.teamDriverB.frontWing.add("Rigby");

    // Persona 10
    Eafun.teamDriverB.lollipopMan.add("Mordecai");
    Eafun.teamDriverB.frontJack.add("Mordecai");

    // DECLARACIÓN DE LAS PERSONAS QUE APOYAN A AMBOS VEHICULOS
    // Persona 11
    Eafun.teamDriverA.tyreGunner.add("Papaleta");
    Eafun.teamDriverB.tyreGunner.add("Papaleta");

    // Persona 12
    Eafun.teamDriverA.tyreGunner.add("Skip");
    Eafun.teamDriverB.tyreGunner.add("Skip");

    // Persona 13
    Eafun.teamDriverA.tyreGunner.add("Dororo");
    Eafun.teamDriverB.tyreGunner.add("Dororo");

    // Persona 14
    Eafun.teamDriverA.tyreGunner.add("Gaintz");
    Eafun.teamDriverB.tyreGunner.add("Gaintz");

    // Persona 15
    Eafun.teamDriverA.tyreOff.add("Ramón");
    Eafun.teamDriverB.tyreOff.add("Ramón");

    // Persona 16
    Eafun.teamDriverA.tyreOff.add("Flash");
    Eafun.teamDriverB.tyreOff.add("Flash");

    // Persona 17
    Eafun.teamDriverA.tyreOff.add("Invencible");
    Eafun.teamDriverB.tyreOff.add("Invencible");

    // Persona 18
    Eafun.teamDriverA.tyreOff.add("Sher");
    Eafun.teamDriverB.tyreOff.add("Sher");

    // Persona 19
    Eafun.teamDriverA.tyreOn.add("Franklin");
    Eafun.teamDriverB.tyreOn.add("Franklin");

    // Persona 20
    Eafun.teamDriverA.tyreOn.add("Brianth");
    Eafun.teamDriverB.tyreOn.add("Brianth");

    System.out.println();
    Eafun.presentation();
    System.out.println();

    Eafun.teamDriverA.reunionEquipo();
    System.out.println();
    Eafun.teamDriverB.reunionEquipo();
    System.out.println();

    Eafun.teamDriverA.tyreGunner.operate();
    Eafun.teamDriverA.tyreOff.operate();

    Eafun.CheerUpTeam();
  }
}
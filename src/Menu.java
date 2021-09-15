import java.util.Scanner;

public class Menu {
    //scanner lässt uns dinge im terminal eingeben
    Scanner _scanner;
    //beim starten wird auf void main zugegriffen
    //Constructer 
    public Menu(){

        this.setScanner(new Scanner(System.in));
        startMenu();
    }
    
    public  void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Neuer Verkauf");
        System.out.println("(2) Neuer Kunde");
        System.out.println("(3) Neues Auto");
        System.out.println("(4) Neuer Verkäufer");
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);
        

        if(choice.equals("1")) {
            System.out.println("Verkauf noch nicht inplementiert...");
        }
        else if(choice.equals("2")){
            System.out.println("Neuer Kunde noch nicht implementiert...");
        }
        else if(choice.equals("3")){
            createAutoMenu();
            
        }
        else if(choice.equals("4")){
            System.out.println("Neuer Verkäufer noch nich implementiert...");
        }
        else {
            System.out.println("Bitte nur 1, 2, 3, 4 eingeben!");
        }
        startMenu();
    
    }



    public  void setScanner(Scanner _scanner) {
        this._scanner = _scanner;
    }
    

    public  Scanner getScanner() {
        return _scanner;
    }
   

    public void createAutoMenu(){
        System.out.println("Erstelle ein Auto");
        System.out.println("Marke");
        String Marke = getScanner().nextLine();
        System.out.println("Modell");
        String Modell = getScanner().nextLine();
       // System.out.println("Baujahr");
       // String Baujahr = getScanner().nextLine();
        System.out.println("Vielen Dank, dein Auto wird erstellt");

        Auto a1 = new Auto(Marke, Modell);

    }

    

}
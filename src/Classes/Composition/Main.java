package Classes.Composition;

public class Main {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(20,202,4);
        Case theCase = new Case("220B","DELL", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Good", "Philips", 27, new Resolution(2540, 1040));
        Motherboard theMotherboard = new Motherboard("A#-2934", "ASUS", 4, 6, "v3.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.getMonitor().drawPixelAt(1200, 1550, "green");
        thePC.getMotherboard().loadProgram("the program");
        thePC.getTheCase().pressPowerButton();
    }
}

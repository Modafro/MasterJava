package StaticAndFinal.Final;

public class FinalClass {

    //if we declared the FinalClass as final, it would mean that you wouldnt be able to instantiate a new FinalClass. Very useful when you have a class that holds constants for instance.
    //eg: the Math class in java
    private static int classCounter = 0;
    public final int instanceNumber; //can't change the value once its been assigned. also why when creating constants, they're typically declared at static final
    private final String name;

    public FinalClass(String name){
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public String getName() {
        return name;
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}

package java_assignments11.java_assignment7.part4;

public class Factory {
    public CycleInterface makeCycle(String Type) {
        if(Type.equals("Unicycle")) {
            return new Unicycle();
        }
        else if(Type.equals("Bicycle")) {
            return new Bicycle();
        }
        else if(Type.equals("Tricycle")) {
            return new Tricycle();
        }
        return null;
    }
}
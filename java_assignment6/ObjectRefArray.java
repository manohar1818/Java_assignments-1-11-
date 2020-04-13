package java_assignments11.java_assignment6;



public class ObjectRefArray {
    private String str;
    // parameterised constructor
    public ObjectRefArray(String str){
        this.str = str;
        System.out.println(str);
    }

    public static void main(String[] args) {
        ObjectRefArray  objectRefArray[] = new ObjectRefArray[3];
        /*
        the above code prints nothing untill objects are created
         */
        objectRefArray[0] = new ObjectRefArray("firstobject");
        objectRefArray[1] = new ObjectRefArray("secondobject");
        objectRefArray[2] = new ObjectRefArray("thirdobject");

    }

}

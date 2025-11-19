public class Airplane {
    //instance variables
    //1. used in whole class
    //2. should be at the top of the class
    //3. need the word public before it
    public int capacity;
    public String name;
    public String model;
    public boolean isDoubleDecker;
    public int length;

    //constructor
    public Airplane(){
        capacity = 150;
        name = "Jacob";
        model = "boeing 777";
        isDoubleDecker = false;
        length = 150;

    }
    //constructor w/ parameter

    public Airplane(int pCapacity, String pName, String pModel, boolean pisDoubleDecker, int pLength){
        capacity = pCapacity;
        name = pName;
        model = pModel;
        isDoubleDecker = pisDoubleDecker;
        length = pLength;
    }
    public void printInfo(){
        System.out.println(capacity); //not readable
        System.out.println("Model: " + model); //readable
        System.out.println(isDoubleDecker); //not readable
        System.out.println("this plane is named " + name); //more fancy readable
        System.out.println("The length of the plane is " + length + "feet");
    }
}

public class Airplane {
    //instance variables
    //1. used in whole class
    //2. should be at the top of the class
    //3. need the word public before it
    public int capacity;
    public String name;
    public String model;
    public boolean doubleDecker;
    public int length;

    //constructor
    public Airplane(){
        capacity = 150;
        name = "Jacob";
        model = "boeing 777";
        doubleDecker = false;
        length = 150;

    }
    //constructor w/ parameter
    public Airplane(int pCapacity){
        capacity = pCapacity;
    }
    public void printInfo(){
        System.out.println(capacity);
        System.out.println(model);
        System.out.println(doubleDecker);
        System.out.println(name);
        System.out.println(length);
    }
}

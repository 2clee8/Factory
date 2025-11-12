public class Factory {

//need to put *public before *int if used before methods

    // int variable for the year factory was founded
    public int yearFounded = 1798;
    public String factoryName = "airplane Factory";
    public boolean isOpen = true;

        //psvm
    public static void main(String[] args) {
        //sout
        System.out.println("welcome to Cynthia's factory");
        //saying we want to call the constructor "Factory" and make a new one
        new Factory();

    }

    //constructor
    //1. is a method
    //2. has same name as class
    //3. no void
    public Factory(){
        isOpen=false;
        //scope for manager is only in the constructor
        String manager = "Mr. Hales";
        System.out.println(manager);
        factoryInfo();

        //todo right here
        yearFounded = 2024;
        factoryInfo();

        //type varName = value
        //object of type airplane

        Airplane plane1 = new Airplane();
        plane1.name = "jeff";plane1.capacity = 635;
        plane1.doubleDecker = false;
        plane1.length = 36;
        plane1.model = "Boeing 777";
        System.out.println(plane1.name);
        Airplane plane2 = new Airplane();
        System.out.println(plane2.capacity);


    }

    //empty method called factoryInfo
    public void factoryInfo(){
        System.out.println(factoryName);
        System.out.println(isOpen);
        System.out.println("year founded " + yearFounded);
    }
}

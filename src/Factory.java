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

        //1st airplane
        Airplane plane1 = new Airplane();

        plane1.name = "jeff";
        plane1.capacity = 635;
        plane1.doubleDecker = false;
        plane1.length = 36;
        plane1.model = "Boeing 777";

        //2nd  airplane
        Airplane plane2 = new Airplane();

        System.out.println(plane2.name);
        System.out.println(plane2.capacity);
        System.out.println(plane2.model);
        System.out.println(plane2.doubleDecker);
        System.out.println(plane2.length);

        //plane3
        Airplane plane3 = new Airplane();
        plane3.name = "Bob";
        plane3.capacity = 360;
        plane3.model = "Airbus A350";
        plane3.doubleDecker = false;
        plane3.length = 200;


        //plane 4
        Airplane plane4 = new Airplane();
        plane4.name = "Cleopatra";
        plane4.capacity = 365;
        plane4.model = "Boeing 747";
        plane4.doubleDecker = true;
        plane4.length = 250;

        //print airplane 3 and 4
        System.out.println(plane3.name);
        System.out.println(plane3.capacity);
        System.out.println(plane3.model);
        System.out.println(plane3.doubleDecker);
        System.out.println(plane3.length);

        System.out.println(plane4.name);
        System.out.println(plane4.capacity);
        System.out.println(plane4.model);
        System.out.println(plane4.doubleDecker);
        System.out.println(plane4.length);


    }

    //empty method called factoryInfo
    public void factoryInfo(){
        System.out.println(factoryName);
        System.out.println(isOpen);
        System.out.println("year founded " + yearFounded);
    }
}

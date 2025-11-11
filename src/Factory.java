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

    //constructor: very special type of method, has exact same name as class,also because doens't have void
    public Factory(){
        isOpen=false;
        //scope for manager is only in the constructor
        String manager = "Mr. Hales";
        System.out.println(manager);
        factoryInfo();

        //todo right here
        yearFounded = 2024;
        factoryInfo();

    }

    //empty method called factoryInfo
    public void factoryInfo(){
        System.out.println(factoryName);
        System.out.println(isOpen);
        System.out.println("year founded " + yearFounded);
    }
}

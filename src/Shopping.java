import org.w3c.dom.ls.LSOutput;

public class Shopping {
    public String brand;
    public int numberOfStores;
    public double revenue;
    public boolean expensive;

    public Shopping(){
        brand = "Aritzia";
        revenue = 812.1;
        numberOfStores = 124;
        expensive = true;
    }

    public Shopping(String pBrand, int pnumberOfStores, double pRevenue, boolean pExpensive){
        brand = pBrand;
        numberOfStores = pnumberOfStores;
        revenue = pRevenue;
        expensive = pExpensive;
    }

    public void printInfo() {
        System.out.println(brand); //not readable
    }

}


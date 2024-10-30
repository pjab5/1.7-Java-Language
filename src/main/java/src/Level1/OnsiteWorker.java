package src.Level1;

public class OnsiteWorker extends Worker{
    private static double gas;

    public OnsiteWorker(String name, String surname, double hourlywage, double gas) {
        super(name, surname, hourlywage);
        this.gas=gas;
    }

    @Override
    public double calculateSalary(int hours){
        return hourlywage*hours+gas;
    }

    @Deprecated
    public void printGas(){
        System.out.println("The gas price is " + gas);
    }

}

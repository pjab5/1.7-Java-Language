package src.Level1;

public class RemoteWorker extends Worker{
    private final double INTERNETRATEPRICE=33;

    public RemoteWorker(String name, String surname, double hourlywage) {
        super(name, surname, hourlywage);
    }

    @Override
    public double calculateSalary(int hours){
        return hourlywage*hours+INTERNETRATEPRICE;
    }

    @Deprecated
    public void printInternetPrice(){
        System.out.println("The Internet price is "+ INTERNETRATEPRICE);
    }
}

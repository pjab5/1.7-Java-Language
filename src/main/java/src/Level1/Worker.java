package src.Level1;

public class Worker {
    private String name;
    private String surname;
    protected double hourlywage;

    public Worker(String name, String surname, double hourlywage) {
        this.name = name;
        this.surname = surname;
        this.hourlywage = hourlywage;
    }

    public double calculateSalary(int hours){
        return hourlywage*hours;
    }
}

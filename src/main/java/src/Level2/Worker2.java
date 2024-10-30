package src.Level2;

@ToJson(directory = "src")
public class Worker2 {
    private String name;
    private String surname;
    protected double hourlywage;

    public Worker2(String name, String surname, double hourlywage) {
        this.name = name;
        this.surname = surname;
        this.hourlywage = hourlywage;
    }

    public double calculateSalary(int hours){
        return hourlywage*hours;
    }
}


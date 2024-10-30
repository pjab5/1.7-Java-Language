package src.Level1;


public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Worker worker = new Worker("Peter","Parker",12);
        OnsiteWorker onsiteWorker = new OnsiteWorker("Georges","Simenon",17,140);
        RemoteWorker remoteWorker = new RemoteWorker("Jane","Austen",23);
        System.out.println(worker.calculateSalary(162));
        System.out.println(onsiteWorker.calculateSalary(176));
        System.out.println(remoteWorker.calculateSalary(190));
        onsiteWorker.printGas();
        remoteWorker.printInternetPrice();
    }
}
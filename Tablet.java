public class Tablet extends SmartPhone{
    Tablet(String phoneNumber, String brand){
        super(phoneNumber, brand);
    }

    public void chat() {
        System.out.println("Hey, this is my new tablet. It's big 😳");
    }

    public void call() {
        System.out.println("Hello, it's me…, calling from my big tablet");
    }
}   

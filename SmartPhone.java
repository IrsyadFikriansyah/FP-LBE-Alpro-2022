public class SmartPhone extends Telephone{
    public String brand;

    SmartPhone(String phoneNumber, String brand){
        super(phoneNumber);
        this.brand = brand;
    }

    public void chat(){
        System.out.println("hi 👋, this is my new smartphone");
    }

    public void call(){
        System.out.println("Hello, it's me…, calling from my smartphone");
    }

}
public class FlipPhone extends SmartPhone {
    public FlipPhone(String phoneNumber, String brand){
        super(phoneNumber, brand);
    }

    public void chat() {
        System.out.println("Hey, this is my new FlipPhone 😎");
    }

    public void call() {
        System.out.println("Hello, it's me…, calling from my flip phone");
    }
    
}

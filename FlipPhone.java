public class FlipPhone extends SmartPhone {
    public FlipPhone(String phoneNumber, String brand){
        super(phoneNumber, brand);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public void chat() {
        System.out.println("Hey, this is my new FlipPhone 😎");
    }

    @Override
    public void call() {
        System.out.println("Hello, it's me…, calling from my flip phone");
    }
    
}

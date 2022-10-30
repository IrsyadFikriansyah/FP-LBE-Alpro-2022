public class Tablet extends SmartPhone{
    Tablet(String phoneNumber, String brand){
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
        System.out.println("Hey, this is my new tablet. It's big 😳");
    }

    @Override
    public void call() {
        System.out.println("Hello, it's me…, calling from my big tablet");
    }
}   

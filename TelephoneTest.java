public class TelephoneTest {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone("087757929414", "Iphone");
        System.out.println("number\t: " + mySmartPhone.getPhoneNumber());
        System.out.println("brand\t: " + mySmartPhone.getBrand());
        mySmartPhone.chat();
        mySmartPhone.call();

        System.out.println();

        FlipPhone myFlipPhone = new FlipPhone("0876252383152", "Samsung");
        System.out.println("number\t: " + myFlipPhone.getPhoneNumber());
        System.out.println("brand\t: " + myFlipPhone.getBrand());
        myFlipPhone.chat();
        myFlipPhone.call();
        
        System.out.println();

        Tablet myTablet = new Tablet("087595382753", "Xiaomi");
        System.out.println("number\t: " + myTablet.getPhoneNumber());
        System.out.println("brand\t: " + myTablet.getBrand());
        myTablet.chat();
        myTablet.call();
    }

}

public class TelephoneTest {
    public static void main(String[] args) {

        SmartPhone mySmartPhone = new SmartPhone("087757929414", "Iphone");

        mySmartPhone.chat();
        mySmartPhone.call();

        System.out.println();

        FlipPhone myFlipPhone = new FlipPhone("0876252383152", "Samsung");

        myFlipPhone.chat();
        myFlipPhone.call();
        
        System.out.println();

        Tablet myTablet = new Tablet("087595382753", "Xiaomi");

        myTablet.chat();
        myTablet.call();
    }

}

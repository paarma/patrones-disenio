package patrones.creacional.factorymethod;

public class GooglePayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("xxxxxxxxxxxxxxxx Pagando con Google Payment");
    }
}

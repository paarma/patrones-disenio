package patrones.creacional.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {

    public static class CartType {
        public static final String VISA = "visa";
        public static final String AMEX = "amex";
    }

    private static Map<String, PrototypeCard> prototypes = new HashMap<>();

    /**
     * Este es el método encargado de retornar una instancia CLONADA
     * @param tipo
     * @return
     * @throws CloneNotSupportedException
     */
    public static PrototypeCard getInstance(final String tipo) throws CloneNotSupportedException {
        return prototypes.get(tipo).clone();
    }

    public static void loadCard(){
        Visa visa = new Visa();
        visa.setName("Esta tarjeta es Visa con numero 000");
        prototypes.put(CartType.VISA, visa);

        Amex amex = new Amex();
        amex.setName("Esta tarjeta es Amex con numero 111");
        prototypes.put(CartType.AMEX, amex);
    }

}

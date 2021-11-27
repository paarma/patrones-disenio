package patrones.creacional.singleton;

/**
 * Este patrón se centra en que solo se pueda crear una instancia de una clase.
 * Por esta razón tambien se define el constructor como privado.
 */
public class Card {

    private static Card instancia;

    private String cardNumber;

    private Card(){

    }

    /**
     * Este método será el que retorne la unica instancia de la clase.
     * Se fija el atributo "synchronized" en caso de que se estén
     * ejecutando dos hilos a la vez entonces evita que se creen dos instancias
     * de la clase (gataniza una unica ejecución del método)
     * @return
     */

    public synchronized static Card getInstancia() {
        if(instancia == null){
            instancia = new Card();
        }
        return instancia;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}

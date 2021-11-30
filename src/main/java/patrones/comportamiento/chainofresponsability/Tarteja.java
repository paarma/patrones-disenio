package patrones.comportamiento.chainofresponsability;

/**
 * Esta clase sera la encargada de organizar la cadena de responsabilidad
 */
public class Tarteja implements ApproveLoadChain {

    private ApproveLoadChain next;

    @Override
    public void setNext(ApproveLoadChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoadChain getNext() {
        return next;
    }

    /**
     * Se configura la cadena de responsabilidad
     * Cada llamado al método "next" lleva como parámetro el objeto que se encargará
     * de evaluar la solicitud. (El llamado a next() se hace desde el objeto actual
     * pasandole como parámetro el siguiente objeto)
     * @param totalLoan
     */
    @Override
    public void creditCardRequest(int totalLoan) {
        Gold gold = new Gold();
        this.setNext(gold);

        Platinium platinium = new Platinium();
        gold.setNext(platinium);

        Black black = new Black();
        platinium.setNext(black);

        next.creditCardRequest(totalLoan);
    }

}

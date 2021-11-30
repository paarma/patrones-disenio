package patrones.comportamiento.chainofresponsability;

public class Gold implements ApproveLoadChain {

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
     * Si no cumple con la condicion se pasará a validar en el siguiente objeto de la cadena de responsabilidad
     * @param totalLoan
     */
    @Override
    public void creditCardRequest(int totalLoan) {
        if(totalLoan <= 10000){
            System.out.println("Esta solicitud de tarjeta de credito la maneja la targeta GOLD");
        }else{
            next.creditCardRequest(totalLoan);
        }
    }
}

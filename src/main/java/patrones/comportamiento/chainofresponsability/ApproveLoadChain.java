package patrones.comportamiento.chainofresponsability;

/**
 * Este patrón permite que varias clases intenten manejar una solicitud independientemente
 * de los objeetos a lo largo de la cadena de responsabilidad
 * (Atender solicitudes de manera jerarquica)
 */
public interface ApproveLoadChain {
    void setNext(ApproveLoadChain loan);
    ApproveLoadChain getNext();
    void creditCardRequest(int totalLoan);
}

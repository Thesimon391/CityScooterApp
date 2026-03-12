package rentingscooters.domain;

public class payment {
    private String idPayment;
    private String numberTransaction;
    private boolean status;

    public payment(String idPayment, String numberTransaction, boolean status) {
        this.idPayment = idPayment;
        this.numberTransaction = numberTransaction;
        this.status = status;
    }

    public String getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(String idPayment) {
        this.idPayment = idPayment;
    }

    public String getNumberTransaction() {
        return numberTransaction;
    }

    public void setNumberTransaction(String numberTransaction) {
        this.numberTransaction = numberTransaction;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "payment{" +
                "idPayment='" + idPayment + '\'' +
                ", numberTransaction='" + numberTransaction + '\'' +
                ", status=" + status +
                '}';
    }
}

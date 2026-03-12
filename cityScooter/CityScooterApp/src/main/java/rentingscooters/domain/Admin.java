package rentingscooters.domain;

public class Admin {
    private int idAdmin;
    private boolean Status;
    private String chances;

    public Admin(int idAdmin, boolean status, String chances) {
        this.idAdmin = idAdmin;
        Status = status;
        this.chances = chances;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public String getChances() {
        return chances;
    }

    public void setChances(String chances) {
        this.chances = chances;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "idAdmin=" + idAdmin +
                ", Status=" + Status +
                ", chances='" + chances + '\'' +
                '}';
    }
}

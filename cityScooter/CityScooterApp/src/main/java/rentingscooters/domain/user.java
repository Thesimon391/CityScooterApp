package rentingscooters.domain;

public class user {
    private int user;
    private String type;
    private boolean Status;

    public user(int user, String type, boolean status) {
        this.user = user;
        this.type = type;
        Status = status;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "user{" +
                "user=" + user +
                ", type='" + type + '\'' +
                ", Status=" + Status +
                '}';
    }
}

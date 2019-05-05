package solarvillage;

public class PermitStatus {

    private final String id;
    private final String status;

    public PermitStatus(String id, String status) {
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }
}

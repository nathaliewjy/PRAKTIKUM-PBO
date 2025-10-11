package models;

public enum Status {
    HADIR (1), ALPHA (0);

    private final int isiStatus;

    Status(int isiStatus) {
        this.isiStatus = isiStatus;
    }

    public int getIsiStatus() {
        return isiStatus;
    }
}

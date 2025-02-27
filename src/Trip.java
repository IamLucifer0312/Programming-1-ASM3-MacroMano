import java.time.LocalDate;

import Utils.Status;

public class Trip {
    private Vehicle vehicle;
    private LocalDate departDate;
    private LocalDate arriveDate;
    private Port departPort;
    private Port arrivePort;
    private double length;
    private Status status;

    public Trip() {
    }

    // TODO: Do you need to initialize status?
    public Trip(Vehicle vehicle, LocalDate departDate, LocalDate arriveDate, Port departPort, Port arrivePort) {
        this.vehicle = vehicle;
        this.departDate = departDate;
        this.arriveDate = arriveDate;
        this.departPort = departPort;
        this.arrivePort = arrivePort;
        this.status = Status.PROCESSING;
    }

    public LocalDate getDepartDate() {
        return departDate;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}

/**
 * Class representing a yearly parking pass.
 */
public class YearlyPass implements Pass {
    private int id;
    private int vehicleId;
    private double fees;
    private String issueDate;
    private String expiryDate;

    public YearlyPass(int id, int vehicleId, double fees, String issueDate, String expiryDate) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.fees = fees;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    public int getId() {
        return id;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public double getFees() {
        return fees;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void createPass(int id, int vehicleId, double fees, String issueDate, String expiryDate) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.fees = fees;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;

        if (fees <= 0) {
            System.out.println(Constants.ErrorMessage.INVALID_FEE);
        } else {
            System.out.println(Constants.PASS_CREATED);
            getPass(id);
        }
    }

    public Pass getPass(int id) {
        if (this.id != id) {
            System.out.println(Constants.ErrorMessage.NO_PASS);
            return null;
        }

        System.out.println(Constants.PASS_ID + this.id);
        System.out.println(Constants.VEHICLE_ID + this.vehicleId);
        System.out.println(Constants.FEES + this.fees);
        System.out.println(Constants.ISSUE_DATE + this.issueDate);
        System.out.println(Constants.EXPIRY_DATE + this.expiryDate);

        return this;
    }
}

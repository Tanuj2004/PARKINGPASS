/**
 * Class representing a monthly parking pass.
 */
public class MonthlyPass implements Pass {
    private int id;
    private int vehicleId;
    private double fees;
    private String issueDate;
    private String expiryDate;

    public MonthlyPass(int id, int vehicleId, double fees, String issueDate, String expiryDate) {
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
        System.out.println("Monthly Pass created successfully.");
    }
    public Pass getPass(int id) {
        if (this.id == id) {
            System.out.println("Pass ID: " + this.id);
			System.out.println("Vehicle ID: " + this.vehicleId);
			System.out.println("Fees: " + this.fees);
            System.out.println("Issue Date: " + this.issueDate);
            System.out.println("Expiry Date: " + this.expiryDate);            
            return this;
        } else {
            System.out.println("Error: Pass not found.");
            return null;
        }
    }

 
}

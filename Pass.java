/**
 * The Pass interface provides the contract for creating and managing parking passes.
 * It defines the methods for retrieving pass details and creating or renewing passes.
 */
public interface Pass {
    int getId();
    int getVehicleId();
    double getFees();
    String getIssueDate();
    String getExpiryDate();

    void createPass(int id, int vehicleId, double fees, String issueDate, String expiryDate);
    Pass getPass(int id);  
}

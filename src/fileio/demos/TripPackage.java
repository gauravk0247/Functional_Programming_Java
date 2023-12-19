package fileio.demos;

// Real time it is model name
public class TripPackage {
	private String packageId;
	private int custId;
	private String custName;
	private String sourceLoc;
	private String destinationLoc;
	private double packageCost;
	public TripPackage(String packageId, int custId, String custName, String sourceLoc, String destinationLoc,
			double packageCost) {
		super();
		this.packageId = packageId;
		this.custId = custId;
		this.custName = custName;
		this.sourceLoc = sourceLoc;
		this.destinationLoc = destinationLoc;
		this.packageCost = packageCost;
	}
	public String getPackageId() {
		return packageId;
	}
	public int getCustId() {
		return custId;
	}
	public String getCustName() {
		return custName;
	}
	public String getSourceLoc() {
		return sourceLoc;
	}
	public String getDestinationLoc() {
		return destinationLoc;
	}
	public double getPackageCost() {
		return packageCost;
	}
	@Override
	public String toString() {
		return "TripPackage [packageId=" + packageId + ", custId=" + custId + ", custName=" + custName + ", sourceLoc="
				+ sourceLoc + ", destinationLoc=" + destinationLoc + ", packageCost=" + packageCost + "]";
	}
	
}
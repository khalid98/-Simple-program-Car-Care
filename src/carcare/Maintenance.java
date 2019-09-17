package carcare;

public class Maintenance extends Car {

	private int repair_car_Number; // number of car to repair
	private String type; // manual or automatic
	private int SSN_contract;
	private double repair_car_bill;
	private String warranty_description;
	private int mileage;
	private boolean Checking;

	public Maintenance() {
	}

	public Maintenance(int repair_car_Number, String type,
			int SSN_contract, double repair_car_bill,
			String warranty_description, int mileage,boolean Checking) {
		this.repair_car_Number = repair_car_Number;
		this.type = type;
		this.SSN_contract = SSN_contract;
		this.repair_car_bill = repair_car_bill;
		this.warranty_description = warranty_description;
		this.mileage = mileage;
		this.Checking=Checking;
	}

	public void setChecking(boolean checking) {
		Checking = checking;
	}

	
	public boolean isChecking() {
		return Checking;
	}

	public int getRepair_car_Number() {
		return repair_car_Number;
	}

	public void setRepair_car_Number(int repair_car_Number) {
		this.repair_car_Number = repair_car_Number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	public int getSSN_contract() {
		return SSN_contract;
	}

	public void setSSN_contract(int SSN_contract) {
		this.SSN_contract = SSN_contract;
	}

	public double getRepair_car_bill() {
		return repair_car_bill;
	}

	public void setRepair_car_bill(double repair_car_bill) {
		this.repair_car_bill = repair_car_bill;
	}

	public String getWarranty_description() {
		return warranty_description;
	}

	public void setWarranty_description(String warranty_description) {
		this.warranty_description = warranty_description;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String toString() {
		return (super.toString() + " " + "Maintenance{" + "repair_car_Number="
				+ getRepair_car_Number() + ", type='" + getType() + '\''
				+ "mileage :  " + getMileage() + ", SSN_contract="
				+ getSSN_contract() + '\'' + ", repair_car_bill="
				+ getRepair_car_bill() + ", warranty_description='"
				+ getWarranty_description() + '\'' + '}');
	}
}

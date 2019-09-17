package carcare;

public class Cleaning extends Maintenance {

private String Type_of_wish;   // Automatic or manual 
private boolean water ;
private boolean clean_glass;
private boolean clean_tires;
private boolean clean_theChairs;
private boolean clean_motor;
/*-------------------------------------------------------------------------------*/
public Cleaning() {}
public Cleaning(String Car_Id,String Engine_Power,String Model,String type_of_wish, boolean water, boolean clean_glass,
		boolean clean_tires, boolean clean_theChairs, boolean clean_motor) {
	setCar_Id(Car_Id);
	setEngine_Power(Engine_Power);
	setModel(Model);
	Type_of_wish = type_of_wish;
	this.water = water;
	this.clean_glass = clean_glass;
	this.clean_tires = clean_tires;
	this.clean_theChairs = clean_theChairs;
	this.clean_motor = clean_motor;
}
/*public Cleaning(int repair_car_Number, String type, int car_ID,
		int SSN_contract, double repair_car_bill, String warranty_description,
		int mileage) {
	super(repair_car_Number, type, car_ID, SSN_contract, repair_car_bill,
			warranty_description, mileage);
}*/

/*-------------------------------------------------------------------------------*/


public String getType_of_wish() {
	return Type_of_wish;
}
public boolean isClean_motor() {
	return clean_motor;
}
public void setClean_motor(boolean clean_motor) {
	this.clean_motor = clean_motor;
}
public void setType_of_wish(String type_of_wish) {
	Type_of_wish = type_of_wish;
}
public boolean isWater() {
	return water;
}
public void setWater(boolean water) {
	this.water = water;
}
public boolean isClean_glass() {
	return clean_glass;
}
public void setClean_glass(boolean clean_glass) {
	this.clean_glass = clean_glass;
}
public boolean isClean_tires() {
	return clean_tires;
}
public void setClean_tires(boolean clean_tires) {
	this.clean_tires = clean_tires;
}
public boolean isClean_theChairs() {
	return clean_theChairs;
}
public void setClean_theChairs(boolean clean_theChairs) {
	this.clean_theChairs = clean_theChairs;
}

	public String toString() {
		return( super.toString()+"isWater /"+isWater()+"isClean_glass /"+isClean_glass()+"isClean_tires / "
				+isClean_tires()+"isClean_theChairs ");
	}
	
	
	
	
	
	
	
	
}


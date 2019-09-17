package carcare;

public class Car extends Insurance {
	
    
	private String Car_Id;
	private String color;
	private String status;
	private String Engine_Power;
	private int year;
	private String Car_Description;
	private String Make;
	private String Model;
	private boolean OWNERcar;
	

	public Car() {
		super(null, 0);
		printInsuranceROLE();
	}

	public Car(String Own_Name, int Own_ID, String Car_Id, String color,
			String status, String Engine_Power, int year,
			String car_Description, String make, String model,boolean OWNERcar) {
		this();

		printInsuranceROLE();
		setOwn_Name(Own_Name);
		setOwn_ID(Own_ID);
		this.color = color;
		this.Car_Description = car_Description;
		this.Car_Id = Car_Id;
		this.Engine_Power = Engine_Power;
		this.Make = make;
		this.Model = model;
		this.status = status;
		this.year = year;
		this.OWNERcar=OWNERcar;
	}


	public String getCar_Id() {
		return Car_Id;
	}

	public void setCar_Id(String car_Id) {
		Car_Id = car_Id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEngine_Power() {
		return Engine_Power;
	}

	public void setEngine_Power(String engine_Power) {
		Engine_Power = engine_Power;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCar_Description() {
		return Car_Description;
	}

	public void setCar_Description(String car_Description) {
		Car_Description = car_Description;
	}

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public boolean getOWNERcar() {
		return OWNERcar;
	}

	public void setOWNERcar(boolean OWNERcar) {
		this.OWNERcar = OWNERcar;
	}

	public String toString() {
		return (super.toString() + "\nCar_Id : " + "  " + getCar_Id() + " "
				+ "\ncolor : " + " " + getColor() + " " + "\nModel : " + " "
				+ getModel() + " " + "\nStatus : " + " " + getStatus() + " "
				+ "\nEngine_Power : " + " " + getEngine_Power() + " "
				+ "\nYear : " + " " + getYear() + " "
				+ "\n\nCar_Description : " + " " + getCar_Description() + " "
				+ "\n\nMake : " + " " + getMake() + " " + getModel() + " "
				+ "\nOWNERcar : " + " " + getOWNERcar());

	}

}

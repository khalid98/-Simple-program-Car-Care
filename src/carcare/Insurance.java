package carcare;

public class Insurance {

	// Data field
	private String Own_Name;
	private int Own_ID;

	// constructors
	//public Insurance() {
	//}

	public Insurance(String own_Name, int own_ID) {

		 Own_Name = own_Name;
		 Own_ID = own_ID;

	}

	// methods

	public String getOwn_Name() {
		return Own_Name;
	}

	public int getOwn_ID() {

		return Own_ID;
	}

	public void setOwn_Name(String own_Name) {
		Own_Name = own_Name;
	}

	public void setOwn_ID(int own_ID) {
		Own_ID = own_ID;
	}

	public String toString() {
		return ("The Own Name : " + " " + getOwn_Name() + "\nThe Own ID : "
				+ " " + getOwn_ID());
	}

	public void printInsuranceROLE() {
		System.out.println("It is a comprehensive insurance system that restores your car as a new one with full repair at "
				+ "the best service centers without any follow up from you.\n"
				+ "The Contact Club Club undertakes all procedures and administrative "
				+ "and financial documents related to the accident such as notification of accident and inspection.\nbefore"
				+ " and after repairs and payment of the repair bill immediately after the completion of the repairs.\n"
				+ "\n"
				+ "With this service there are many other benefits for the service and"
				+ " without any additional cost Club Connect service offers you an alternative car free of charge,\n"
				+ "transfer your car for free from the scene to the place of repair, limousine free to connect you from the scene to the place you want,\nwith a hotline to serve you 24 hours 7 days a week.\n"
				+ "\n"
				+ "In addition, you can take advantage of all these services with the installment of the value of the document on 12 months without interest with\nthe multiplicity and ease of payment methods,"
				+ "and also offer a discount in the case of non-claim\n\n");
	}

}

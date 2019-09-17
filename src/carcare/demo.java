package carcare;

import java.util.*;

public class demo {
	
	static int numberCAR = 1000;
	static int  count = 0;

	public static void main(String[] args) {
		Insurance[] Insur = new Insurance[numberCAR];

		Insur[count++] = new Car("moaz", 1154625, "01412", "red", "good", "24",
				2017, "mr", "ghg", "hjgfh", true);
		Insur[count++] = new Car("ismail", 1154625, "01412", "red", "good",
				"24", 2017, "mr", "ghg", "hjgfh", true);
		Insur[count++]=new Insurance("ismail", 1412);
		Insur[count++]=new Cleaning("1256","gdnj855d", "oudi","automatic" 
				, true, true, true, true, true);
		Cleaning c1;
		c1=(Cleaning) new Insurance(null, 0);

		String T = null, WD = null;
		int RCN = 0, MA = 0, SSN = 0;
		double RCB = 0.0;
		boolean Checking = false;

		String n1;
		int id1;

		// @SuppressWarnings("resource")

		Scanner Input = new Scanner(System.in);
		int C;
		char Answer = 'A', W = 'Y';

		while (Answer == 'A' || Answer == 'a') {

			displayMenu();
			System.out.println("Enter Your Choice Sir/Madam : ");
			C = Input.nextInt();

			switch (C) {
			case 1:

				String N,
				CM,
				CL,
				CP,
				CC,
				CS,
				CD,
				CID;
				boolean OWNERcar = true;
				int CY,
				tele;

				System.out.println("IF you the owner of the car? \t Enter Y ");
				W = Input.next().charAt(0);

				if (W == 'Y' || W == 'y') {
					OWNERcar = true;

					System.out.println("Please Enter Your Name Sir/Madam : ");
					N = Input.next();

					System.out
							.println("Please Enter Your telephone Sir/Madam : ");
					tele = Input.nextInt();

				} else {
					N = null;
					tele = 0;
					OWNERcar = false;
				}

				System.out.println("Please Enter Your Car_ID Sir/Madam : ");
				CID = Input.next();

				System.out.println("Please Enter Your Car_Make Sir/Madam : ");
				CM = Input.next();

				System.out.println("Please Enter Your Car_Model Sir/Madam : ");
				CL = Input.next();

				System.out.println("Please Enter Your Car_Year Sir/Madam : ");
				CY = Input.nextInt();

				System.out
						.println("Please Enter Your Car_EnginePower Sir/Madam : ");
				CP = Input.next();
				// c1.setEngine_Power(CP);

				System.out.println("Please Enter Your Car_Color Sir/Madam : ");
				CC = Input.next();

				System.out.println("Please Enter Your Car_Status Sir/Madam : ");
				CS = Input.next();

				System.out
						.println("Please Enter Your Car_Description Sir/Madam : ");
				CD = Input.next();

				for (int i = 0; i < count; i++) {
					if (Insur[i].getOwn_ID() != tele
							&& Insur[i].getOwn_Name() != N) {
						if (i == count - 1) {
							Insur[count] = new Car(N, tele, CID, CC, CS, CP,
									CY, CD, CM, CL, OWNERcar);

							System.out
									.println("Thanks Sir/Madam For Entering The Information :)\n and here is Your Information : \n");
							System.out.println(Insur[count].toString() + "\n");
							count++;
						}
					} else {
						System.out
								.println("Sorry but your name and your number are registered in the data store...\n");
						System.out.println(Insur[i].toString() + "\n");
					}

				}

				System.out
						.println("If There is a Mistake in This Information Please Redo The Whole Process\nThanks!");
				break;

			case 2:

				System.out
						.println("Please Enter telephone Sir/Madam : ");

				id1 = Input.nextInt();
				for (int i = 0; i < count + 1; i++) {

					if (Insur[i].getOwn_ID() == id1) {

						String ION;
						int IID;

						System.out
								.println("Please Enter Your Name Sir/Madam : ");
						ION = Input.next();
						// I1.setOwn_Name(ION);

						System.out
								.println("Please Enter Your Insurance_ID Sir/Madam : ");
						IID = Input.nextInt();
						// I1.setOwn_ID(IID);

						Insur[count] = new Insurance(ION, IID);

						System.out
								.println("Thanks Sir/Madam For Entering The Information :)\nand here is Your Information : \n");
						System.out.println(Insur[count].toString() + "\n");
						count++;
					} else {
						if (i == count - 1)
							System.out
									.println("Sorry but your name and your number are not registered in the data store...\n");
					}
				}
				System.out
						.println("If There is a Mistake in This Information Please Redo The Whole Process\nThanks!");
				break;
			case 3:

				System.out
						.println("Please Enter Your telephone Sir/Madam : ");

				id1 = Input.nextInt();
				for (int i = 0; i < count + 1; i++) {

					if (id1 == Insur[i].getOwn_ID()) {

						Maintenanc(RCN, T, SSN, RCB, WD, MA, 0, Checking);

						Insur[count] = new Maintenance(RCN, T, SSN, RCB, WD,
								MA, Checking);

						System.out
								.println("Thanks Sir/Madam For Entering The Information :)\nand here is Your Information : \n");
						System.out.println(Insur[count].toString() + "\n");
						count++;
					} else {
						if (i == count - 1)
							System.out
									.println("Sorry but your name and your number are not registered in the data store...\n");
					}
				}
				break;

			case 4:

				System.out.println("Please Enter Your telephone Sir/Madam : ");
				id1 = Input.nextInt();
				for (int i = 0; i < count; i++) {

					if (id1 == Insur[i].getOwn_ID()) {

						if (Insur[i] instanceof Maintenance) {
							if (((Maintenance) Insur[i]).isChecking()) {
								Maintenanc(RCN, T, SSN, RCB, WD, MA, 1000,
										Checking);

							} else
								System.out
										.println("No Maintenance Needed Sir/Madam Thanks :)");

						}
					} else if (i == count)
						System.out
								.println("Sorry but your name and your number are not registered in the data store...\n");

				}

				break;

			case 5:
				for (int i = 0; i < count; i++) {
					if (Insur[i] instanceof Car)
						((Car) Insur[i]).toString();

					if (Insur[i] instanceof Maintenance)
						((Maintenance) Insur[i]).toString();

				}
				break;

			default:
				System.out.println("Enter number from 1 to 5");

				break;

			}

			System.out
					.println("Please Enter A To Continue Otherwise To Exit : ");
			Answer = Input.next().charAt(0);

		}
	}

	public static void displayMenu() {
		System.out.println("*********************************\n"
				+ "*Choose From The Following :\t*"
				+ "\n*********************************\n"
				+ "1-For Adding a New Car Information .\n"
				+ "2-For Insuring Your Car .\n"
				+ "3-For Your Car Maintenance .\n"
				+ "4-For Periodic Checking of Your Car .\n"
				+ "5-For Displaying some forms .\n" + "");
	}

	private static void Maintenanc(int RCN, String T, int SSN, double RCB,
			String WD, int MA, int x, boolean Checking) {
		Scanner Inputin = new Scanner(System.in);

		System.out.println("Please Enter Your repair Car Number Sir/Madam :");
		RCN = Inputin.nextInt();

		System.out
				.println("Please Enter Your Car manual or automatic Sir/Madam :");
		T = Inputin.next();

		System.out.println("Please Enter Your SSN_contract Sir/Madam :");
		SSN = Inputin.nextInt();

		System.out.println("Please Enter Your repair Car bill Sir/Madam :");
		RCB = Inputin.nextDouble();

		System.out
				.println("Please Enter Your Warranty description Sir/Madam :");
		WD = Inputin.next();

		System.out.println("Please Enter Your Car mile age Sir/Madam :");
		MA = Inputin.nextInt();

		if (MA - x >= 10000)
			Checking = true;
		else
			Checking = false;

		// TODO Auto-generated method stub

	}

	
	/*public static void b(Insurance I) {
		for (int i = 0; i < count; i++) {
			if (I[i] instanceof Car)
				((Car) I[i]).toString();

			if (I[i] instanceof Maintenance)
				((Maintenance) I[i]).toString();

		}/
		
	}*/
}

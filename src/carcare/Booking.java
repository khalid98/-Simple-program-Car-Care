package carcare;


import java.util.*;
import java.util.Date;

public class Booking extends Car {

	Scanner input = new Scanner(System.in);

	private int pay;
	private int booking_id;
	private String booking_description;
	private Date date = new Date();
	private String booking_type;

	Booking() {
		System.out.println("/********************************************/");
		System.out.println("/t/t booking_ticket  ");
		System.out.println("/********************************************/");

		super.toString();
	}

	Booking( String CarId, String CarKind, Date date, int pay) {
	
		System.out.println("/********************************************/");
		System.out.println("/t/t booking_ticket  ");
		System.out.println("/********************************************/");

		toString();
		
		setCar_Id(CarId);
		setModel(CarKind);
		this.date = date;
		this.pay = pay;
	}

	
	
	
	public void setDate(Date date) {
		this.date = date;
	}

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public String getBooking_description() {
		return booking_description;
	}

	public void setBooking_description(String booking_description) {
		this.booking_description = booking_description;
	}

	public String getBooking_type() {
		return booking_type;
	}

	public void setBooking_type(String booking_type) {
		this.booking_type = booking_type;
	}

	public Date getDate() {
		return this.date;
	}

	public void setBookingNumber(final int booking_id) {
		this.booking_id = booking_id;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public void choice() {
		int ch;
		System.out.print("Enter your choice : ");
		ch = input.nextInt();

		switch (ch) {

		case 1:
			Add();
			break;

		case 2:
			Edit();
			break;

		case 3:
			Cancel();
			break;

		}
	}

	public void Cancel() {
		
		setBooking_description(null);
		setBooking_id(0);
		setBooking_type(null);
		setBookingNumber(0);
		setDate(null);
		
	}

	public void Add() {
		String C_M_O, Reason_for_booking;

		System.out.println("Enter car model : ");
		C_M_O = input.next();
		setModel(C_M_O);

		System.out.println("Enter Reason_for_booking :\tCleaning or Maintenance or  Insurance ");
		Reason_for_booking = input.next();
		booking_type=Reason_for_booking;

	}

	private void Menu() {
		System.out.print("1.Edit for model..");
		System.out.print("2.Edit for Reason..");
	}

	public void Edit() {
		String C_M_O;
		C_M_O = input.next();
		System.out.println("Enter car model : ");
		if (C_M_O == getModel()) {

			Menu();
			int cho;
			System.out.print("Enter your choice : ");
			cho = input.nextInt();
			switch (cho) {
			case 1:
				String NewModel, NeWReason;

				System.out.println("Enter car model : ");
				NewModel = input.next();
				setModel(NewModel);

				break;

			case 2:

				System.out.println("Enter Reason_for_booking :\tCleaning or Maintenance or  Insurance ");
				NeWReason = input.next();
				booking_type=NeWReason;
				

				break;
			}

		} else
			System.out.println("Your choice not found!! ");
	}

}
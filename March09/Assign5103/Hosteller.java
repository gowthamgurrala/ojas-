package Assign5103;

public class Hosteller extends Student{

	double hostelFee;
	public Hosteller() {
	}
	public Hosteller(int studentId, String name, double examFee,double hostelFee) {
		super();
		this.hostelFee = hostelFee;
	}
	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + "]";
	}
	

}

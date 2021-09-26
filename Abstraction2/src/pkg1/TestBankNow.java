package pkg1;

public class TestBankNow {

	public static void main(String[] args) {
		AbstractClassBank b= new SBI();
		int interest=b.getRateOfInterest();
		
		System.out.println("The Rate of Interst is : "+interest+"%");
	}
}

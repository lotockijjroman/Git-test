
public class TestTax {

	public static void main(String[] args) {
		
		//Tax t = new Tax();
		NJTax t = new NJTax(); 
		
			t.grossIncome = 50000;
			t.numberOfDependents = 2;
			t.state = "NJ";
			
			double yourTax =t.calcTax();
			
			double tjs = t.adjustForStudents(yourTax);
			
			System.out.println("Your tax is"  + " " + tjs);
		}
	}



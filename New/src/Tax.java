
public class Tax {
	
	int numberOfDependents;
	double grossIncome;
	String state;
	
	
	public double calcTax(){
		
		if (grossIncome < 40000){
			return grossIncome*0.06;
		}else{
			return grossIncome*0.08;
		}
	}
}


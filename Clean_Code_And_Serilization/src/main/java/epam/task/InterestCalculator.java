package epam.task;

public class InterestCalculator {
	
	public double simpleInterest(double princple,double duration,double rateofinterest){
		
		return (princple*duration*rateofinterest)/100;
		
		
	}
	public double  compoundInterest(double princple,double duration,double rateofinterest )
	{
		double  ci=princple*(Math.pow((1+(rateofinterest/100)),duration));
		ci=ci-princple;
		return ci;
	}
	
	

}

package epam.task;

public class HouseBuildingCostFinder {


	double cost=0;
	
	public double houseCost(String materialstandard,double area,String automated)
	{
		if (materialstandard.equals("StandardMaterials"))
		{
			
			cost=cost+(1200*area);
			
			
		}
		
		else if (materialstandard.equals("above standard materials"))
		{
			
			cost=cost+(1500*area);
			
			
			
			
		}
		else
		{
			if (automated.equals("yes" ))
			{cost=cost+(2500*area);
			}
			else
			{
				cost=cost+(1800*area);
			}
			
		}
		
		
	return(cost);	
	}

}

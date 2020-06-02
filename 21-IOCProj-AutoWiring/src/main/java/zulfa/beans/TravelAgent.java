package zulfa.beans;

public class TravelAgent {
private TourPlan tp;

public TravelAgent() {
System.out.println("TravelAgent:Constructor");	
}
public void setTp(TourPlan tp) {
	System.out.println("TravelAgent.setTp()");
	this.tp = tp;
}

public String tourBudgeting() {
	//get tour plan budget
	int count=tp.getPlaces().length;
	return tp.toString()+ " Having Budget Of :: Rs."+(count*5000);
}

}

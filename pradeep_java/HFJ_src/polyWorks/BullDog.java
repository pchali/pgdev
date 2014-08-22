package polyWorks;

public class BullDog extends Dog {
  private boolean willBiteYou;
  public BullDog(boolean bite, int weight, String name){
		 super(weight, name);
		 setBite(bite);
	 }
  
  public void setBite(boolean bite){
	  this.willBiteYou = bite;
  }
  
  public boolean getBite(){
	  return this.willBiteYou;
  }
  
  public String toString(){
	  String result;
	  result = "BullDog, Can bite --> "+willBiteYou+ "  " + super.toString();
	  return result;
  }
}

package polyWorks;

public class Animal {
  private int weight;
  private int height;
  public Animal (int weight){
	  setWeight(weight);
  }
  
  public int getWeight() {
	  return weight;
  }
  
  public void setWeight (int weight){
	  this.weight = weight;
  }
  
  public void setHeight (Animal inPet){
	  this.height=inPet.height;
	  this.weight=inPet.weight;
  }
  
  public int getHeight (){
	  return this.height;
  }
  public String toString(){
	  String result;
	  result = " I'm an animal weighing : "+ weight;
	  return result;
  }
}

package polyWorks;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Animal myPet = new Animal(12);
       Animal newPet = new Animal(99);
       
       Dog max = new Dog(34, "MAX");
       Dog rover = new Dog(34, "rover");
       BullDog devil = new BullDog (true, 80, "devil");
       if (max.equals(rover)){
    	   System.out.println("The dogs are equal");
       }
       else {
    	   System.out.println("Not equal dogs");
       }
       
       max.setName("Maxwell");
       max.setWeight(56);
       Cat fluffy = new Cat(12, "FLUFFY", true);
       
       // polymorphism below;
       foo(devil);foo(max);foo(myPet);foo(fluffy);
       myPet.setHeight(newPet);
       foo(newPet);
       foo(myPet);
       myPet.setHeight(devil);
       foo(myPet);   
	}
	
	public static void foo(Animal animal){
      System.out.println("IN foo: " + animal.toString());
      if (animal instanceof Cat){
    	  System.out.println("In foo: YEAH YEAH CAT");
      }
	}
}
	

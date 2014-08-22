package arrayPlay;

public class firstArray {
	int x;
	int[]  myArray;
	void setArray(){
		myArray = new int[5];
		myArray[0] = 33;
		myArray[1] = 13;
		myArray[2] = 23;
		myArray[3] = 783;
		myArray[4] = 334;
	}

	public void printArray() {
		// TODO Auto-generated method stub
		int i;
		for (i=0;i<myArray.length;i++){
			String myoutput;
			myoutput = "Element " + String.valueOf(i) + " is " + String.valueOf(myArray[i]);
			System.out.println(myoutput);
		}
	}
	
}

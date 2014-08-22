package deepStrings;

public class stringCCDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       stringCC firststring = new stringCC();
       stringCC secondstring = new stringCC();
       
       String tempstr;
       boolean same;
       double myrand;
       myrand = Math.random();
       System.out.println("myrand is "+myrand);
       tempstr = "Peter";
       String tempstr2, tempstr3;
       tempstr2 = "Peter";
       tempstr3 = "Peters";
       same = (tempstr == tempstr2);
       tempstr3 = tempstr3.substring(0, 5);
       same = tempstr.equals(tempstr3);
       firststring.name = "Peter";
       secondstring.name = "Peters"; 
       System.out.println("tempstr is <"+tempstr+">");
	   System.out.println("tempstr3 is <"+tempstr3+">");
	   System.out.println("The result is "+same);
	}

}

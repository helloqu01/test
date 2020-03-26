package GuguClass;

public class GuguClass {

	public static void main(String[] args) {
			int sum;
	
		for(int x = 1; x < 10 ; x++){
		   System.out.println("==="+x+"===");
		   for(int b = 1; b < 10; b++){
		      sum = x*b;
			  System.out.println(x+"*"+b+"="+sum);
		   }
		}
	}//main ed

}
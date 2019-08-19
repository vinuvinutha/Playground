import java.util.Scanner;
class Main{
	public static void main (String[] args){
	         
	     Scanner in  = new Scanner(System.in);
	     int n = in.nextInt();
      int sum =0;
         // Run for loop until it reaches the 2 * n
	     for(int count = 1; count <= n; count = count + 1)
	     {
	        sum=sum+count;
         }
	            System.out.println(sum);   
	       
	}
}

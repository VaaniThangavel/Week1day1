package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			 int n1=0;
			 int n2=1;
			 int sum;
		
			 System.out.println(n1+" " +n2);//printing 0 and 1  
			  
			 for(int i=2;i<=11;i++)//loop starts from 2 because 0 and 1 are already printed  
			 { 
			  sum=n1+n2;  
			  System.out.println(" "+ sum);  
			 n1=n2;  
			 n2=sum;  
			 }  
			}
	}



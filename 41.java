import java.util.*;
public class Main {
	public static void main(String[] args) {
		int cnt=0,sum=0;
		int x;
		double avg;
	    Scanner sc = new Scanner(System.in);
	    x=sc.nextInt();
	    
	    for(int i= 0; i<x; i++)  //0부터시작되는 수, 변수에서 임의 지정한 수
	    {
	    	sum += sc.nextInt();
	    }
	    
	    avg = (double)sum/x;                 //마지막의 대입과 편의를 위해 변형해줌
	    System.out.printf("avg : %.1f",avg);
					
		if(avg>=80)
			System.out.println("\npass ");
		else
			System.out.println("\nfail ");
	}
}

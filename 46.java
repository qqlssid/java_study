import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		 int x=0;
		 int sum =0;
		 
		 x=sc.nextInt();
		 for(int i=0; i<=x ;i++) {
			
			 if(i % 5==0) {
				sum+=i; }
		 }
			 System.out.print(sum);
		 
    } 	
}

//정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합을 구하여 출력하는 프로그램을 작성하시오.

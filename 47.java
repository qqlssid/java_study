import java.util.*;
public class Main {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		 int n=sc.nextInt();
		 int sum =0,cnt=0;
		 
		 
		 for(int i=1; i<=n ;i++) {
			
			 if(n<=100) {
				sum+=sc.nextInt(); //sc.nextInt()100 이하의 자연수 n을 입력 
				cnt++;		}
		 }
		System.out.printf("%.2f",((double)sum/cnt));
		 
    } 	
}
//100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오.

(평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)

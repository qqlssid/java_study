import java.util.*;
public class Main {
	public static void main(String[] args) {
		 int cnt=0,sum=0, x=0, y=0;
		 double avg=0;
		 
		 Scanner sc = new Scanner(System.in);
		 x = sc.nextInt();			
		 y = sc.nextInt();
		 
		 int max, min;
		 
		 max=(x>=y)? x:y;  //조건문? 진실:거짓 (x가 y보다 작을경우 진실[x]과 거짓[b]중 거짓[b]이다.)
		 min=(x<=y)? x:y;
		 
		 for(int i=min; i<=max ;i++) 
		 {
			if(i % 3 == 0 || i % 5 == 0) 
			{	
				sum += i;
				cnt++;
			}	
		 		 
		}
		avg = (double)sum/cnt;
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",avg);
    } 	
}
//두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 
//3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.

//(평균은 반올림하여 소수 첫째자리까지 출력한다.)

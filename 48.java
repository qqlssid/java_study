import java.util.*;
public class Main {
	public static void main(String[] args) {
		 int[] x= new int[10];
		 int cnt_1=0, cnt_2=0;
		 
		 Scanner sc = new Scanner(System.in);
		 for(int i=0; i<10 ;i++) 
		 {
			 x[i] = sc.nextInt();
		 }	
		 for(int i=0; i<10; i++) 
		{
			 if(x[i] % 2 == 0) {
				 cnt_2++;
			 }
			 if(x[i] % 2 != 0) { //1로나눈 숫자는 0으로 돌아간다. 다르다라는 연산자를 사용하면 된다.
				 cnt_1++;
			 }
		}
		System.out.println("even : "+cnt_2);
		System.out.print("odd : "+cnt_1);
    } 	
}
//10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.

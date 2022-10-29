import java.util.*;
public class Main {
	public static void main(String[] args) {	
		int n=0;
		int sum=0,cnt=0;
		
		 Scanner sc = new Scanner(System.in);
		 	n = sc.nextInt();
		 	
		 	for(int i=1; i<=n; i++) 
		 	{
		 		if(i % 2 == 1 && sum < n) //홀수를 구하는 값 && 합이 n의 값이 나올경우 멈춘다.
		 		{
			 		cnt++;
			 		sum+=i;
		 		}
		 		
		 		else continue;
		 		
		 	}
		 	System.out.println(cnt+" "+sum); //cnt[100까지 만들어지는 홀수들의 개수 1+3+5+7+9+...19의 값]sum[cnt의 개수 합의 값이 100이 된다.]
	 } 	
}
//자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 
//합이 n 이상이면 그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		int sum = 0;
		int x;
		
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		
		for	(int i = x; i <= 100; i++)
			sum += i;
		System.out.printf("%d\n",sum);	
	}
}
//100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.

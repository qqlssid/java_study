import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			System.out.print(a-b);
		}
		
		else if(b<a) {
			System.out.print(b-a);
		}
		
		else {
			
		System.out.println(b-a);
		}
	}

}
//두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.

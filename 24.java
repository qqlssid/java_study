
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		int a;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		a = sc.nextInt();
		
		if(a==0) {
			System.out.print("zero");
		}
		
		else if(a % 2 == 0) {
			System.out.print("plus");
		}
		
		else {
			
		System.out.println("minus");
		}
	}

}
//정수를 입력받아 0 이면 "zero" 양수이면 "plus" 음수이면 "minus" 라고 출력하는 프로그램을 작성하시오.

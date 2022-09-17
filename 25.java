import java.util.*;
public class Main {
	public static void main(String[] args) {
		int a;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		a = sc.nextInt();
		
		if (a % 400==0){
			System.out.print("leap year");
		}
		
		else if((a % 4==0) && (a % 100!=0)) {         //논리연산자를 넣을때는 괄호로 묶어줘야함
			System.out.print("leap year");
		}
		
		else {
			
		System.out.println("common year");
		}
	}
}

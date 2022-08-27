# java_study
package hello;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int x;
		int y;
		int z;
		
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();

		boolean a = ((x>y) && (x>z));             << x의 값이 가장 커야하기때문에 ">"표기함
                                              }괄호는 닫아주는것이 좋음
		boolean c = ((x==y) && (y==z));       
	

		System.out.print(a+" "+c);
	}

}


------------------------------------------------------

3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.

(JAVA는 1이면 true, 0이면 false를 출력한다.)

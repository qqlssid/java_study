import java.util.*;
public class java_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i;
		
		while(true) {
			i = scan.nextInt();
			if(i % 3==0 && 3==0) {
				System.out.println();
			}
			else if(i % 3 == 0) {
				System.out.println(i/3); //%는 나머지 값을 표기하는 것. 나머지를 구하기 위해선 /사용
			}
			else if(i==-1) {	
				break;
			}
		}
		
	}
}
//정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 
//3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
//-1이 입력되면 종료하는 프로그램을 작성하시오.
//Hint 3의 배수는 3으로 나눈 나머지가 0이다.

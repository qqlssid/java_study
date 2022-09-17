import java.util.*;
public class Main {
	public static void main(String[] args) {
		int i = 0;
		int y;
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {                        //반복적인 질문을 해야함
			System.out.println("number? ");      
			y = scan.nextInt();
			if(y>0)       //IF문을 사용하여 양수이면"positive integer",음수이면 "negative number"을 반복으로 만들어줌.
				System.out.print("positive integer\n");
			else if(y<0)
				System.out.println("negative number\n");
			else
				break;          //0이면 멈추도록 사용
		}
	}
}
한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)인지 출력하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int a,b;
			double x;
			char y;        //문자한개를 입력하기위함.
			while(true){
				System.out.print("Base = ");
				a = sc.nextInt();
				System.out.print("Height = ");
				b = sc.nextInt();
				x = (double)(a*b)/2;  //소수점이 됨으로 실수의 'double'을 넣어주어야함.
				System.out.println("Triangle width = "+x);
				System.out.print("Continue? ");
				y = sc.next().charAt(0);
				if (y == 'Y' || y == 'y')  
				{
					continue;   //반복을 도와줌
				}
				else {
					break;
				}
			}
	}

}

//삼각형의 밑변의 길이와 높이를 입력받아 넓이를 출력하고, "Continue? "에서 하나의 문자를 입력받아 그 문자가 'Y' 나 'y' 이면 작업을 반복하고 다른 문자이면 종료하는 프로그램을 작성하시오.
//(넓이는 반올림하여 소수 첫째자리까지 출력한다.)

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int x, cnt=0;    //cnt 평균을 구하기위한 숫자의 개수를 임의 표현
		while(true)    //"정수를 계속 입력받다가" 반복문
		{
			x = scan.nextInt();
			sum += x;
			cnt++;
			if(x>=100)
			{
				break;
			}
		}
		
		System.out.println(sum);
		System.out.printf("%.1f",((double)sum/cnt)); //실수"double"
	
		
	}
}

//정수를 계속 입력받다가 100 이상의 수가 입력이 되면 
//마지막 입력된 수를 포함하여 합계와 평균을 출력하는 프로그램을 작성하시오.
//(평균은 반올림하여 소수 첫째자리까지 출력한다.)

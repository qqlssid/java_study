import java.util.*;
public class Main {
	public static void main(String[] args) {
		double x,y,d_result;             <<실수형
		int i_result;                    <<정수형

		Scanner in = new Scanner(System.in);
		x = in.nextDouble();             <<실수형 double에는 Double로 확인하기
		y = in.nextDouble();
		
		d_result=x * y;
		i_result = (int)x * (int)y;
		
		System.out.printf("%d %d",(int)d_result,i_result);        
		
	}

}

--------------------------------------------------------------
  2개의 실수(double)를 입력 받아서 두 수의 곱을 정수로 변환한 결과값과 
  두 수를 각각 정수로 변환하여 곱을 구한 결과값을 출력하는 프로그램을 
  작성하고 프로그램 내용에 관한 설명을 주석으로 표시하시오.
 

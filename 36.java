import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int x,cnt=0;
		
		while(true) {
			x = sc.nextInt();
			if(x>100 || x<0) {    //100보다 클수도 있지만 0보다 작을수도있음(ex소수점)
				break;               //순서의 중요. 100까지의 정수로만 보기때문에 순차 확인후 "break"한다
			}
			sum += x;
			cnt++;
			
			
		}
		System.out.println("sum : "+sum);
		System.out.printf("avg : %.1f",((double)sum/cnt));  //("avg : ","%.1f")<의 쉼표는 필요가 없음."%.1f"
	}
}		
//0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 
//그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
//(평균은 반올림하여 소수 첫째자리까지 출력한다.)

import java.util.*;
public class Main {
	public static void main(String[] args) {
		int i;
		int odd_cnt=0, even_cnt=0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			i = sc.nextInt();
			if(i % 2 == 0 && i!=0) { //컴퓨터는 0도 나누어 계산하므로 비교연산자가 필요
				even_cnt++;
			}
			else if(i % 2 != 0 && i!=0) {
				odd_cnt++;
			}
			else if(i == 0) {
				break;
			}
		}
		System.out.println("odd : "+odd_cnt);  //2개이상의 문제일 경우 cnt의 개수가 어디의 개수인지 파악해줘야함.
		System.out.println("even : "+even_cnt);
	}
}

//0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
//0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
//홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.

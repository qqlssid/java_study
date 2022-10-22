import java.util.*;
public class Main {
	public static void main(String[] args) {	
		 
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();			  //자연수 입력
		 
		 for(int x=1; x<=10; x++)   
		 {		
				System.out.print(n*x+" ");    //1부터 증가하는 x를 자연수에 곱하여 배수를 만들어준다
		 	
		 }
	 } 	
}
//한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.

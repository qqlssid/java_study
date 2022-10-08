import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int cnt=0;
		
		while(true) {
			i = sc.nextInt();
			if (i==0) {
				break;
			}
			else if(i % 3==0 || i % 5==0) {        // '||'라는 논리 연산자를 붙여줌으로서 간단하게 처리가능
				continue;                   //반복
			}	
			else
				cnt++;           //개수들을 구함
				
		
		}
		System.out.println(cnt);
	}		
}		
//정빈's
package java_study;
import java.util.*;
public class java_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int cnt=0;
		
		while(true) {
			i = sc.nextInt();
			if (i==0) {
				break;
			}
			else if(i % 3==0) {       //
				System.out.println();    
			}	
			else if	(i % 5==0) 
				System.out.println();
			else
				cnt++;
				
		
		}
		System.out.println(cnt);
	}		
}		
0 이 입력될 때까지 정수를 계속 입력받아 3의 배수와 5의 배수를 제외한 수들의 개수를 출력하는 프로그램을 작성하시오.

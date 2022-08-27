# java_study
package hello;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		int x,y,z;
		double sum;
		
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		
		sum = (double)(x+y+z)/3;                           <<<더블
		
 		System.out.printf("%.1f",(double)sum);             <<<더블
	 	
	}

}


>>형식변환과 세부적[printf 와 println]신경쓰기

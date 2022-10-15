import java.util.*;
public class Main {
	public static void main(String[] args) {
		int cnt_3=0, cnt_5=0;
		int[] x = new int[10];
		
	    Scanner sc = new Scanner(System.in);      
	    for(int i=0; i<10; i++)  
	    {
	    	x[i] = sc.nextInt();
	    }
	    
	    for(int i=0; i<10; i++)
	    {
	    	if(x[i] % 3 == 0) {
				cnt_3++;
			}
	    	if (x[i] % 5 == 0) {      //(ex.15,30...) 3과5의 배수임으로 if로 써주는 것.
	    		cnt_5++;
			}
	    }
	    
	    System.out.println("Multiples of 3 : "+cnt_3);    //위의 계산식이 정리되면 출력
	  	System.out.println("Multiples of 5 : "+cnt_5);
	}
}
//10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.

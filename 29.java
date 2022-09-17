import java.util.*;
public class Main {
	public static void main(String[] args) {
		
	    int i = 0;
	    int x;           //:입력할 값
	    int sum=0;
    
	    Scanner sc = new Scanner(System.in);      
	    System.out.print("");
		  x = sc.nextInt();
		 
	    while (i < x) {         
	    	
	    	i++;
	    	sum+=i;
	    }
	    System.out.println(sum);
	}
}
//100 이하의 양의 정수만 입력된다.
while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.

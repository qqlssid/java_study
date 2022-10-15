import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
        if (n<=10)
        {
            for(int i=0; i<n ;i++)
            {
                System.out.println("JUNGOL");
            }
        }
        
    }
}
//^강사님의 풀이
//10 이하의 자연수 n을 입력받아 "JUNGOL​"을 n번 출력하는 프로그램을 작성하시오.

import java.util.*;
public class Main {
	public static void main(String[] args) {
	  
	int i=0;
	int n;
	
	 Scanner sc = new Scanner(System.in);
	 n=sc.nextInt();
	 
	while (n>i && n<=10) {
		System.out.println("JUNGOL​");
		i++;
		}
	}
}
//^내풀이

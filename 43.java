import java.util.*;
public class Main {
	public static void main(String[] args) {
	  
		
		
			for(int j = 2; j < 5; j++){  //j<5 5미만임으로 4초과로는 더이상의 줄 형성이 없어짐 
					
				{	for(int x = 1; x <= 5; x++) 
					System.out.print(j+" "+"*"+" "+x+" "+"="+"  "+(j)*x+"   ");	}	
		 System.out.println();
			}      //{}괄호의 묶임이 없으면 반복재생으로 넘어감
		
	}
}

import java.util.*;
public class Main {
	public static void main(String[] args) {
		int x,y, result ;          <<<x,y,변수값
		
		
		Scanner in = new Scanner(System.in);
		x = in.nextInt();                       
                                            }임의의 숫자 x,y
		y = in.nextInt();
		
		result = (x++)*(--y);
		
		System.out.println(x+" "+y+" "+result);
		

		
	}

}

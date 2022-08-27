# java_study

package hello;
import java.util.*;
public class javanew {
	public static void main(String[] args) {
		double x,y,z,d_result;
		int sum;
		
		Scanner in = new Scanner(System.in);
		x = in.nextDouble();
		y = in.nextDouble();
		z = in.nextDouble();
		
		d_result = (int)x+(int)y+(int)z;
		sum = (int)(x+y+z)/3;
	
		System.out.printf("sum "+(int)d_result+"\navg "+ sum);
		
	}

}


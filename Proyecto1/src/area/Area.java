package area;

import java.util.*;

public class Area {

	private static final double PI = 3.14;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio;
		
		System.out.print("Introduce un radio: ");
		
		radio = sc.nextDouble();
		
		System.out.println("El area es: " + (PI * radio * radio));
	}

}

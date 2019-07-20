// small application to give the gcd of two numbers

//@author Jonathan Flanagan

//filename Gcd.java

import java.util.Scanner;

public class Gcd{
	public static void main(String[] args) {
		int a;
		int b;

		Scanner keyboard;
		keyboard = new Scanner(System.in);

		System.out.print("What is a: ");
		a = keyboard.nextInt();
		System.out.print("What is b: ");
		b = keyboard.nextInt();


		while(a != b)
		{
			if(a > b)
				a -= b;
			else
				b -= a;
		}

		System.out.println("G.C.D = " +a);
	}
}
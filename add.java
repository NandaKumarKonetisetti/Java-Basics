import java.io.*;
import java.util.*;


class demo {
	public static void main(String args[]) {

		int a = 10, b = 20;
		a = b++;
		System.out.println(a);
		System.out.println(b);
		if (a < b) {
			System.out.println("A is less than b");
		} else {
			System.out.println("A is greater than b");
		}
		int p = 20, q = 75;
		if (p % 2 == 0) {
			System.out.println("P is an even number");
		} else {
			System.out.println("p is an odd number");
		}
		if (q % 2 != 0) {
			System.out.println("q is a odd number");
		} else {
			System.out.println("q is an even number");
		}
		int e, f;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value ");
	
		e = s.nextInt();
		System.out.println("Enter the another value to add");
		f = s.nextInt();
		int h = e+f;
		System.out.println("the sum of two given values is "+h);
		int ab =20,ac=19,af =22;
		if (ab>ac && ab>af )
		System.out.println("ab is greater than the remaining other two");
		else if (ac>ab && ac>af)
		System.out.println("ac is greater than the remaining other two");
		else if (af>ab && af>ac)
		System.out.println("af is greater than the remaining the other two");

	}
}
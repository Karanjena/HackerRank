package Method;

public class Addition {

	public static void add(byte a) {
		//int c=a+b;
		System.out.println("l");
	}
	public static void add(short a) {
		//int d=a+b+c;
		System.out.println("d");
	}
	public static void add(double a) {
		//int e=a+b+c+d;
		System.out.println("e");
	}

	/*
	 * public static void add(int a) { //int f=a+b+c+d+e; System.out.println("f");
	 */
	//}
	/*
	 * public static void add(long a) { //int c=a+b; System.out.println("k"); }
	 */

	/*
	 * public static void add(char a) { //int d=a+b+c; System.out.println("o"); }
	 */
	public static void add(float a) {
		//int e=a+b+c+d;
		System.out.println("p");
	}
	
	public static void main(String[] args) {
		Addition.add(77f);
		Addition.add(1);
		Addition.add(-127);
		Addition.add('A');
		Addition.add(1.1);
		Addition.add(176856779l);
		
		
	}
	
	
}

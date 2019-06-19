/**
 * 
 */
package lesson1;

/**
 * @author alokp
 *
 */
public class Increment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	
		int x = 10;
		System.out.println("Start value X");
		System.out.println(x++);
		System.out.println("after post increment");
		System.out.println(x);
		
		int y = 10;
		System.out.println("Start value Y");
		System.out.println(++y);
		System.out.println("after pre increment");
		System.out.println(y);
		
		int w = 20;
		System.out.println("Start value W");
		w /=10;
		System.out.println("Start value W");
		System.out.println(w);
		
		int a= 20;
		a *=10;
		System.out.println("after multiply");
		System.out.println(a);
	}

}

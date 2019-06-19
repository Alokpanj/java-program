package lesson1;

public class SwitchStatement {
	public static void main(String[] args) {
	int score = 100; // int score = 90,80,40,any value
	//byte , short, int , char
	switch (score)
	{
	// without break or break
	case 100:
		System.out.println("Very very very Good");
	case 95 :
		System.out.println("very very Good");
	case 90 :
		System.out.println("Very Good");
		break;
	case 70:
		System.out.println("Ok");
	case 80 :
		System.out.println("Good");
		break;
		
	case 40 :
		System.out.println("Poor");
		break;
		
		
  default :
		System.out.println("Greade not define");
		break;
	}
		
		
  }
}

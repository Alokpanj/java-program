package lesson1;

public class LogicalOperator {

	public static void main(String[] args) {

		int subject1 = 40;
		int subject2 = 60;
         // && AND 
		
		if ((subject1 >= 45) &&  (subject2 >=35 ))
		{
			System.out.println("Condition True");
		}
		else {
			System.out.println("Condition False");
		}
		
		int subject3 = 40;
		int subject4 = 60;
       //  || OR
		
		if ((subject3 >= 45) ||  (subject4 >=55 ))
		{
			System.out.println("Condition True");
		}
		else {
			System.out.println("Condition False");
		}
		
	}

}

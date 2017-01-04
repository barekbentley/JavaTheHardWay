import java.util.Scanner;

public class BMICaclculatorProject
{ 
	public static void main( String[] args )
	{	
		Scanner keyboard = new Scanner(System.in);
		double inches, lb, bmi;
		
		System.out.print( "Your height in inches?: " );
		inches = keyboard.nextDouble();
		
		
		System.out.print( "Your weight in pounds?: " );
		lb = keyboard.nextDouble();
		
		double m, kg;
		
		m = inches*0.0254;
		kg = lb*0.453592;
		
	
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
		}
}











































































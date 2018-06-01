/**
 * Tom Abraham
 * period # 1
 */
import java.util.Scanner;

public class Roots {
	/**
	 * calculate the roots of quadratic equations
	 */
	public void calculate() 
	{
		Scanner a = new Scanner(System.in);
			Scanner b = new Scanner(System.in);
			Scanner c = new Scanner(System.in);
			
			System.out.printf("%-45s", "Enter the coefficients a b and c for equation 1: ");
			double input1 = a.nextDouble();
			double input2 = a.nextDouble();
			double input3 = a.nextDouble();
			
			System.out.printf("%-45s", "Enter the coefficients a b and c for equation 2: ");
			double input4 = b.nextDouble();
			double input5 = b.nextDouble();
			double input6 = b.nextDouble();
			
			System.out.printf("%-45s", "Enter the coefficients a b and c for equation 3: ");
			double input7 = c.nextDouble();
			double input8 = c.nextDouble();
			double input9 = c.nextDouble();
			
			double e1_root1 = (-input2 + Math.sqrt((input2*input2) - (4*input1*input3))) / (2*input1);
			double e1_root2 = (-input2 - Math.sqrt((input2*input2) - (4*input1*input3))) / (2*input1);
			double e2_root1 = (-input5 + Math.sqrt((input5*input5) - (4*input4*input6))) / (2*input4);
			double e2_root2 = (-input5 - Math.sqrt((input5*input5) - (4*input4*input6))) / (2*input4);
			double e3_root1 = (-input8 + Math.sqrt((input8*input8) - (4*input7*input9))) / (2*input7);
			double e3_root2 = (-input8 - Math.sqrt((input8*input8) - (4*input7*input9))) / (2*input7);


			//System.out.printf("%n");
			System.out.printf("%20s %9s %9s %10s %10s%n", "a:", "b:", "c:", "root1:", "root2:");
			System.out.printf("%10s %9.2f %9.2f %9.2f %9.2f %9.2f%n", "#1", input1, input2, input3, e1_root1, e1_root2);
			System.out.printf("%10s %9.2f %9.2f %9.2f %9.2f %9.2f%n", "#2", input4, input5, input6, e2_root1, e2_root2);
			System.out.printf("%10s %9.2f %9.2f %9.2f %9.2f %9.2f%n", "#3", input7, input8, input9, e3_root1, e3_root2);

	}
}

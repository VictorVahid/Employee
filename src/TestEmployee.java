import java.util.Locale;
import java.util.Scanner;

public class TestEmployee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		UserData emp = new UserData();

		System.out.println("Name: ");
		emp.Name = sc.nextLine();
		System.out.println("Gross Salary: ");
		emp.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		emp.Tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + emp);
		System.out.println();
		System.out.println("Which percentage to increase salary?: ");
		double percentage = sc.nextDouble();
		emp.IncressSalary(percentage);

		System.out.println();
		System.out.println("Update data: "+ emp);

	}
}
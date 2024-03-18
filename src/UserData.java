public class UserData {
	public String Name;
	public double GrossSalary;
	public double Tax;

	public double NetSalary() {
		return GrossSalary - Tax;
	}

	public void IncressSalary(double Percetage) {
		GrossSalary += GrossSalary * Percetage / 100.0;
	}

	public String toString() {
		return Name + ", $" + String.format("%.2f", NetSalary());
	}
}

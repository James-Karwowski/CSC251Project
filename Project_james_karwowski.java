import java.util.Scanner;

public class Demo{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the Policy Number: ");
		int number = in.nextInt();
		System.out.print("Please enter the Provider Name: ");
		String provider = in.nextLine();
		provider = in.nextLine();
		System.out.print("Please enter the Policyholder's First Name: ");
		String firstN = in.nextLine();
		System.out.print("Please enter the Policyholder's Last Name: ");
		String lastN = in.nextLine();
		System.out.print("Please enter the Policyholder's Age: ");
		int age = in.nextInt();
		System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
		String status = in.nextLine();
		status = in.nextLine();
		System.out.print("Please enter the Policyholder's Height: ");
		double height = in.nextDouble();
		System.out.print("Please enter the Policyholder's Weight: ");
		double weight = in.nextDouble();
		
		Policy newPolicy = new Policy(number, provider, firstN, lastN, age, status, height, weight);
		
		System.out.println("Policy Number: " + newPolicy.getPolicyNumber());
		System.out.println("Provider Name: " + newPolicy.getProvider());
		System.out.println("Policyholder's First Name: " + newPolicy.getFirstName());
		System.out.println("Policyholder's Last Name: " + newPolicy.getLastName());
		System.out.println("Policyholder's Age: " + newPolicy.getAge());
		System.out.println("Policyholder's Smoking Status: " + newPolicy.getSmokingStatus());
		System.out.println("Policyholder's Height: " + newPolicy.getHeight());
		System.out.println("Policyholder's Weight: " + newPolicy.getWeight());
		System.out.println("Policyholder's BMI: " + newPolicy.findHolderBMI());
		System.out.println("Policy Price: " + newPolicy.policyPrice());
	}
}
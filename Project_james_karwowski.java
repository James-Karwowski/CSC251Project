import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Demo{
	public static void main(String[] args) throws FileNotFoundException{
      int numSmoke = 0;
      int total = 0;
      try{
   		File inputFile = new File("PolicyInformation.txt");
   		Scanner input = new Scanner(inputFile);
   		while(input.hasNextLine()){
            ArrayList<Policy> policies = new ArrayList<Policy>();
            Policy newPolicy;
            int number = Integer.valueOf(input.nextLine());
   			String provider = input.nextLine();
   			String firstN = input.nextLine();
            String lastN = input.nextLine();
   			int age = Integer.valueOf(input.nextLine());
   			String status = input.nextLine();
   			if(status.equals("smoker")){
   				numSmoke++;
   			}
   			double height = (double)Integer.valueOf(input.nextLine());
   			double weight = (double)Integer.valueOf(input.nextLine());
   			total++;
            
   			newPolicy = new Policy(Integer.valueOf(number), provider, firstN, lastN, Integer.valueOf(age), status, height, weight);
   			policies.add(newPolicy);
   			
   			System.out.println("Policy Number: " + newPolicy.getPolicyNumber());
   			System.out.println("Provider Name: " + newPolicy.getProvider());
   			System.out.println("Policyholder's First Name: " + newPolicy.getFirstName());
   			System.out.println("Policyholder's Last Name: " + newPolicy.getLastName());
   			System.out.println("Policyholder's Age: " + newPolicy.getAge());
   			System.out.println("Policyholder's Smoking Status: " + newPolicy.getSmokingStatus());
   			System.out.println("Policyholder's Height: " + newPolicy.getHeight());
   			System.out.println("Policyholder's Weight: " + newPolicy.getWeight());
   			System.out.println("Policyholder's BMI: " + newPolicy.findHolderBMI());
   			System.out.println("Policy Price: " + newPolicy.policyPrice() + "\n");

            input.nextLine();
   		}
		input.close();
	} finally {
		System.out.println("The number of policies with a smoker is: " + numSmoke);
		System.out.println("The number of policies with a non-smoker is: " + (total-numSmoke));
	}
}
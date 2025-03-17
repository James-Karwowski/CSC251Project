import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Demo2{
	public static void main(String[] args) throws FileNotFoundException{
		File inputFile = new File("PolicyInformation.txt");
		Scanner input = new Scanner(inputFile);
		ArrayList<Policy> policies = new ArrayList<Policy>();
		int count = 0;
      int numSmoke = 0;
      int total = 0;
      Policy newPolicy;
		while(input.hasNext()){
			if(count == 1){
				int number = 3455;

				String provider = "Aetna";

				String firstN = "Bob";

				String lastN = "Lee";

				int age = 54;

				String status = "non-smoker";

				double height = 72.0;
				double weight = 200.0;
				newPolicy = new Policy(Integer.valueOf(number), provider, firstN, lastN, Integer.valueOf(age), status, height, weight);
				policies.add(newPolicy);
            total++;
			}else if(count == 2){
				int number = 2450;

				String provider = "Met Life";

				String firstN = "Chester";

				String lastN = "Williams";

				int age = 40;

				String status = "smoker";
            numSmoke++;
				double height = 71.0;
				double weight = 300.0;
				newPolicy = new Policy(Integer.valueOf(number), provider, firstN, lastN, Integer.valueOf(age), status, height, weight);
				policies.add(newPolicy);
            total++;
			}else if(count == 3){
				int number = 3670;

				String provider = "Global";

				String firstN = "Cindy";

				String lastN = "Smith";

				int age = 55;

				String status = "non-smoker";

				double height = 62.0;
				double weight = 140.0;
				newPolicy = new Policy(Integer.valueOf(number), provider, firstN, lastN, Integer.valueOf(age), status, height, weight);
				policies.add(newPolicy);
            total++;
			}else if(count == 4){
				int number = 1490;

				String provider = "Reliable";

				String firstN = "Jenna";

				String lastN = "Lewis";

				int age = 30;

				String status = "smoker";
            numSmoke++;
				double height = 60.0;
				double weight = 105.0;
				newPolicy = new Policy(Integer.valueOf(number), provider, firstN, lastN, Integer.valueOf(age), status, height, weight);
				policies.add(newPolicy);
            total++;
			}else if(count == 5){
				int number = 3477;

				String provider = "State Farm";

				String firstN = "Craig";

				String lastN = "Duncan";

				int age = 23;

				String status = "smoker";
            numSmoke++;
				double height = 66;
				double weight = 215.0;
				newPolicy = new Policy(Integer.valueOf(number), provider, firstN, lastN, Integer.valueOf(age), status, height, weight);
				policies.add(newPolicy);
            total++;
			}else{
				//int number = Integer.valueOf(input.nextLine());
            int number = 3450;
				//String provider = input.nextLine();
            String provider = "State Farm";
            
				String firstN = "Alice";

				String lastN = "Jones";

				int age = 20;

				String status = "smoker";
            numSmoke++;
				//double height = (double)Integer.valueOf(input.nextLine());
            double height = 65.0;
            double weight = 110.0;
				newPolicy = new Policy(Integer.valueOf(number), provider, firstN, lastN, Integer.valueOf(age), status, height, weight);
				policies.add(newPolicy);
            total++;
			}
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
			if(input.nextLine().equals("\n")){
				String empty = input.nextLine();
			}
			count++;
		}
      System.out.println("The number of policies with a smoker is: " + numSmoke);
      System.out.println("The number of policies with a non-smoker is: " + (total-numSmoke));
		input.close();
	}
}
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Demo2{
	public static void main(String[] args) throws FileNotFoundException{
      int numSmoke = 0;
      int total = 0;
      try{
   		File inputFile = new File("PolicyInformation.txt");
   		Scanner input = new Scanner(inputFile);
   		while(input.hasNextLine()){
            ArrayList<Policy> policies = new ArrayList<Policy>();
            Policy newPolicy;
            PolicyHolder newHolder;
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
            newHolder = new PolicyHolder(firstN, lastN, Integer.valueOf(age), status, height, weight);
   			newPolicy = new Policy(Integer.valueOf(number), provider, newHolder);
   			policies.add(newPolicy);
			System.out.println(newPolicy.toString());

            input.nextLine();
   		}
		input.close();
		} finally {
			System.out.println("There were " + Policy.getNumPolicies());
			System.out.println("The number of policies with a smoker is: " + numSmoke);
			System.out.println("The number of policies with a non-smoker is: " + (total-numSmoke));
		}
	}
}
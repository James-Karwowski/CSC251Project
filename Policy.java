public class Policy{
	private int number;
	private String provName;
	private PolicyHolder holder;
	private static int numPolicies;
	
	/**
	This Policy constructor has no parameters sets each private variable in
	the Policy class to an empty value.
	**/
	public Policy(){
		number = 0;
		provName = "";
		holder = new PolicyHolder();
		numPolicies++;
	}
	
	/**
	This Policy constructor has has parameters that set each private variable in
	the Policy class.
	@param num Policy Number
	@param provider Policy Provider
	**/
	public Policy(int num, String provider, PolicyHolder policyHolder){
		number = num;
		provName = provider;
		holder = policyHolder;
		numPolicies++;
	}
	/**
	This method returns the number of policies created.
	@return numPolicies The number of policies created.
	**/
	public static int getNumPolicies(){
		return numPolicies;
	}
	/**
	This method changes the Policy number variable.
	@param num The New Policy Number
	**/
	public void setPolicyNumber(int num){
		number = num;
	}
	/**
	This method changes the Policy provider variable.
	@param variable The New Policy Provider
	**/
	public void setProvider(String variable){
		provName = variable;
	}
	/**
	This method returns the Policy Number.
	@return number Policy Number
	**/
	public int getPolicyNumber(){
		return number;
	}
	/**
	This method returns the Policy Number.
	@return provName
	**/
	public String getProvider(){
		return provName;
	}
	/**
	This method returns the price for the policy based on age, smoking status,
	and BMI.
	@return smokeStatus
	**/
	public int policyPrice(){
		int price = 600;
		if(holder.getAge() > 50){
			price += 75;
		}
		if(holder.getSmokingStatus().equals("smoker")){
			price += 100;
		}
		if(holder.findHolderBMI() > 35){
			price += 20 * (holder.findHolderBMI() - 35);
		}
      return price;
	}
	@Override
	public String toString(){
		return "Policy Number: " + number + "\nProvider Name: " + provName + holder.toString() + "\nPolicy Price: " + this.policyPrice() + "\n";
	}
}
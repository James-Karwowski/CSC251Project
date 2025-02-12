public class Policy{
	private int number;
	private String provName;
	private String first;
	private String last;
	private int age;
	private String smokeStatus;
	private double height;
	private double weight;
	private double bmi;
	
	public Policy(){
		number = 1234;
		provName = "Generic";
		first = "John";
		last = "Doe";
		age = 21;
		smokeStatus = "non-smoker";
		height = 66;
		weight = 250;
	}
	
	public Policy(int num, String provider, String frt, String lst, int holderAge, String status, double h, double w){
		number = num;
		provName = provider;
		first = frt;
		last = lst;
		age = holderAge;
		smokeStatus = status;
		height = h;
		weight = h;
	}
	
	public void setPolicyNumber(int num){
		number = num;
	}
	
	public void setProvider(String variable){
		provName = variable;
	}
	
	public void setFirstName(String variable){
		first = variable;
	}
	
	public void setLastName(String variable){
		last = variable;
	}
	
	public void setAge(int variable){
		age = variable;
	}
	
	public void setSmokingStatus(String variable){
		smokeStatus = variable;
	}
	
	public void setHeight(double variable){
		height = variable;
	}
	
	public void setWeight(double variable){
		weight = variable;
	}
	
	public int getPolicyNumber(){
		return number;
	}
	
	public String getProvider(){
		return provName;
	}
	
	public String getFirstName(){
		return first;
	}
	
	public String getLastName(){
		return last;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getSmokingStatus(){
		return smokeStatus;
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double findHolderBMI(){
		bmi = (weight * 703) / (height * height);
		return bmi;
	}
	
	public int policyPrice(){
		int price = 600;
		if(age > 50){
			price += 75;
		}
		if(smokeStatus.equals("smoker")){
			price += 100;
		}
		if(bmi > 35){
			price += 20 * (bmi - 35);
		}
      return price;
	}
}
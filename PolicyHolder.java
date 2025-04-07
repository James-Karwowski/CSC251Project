public class PolicyHolder{
	private String first;
	private String last;
	private int age;
	private String smokeStatus;
	private double height;
	private double weight;
	private double bmi;
	/**
	This Policy constructor has no parameters sets each private variable in
	the Policy class to an empty value.
	**/
	public PolicyHolder(){
		first = "";
		last = "";
		age = 0;
		smokeStatus = "";
		height = 0;
		weight = 0;
	}
	
	/**
	This Policy constructor has has parameters that set each private variable in
	the Policy class.
	@param num Policy Number
	@param provider Policy Provider
	@param frt Holder First Name
	@param lst Holder Last Name
	@param holderAge Age of Policyholder
	@param status Smoking Status
	@param h Height
	@param w Weight
	**/
	public Policy(String frt, String lst, int holderAge, String status, double h, double w){
		first = frt;
		last = lst;
		age = holderAge;
		smokeStatus = status;
		height = h;
		weight = h;
	}
	/**
	This method changes the Policy firstName variable.
	@param variable The New First Name
	**/
	public void setFirstName(String variable){
		first = variable;
	}
	/**
	This method changes the Policy lastName variable.
	@param variable The New Last Name
	**/
	public void setLastName(String variable){
		last = variable;
	}
	/**
	This method changes the Policy age variable.
	@param variable The replacement Age
	**/
	public void setAge(int variable){
		age = variable;
	}
	/**
	This method changes the Policy smokeStatus variable.
	@param variable The Updated smoking status
	**/
	public void setSmokingStatus(String variable){
		smokeStatus = variable;
	}
	/**
	This method changes the Policy height variable.
	@param variable The New Height
	**/
	public void setHeight(double variable){
		height = variable;
	}
	/**
	This method changes the Policy weight variable.
	@param variable The New weight
	**/
	public void setWeight(double variable){
		weight = variable;
	}
	public String getFirstName(){
		return first;
	}
	/**
	This method returns the Policy holder's last name.
	@return last
	**/
	public String getLastName(){
		return last;
	}
	/**
	This method returns the holder's age.
	@return age
	**/
	public int getAge(){
		return age;
	}
	/**
	This method returns the holder's smoking status.
	@return smokeStatus
	**/
	public String getSmokingStatus(){
		return smokeStatus;
	}
	/**
	This method returns the holder's height.
	@return smokeStatus
	**/
	public double getHeight(){
		return height;
	}
	/**
	This method returns the holder's smoking status.
	@return weight
	**/
	public double getWeight(){
		return weight;
	}
	/**
	This method calculates and finds the BMI of the policyholder.
	@return bmi
	**/
	public double findHolderBMI(){
		bmi = (weight * 703) / (height * height);
		return bmi;
	}
}
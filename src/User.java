/**
 * 
 * @author  simran bhamra and marissa shores
 * This class includes information about the user 
 */
public class User {
	
	protected String fName; 
	protected String lName; 
	protected String userPhone; 
	protected String userDept;
	protected String userEmail;
	
	/**
	 * default constructor
	 */
	public User () 
	{
		fName ="";
		lName ="";
		userPhone ="";
		userDept = "";
		userEmail = "";
	}
	/**
	 * constructor 
	 * @param fName String
	 * @param lName String
	 * @param userPhone String
	 * @param userDept String
	 * @param userEmail String
	 */
	public User (String fName, String lName, String userPhone, String userDept, String userEmail) 
	{
		this.fName = fName; 
		this.lName = lName; 
		this.userPhone = userPhone; 
		this.userDept = userDept; 
		this.userEmail = userEmail;
		
	}
	/**
	 * toString method which prints out formatted output 
	 */
	
	public String toString()
	{
		String str = fName + "\n" + lName + "\n" + userPhone + "\n" + userDept + "\n" + userEmail;
		return str;
	}

	/**
	 *  getter for the users first name 
	 * @return fName 
	 */
	public String getfName() {
		return fName;
	}

	/**
	 *  setter for the users first name 
	 * @param fName String
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 *  getter for the users last name 
	 * @return lName 
	 */
	public String getlName() {
		return lName;
	}
	/**
	 *  setter for the users last name 
	 * @param lName String
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 *  getter for the users phone number 
	 * @return userPhone
	 */
	public String getUserPhone() {
		return userPhone;
	}
	/**
	 * setter for the users phone number 
	 * @param userPhone String
	 */

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	/**
	 *  getter for the users department 
	 * @return userDept
	 */

	public String getUserDept() {
		return userDept;
	}
	/**
	 * setter for the users department 
	 * @param userDept String
	 */
	public void setUserDept(String userDept) {
		this.userDept = userDept;
	}

	/**
	 *  getter for the users email
	 * @return userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}


	/**
	 *  setter for the users email
	 * @param userEmail String
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
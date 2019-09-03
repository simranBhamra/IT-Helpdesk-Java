import java.io.IOException;
/**
 * 
 * @author  simran bhamra and marissa shores
 * technician class, gets all technician information 
 * a child class of user , creates a technician 
 */
public class Technicians extends User {

	private String empID, empSupervisorID;
	private String empHireDate, empSupervisorName;
	private String empStatus, isTechnicianSupervisor;
	/**
	 * constructor 
	 * @throws IOException
	 */
	public Technicians() throws IOException
	{
		super();
	}
	
	/**
	 * Constructor 
	 * @param fName String
	 * @param lName String
	 * @param userPhone String
	 * @param userDept String
	 * @param userEmail String
	 * @param eID String
	 * @param empSID String
	 * @param hd String
	 * @param sn String
	 * @param es String
	 * @param isEmpSupervisor String
	 * @throws IOException
	 */
	public Technicians(String fName, String lName, String userPhone, String userDept, String userEmail, String eID, String empSID, 
			String hd, String sn, String es, String isEmpSupervisor) throws IOException
	{
		super(fName, lName, userPhone, userDept, userEmail);
		empID = eID;
		empSupervisorID = empSID;
		empHireDate = hd;
		empSupervisorName = sn;
		empStatus = es;
		isTechnicianSupervisor = isEmpSupervisor;

	}
/**
 * getter for employee supervisor  ID 
 * @return empSupervisorID
 */
	public String getEmpSupervisorID() {
		return empSupervisorID;
	}
	/**
	 * setter for employee supervisor  ID 
	 * @param empSupervisorID String
	 */

	public void setEmpSupervisorID(String empSupervisorID) {
		this.empSupervisorID = empSupervisorID;
	}
/**
 * getter for employee ID 
 * @return empID
 */
	public String getEmpID() {
		return empID;
	}
/**
 * setter for employee ID
 * @param empID String
 */
	public void setEmpID(String empID) {
		this.empID = empID;
	}
/**
 * getter for employee hire date
 * @return empHireDate
 */
	public String getEmpHireDate() {
		return empHireDate;
	}
/**
 * setter for employee hire date
 * @param empHireDate String
 */
	public void setEmpHireDate(String empHireDate) {
		this.empHireDate = empHireDate;
	}
/**
 * getter for supervisor name 
 * @return empSupervisorName
 */
	public String getEmpSupervisorName() {
		return empSupervisorName;
	}
	/**
	 * setter for supervisor name 
	 * @param empSupervisorName String
	 */
	public void setEmpSupervisorName(String empSupervisorName) {
		this.empSupervisorName = empSupervisorName;
	}
/**
 * getter for the employee status
 * @return empStatus
 */
	public String getEmpStatus() {
		return empStatus;
	}
/**
 * setter for employee status
 * @param empStatus String
 */
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
/**
 * toString to print out formatted output 
 */
	public String toString()
	{
		String str = super.fName + "\n" + super.lName + "\n" + super.userPhone + "\n" + super.userDept + "\n" + super.userEmail + 
				"\n" + empID + "\n" +  empSupervisorID + "\n" + empHireDate + "\n" + empSupervisorName + 
				"\n" + empStatus + "\n" + isTechnicianSupervisor + "\n***************************"; 
			
			return str;
	}
	
	
}

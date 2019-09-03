import java.util.ArrayList;
import java.util.Date;
/**
 * 
 * @author simran bhamra & marissa shores
 * The class for tickets this sets up all ticket infomation to be used 
 *
 */
public class Tickets {

	private int ticketID; 
	public static int i=0;
	private String status; 
	User user;
	private String descp; 
	private Date dateO; 
	private Date  dateC;
	private String cNotes; 
	private String priority; 
	private String impact; 
	private String tNotes; 
	private String uNotes; 
	private String cOwner; 

/**
 * default constructor 
 */
	public Tickets () {
		ticketID = 1; 
		status ="";
		descp = "";
		dateO = null; 
		dateC = null; 
		cNotes ="";
		priority = null; 
		impact = null; 
		tNotes ="";
		uNotes = ""; 
		cNotes =""; 
		user = new User(); 
		
	}
	/**
	 *  getter for ticketID 
	 * @return ticketID
	 */
	public int getTicketID() {
		return ticketID;
	}
	/**
	 *  setter for ticketID
	 * @param ticketID int
	 */
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	/**
	 *  getter for status of the ticket 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * setter for status of the ticket 
	 * @param status String
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * getter for description of the ticket 
	 * @return descp
	 */
	public String getDescp() {
		return descp;
	}
	/**
	 * sets the description of the ticket 
	 * @param descp String
	 */
	public void setDescp(String descp) {
		this.descp = descp;
	}
	/**
	 * getter for the ticket date opened
	 * @return dateO
	 */
	public Date getDateO() {
		return dateO;
	}
	/**
	 * setter for the date opened
	 * @param dateO date
	 */
	public void setDateO(Date dateO) {
		this.dateO = dateO;
	}
	/**
	 * getter for the date closed 
	 * @return dateC
	 */
	public Date getDateC() {
		return dateC;
	}
	/**
	 * setter for the date closed
	 * @param dateC date
	 */
	public void setDateC(Date dateC) {
		this.dateC = dateC;
	}
	/**
	 * getter for closing notes 
	 * @return cNotes
	 */
	public String getcNotes() {
		return cNotes;
	}
	/**
	 * setter for closing Notes
	 * @param cNotes String
	 */
	public void setcNotes(String cNotes) {
		this.cNotes = cNotes;
	}
	/**
	 * getter for priority 
	 * @return priority 
	 */
	public String getPriority() {
		return priority;
	}
	/**
	 * setter for priority 
	 * @param priority String
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}
	/**
	 * getter for impact 
	 * @return impact 
	 */
	public String getImpact() {
		return impact;
	}
	/**
	 * setter for impact 
	 * @param impact String
	 */
	public void setImpact(String impact) {
		this.impact = impact;
	}
	/**
	 * getter for technician notes 
	 * @return
	 */
	public String gettNotes() {
		return tNotes;
	}
	/**
	 * setter for technician notes 
	 * @param tNotes String
	 */
	public void settNotes(String tNotes) {
		this.tNotes = tNotes;
	}
	/**
	 * getter for user notes
	 * @return uNotes
	 */
	public String getuNotes() {
		return uNotes;
	}
	/**
	 *  setter for user notes
	 * @param uNotes String
	 */
	public void setuNotes(String uNotes) {
		this.uNotes = uNotes;
	}
	/**
	 * getter for current owner of the ticket the tech
	 * @return cOwner 
	 */
	public String getcOwner() {
		return cOwner;
	}
	/**
	 * setter for the owner of the ticket 
	 * @param cOwner String
	 */
	public void setcOwner(String cOwner) {
		this.cOwner = cOwner;
	}
	
	/**
	 * default constructor 
	 * @param status String
	 * @param descp String
	 * @param priority String
	 * @param impact String
	 * @param fName String
	 * @param lName String
	 * @param userPhone String
	 * @param userDept String
	 * @param userEmail String
	 * @param uNotes String
	 * @param cOwner String
	 * @param tNotes String
	 */
	public Tickets (String status, String descp, String priority, String impact, String fName, String lName, String userPhone, String userDept, 
			String userEmail, String uNotes, String cOwner, String tNotes) 
	{
		this.descp = descp; 
		this.dateO = new Date(); 
		this.cNotes = ""; 
		this.priority = priority; 
		this.impact = impact; 
		this.tNotes =""; 
		this.cOwner = ""; 
		this.ticketID = ++i; 
		this.status = "Status: Open"; 
		user = new User( fName, lName, userPhone, userDept, userEmail) ; 
		this.uNotes =uNotes; 
		this.cOwner = cOwner;
		this.tNotes = tNotes;
	}
	
	/**
	 *  get current owner of the ticket 
	 * @return cOwner
	 */
	public String getCurrentOwner()
	{
		return cOwner;
	}
	
	/**
	 * set current owner to cOwn + the string "current owner" for formatting 
	 * @param cOwn String
	 */
	public void setCurrentOwner(String cOwn)
	{
		cOwner = "Current Owner: " + cOwn;
	}
	
	/**
	 * auto generates closing data and sets the status to closed 
	 */
	public void closeStatusandDate() {
		status = "Close"; 
		dateC = new Date(); 
		
	}
	/**
	 *  Compares the ticketOwner ID (tech ID) to current owner to retrieve all tickets the tech is currently working on 
	 * @param tickets array list
	 * @param owner String
	 * @return ticketOwners array list  
	 */
	public ArrayList<Integer> ticketOwner(ArrayList<Tickets> tickets, String owner)
	{
		ArrayList<Integer> ticketOwners = new ArrayList<Integer>();
		for (int count = 0; count < tickets.size(); count ++)
		{
			if (("Current Owner: " + owner).equalsIgnoreCase(tickets.get(count).getCurrentOwner()))
			{
				ticketOwners.add(ticketID);
			}
		}
		
		return ticketOwners;
	}
	
	/**
	 * adding update notes and a new line for formatting 
	 * @param upNotes String
	 */
	public void addUpdateNotes(String upNotes)
	{
		uNotes += "\n" + upNotes;
	}
	/**
	 * adding tech only  notes and a new line for formatting 
	 * @param techNotes
	 */
	public void addTechNotes(String techNotes)
	{
		tNotes += "\n" + techNotes;
	}
	
	/**
	 * to string method for the tickets class 
	 * @return str
	 */
	public String toString()
	{
		String str = status + "\n" + user.toString() + "\n" + descp + "\n" + priority + "\n" + impact + "\n" + uNotes + "\n" + cOwner + "\n" + tNotes + 
				"\n"  + "***************************";
				
		return str;
	}
	
}
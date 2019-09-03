/**
 * 
 * @author  simran bhamra and marissa shores
 * child class of the ticket class, used to specify a software ticket 
 */
public class SoftwareTickets extends Tickets {

	private static final int x32 = 32; 
	private static final int x64 = 64; 
	private String os; 
	private String softwareType; 
	private int numBits; 
/**
 * Constructor, makes use of super constructor & has validation to insure that either 32 or64 bits are entered
 * @param os String
 * @param softwareType String
 * @param numBits int
 */
	public SoftwareTickets(String os, String softwareType, int numBits ) {
		super();  
		this.os = os; 
		this.softwareType = softwareType; 
		if (numBits == x32 || numBits == x64) {
			this.numBits = numBits; 
		}
		else 
			System.out.println(" Error, invalid number of bits entered");

	}
/**
 * getter for operating system 
 * @return os
 */
	public String getOs() {
		return os;
	}
/**
 * setter for operating system 
 * @param os String
 */
	public void setOs(String os) {
		this.os = os;
	}
/**
 * getter for software type
 * @return softwareType
 */
	public String getSoftwareType() {
		return softwareType;
	}
/**
 * setter for softwareType
 * @param softwareType String
 */
	public void setSoftwareType(String softwareType) {
		this.softwareType = softwareType;
	}
/**
 * getter for the number of bits of the computer 
 * @return numBits
 */
	public int getNumBits() {
		return numBits;
	}

	/**
	 * setter for the number of bits 
	 * @param numBits int
	 */
	public void setNumBits(int numBits) {
		this.numBits = numBits;
	}


}

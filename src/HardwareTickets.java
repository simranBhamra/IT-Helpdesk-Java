public class HardwareTickets extends Tickets {
/**
 * @author simran bhamra and marissa shores  
 * child class of Tickets, used to specify hardware tickets 
 */
	
	private String hardwareType; 
	private String manuf; 
	private String prodNum; 
	private String serialNum; 

	/**
	 * Constructor, calls the super constructor also 
	 * @param hardwareType String
	 * @param manuf  String
	 * @param prodNum String 
	 * @param serialNum String
	 */
	public HardwareTickets(String hardwareType, String manuf, String prodNum, String serialNum) {
		super();
		this.hardwareType = hardwareType;
		this.manuf = manuf; 
		this.prodNum = prodNum; 
		this.serialNum = serialNum; 
	}
/**
 * getter for hardware type
 * @return hardwareType
 */
	public String getHardwareType() {
		return hardwareType;
	}
/**
 * setter for hardwareType
 * @param hardwareType String
 */
	public void setHardwareType(String hardwareType) {
		this.hardwareType = hardwareType;
	}
/**
 * getter for manufacturer 
 * @return manuf
 */
	public String getManuf() {
		return manuf;
	}
/**
 * setter for manufacturer 
 * @param manuf String
 */
	public void setManuf(String manuf) {
		this.manuf = manuf;
	}
/**
 * getter for product number 
 * @return prodNum
 */
	public String getProdNum() {
		return prodNum;
	}
/**
 * setter for product number 
 * @param prodNum String
 */
	public void setProdNum(String prodNum) {
		this.prodNum = prodNum;
	}
/**
 * getter for serial number 
 * @return serialNum
 */
	public String getSerialNum() {
		return serialNum;
	}
/**
 * setter for serial number  
 * @param serialNum String
 */
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}


}

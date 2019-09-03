import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author simran bhamra & marissa shores
 * The purpose of this class is to read and write information to and from the ticket and technician file 
 */
public class DBHelper {

	/**
	 * This method calls the readTechnicianEntry method while technician data is still left to be read.
	 * @throws IOException Input or Output error 
	 * @return technician 
	 */
	public static ArrayList<Technicians> readTechnicianFile() throws IOException
	{
		File techFile = new File("Technicians");
		Scanner techFileScanner = new Scanner(techFile);
		ArrayList<Technicians> technicians = new ArrayList<Technicians>(); 
		//if the file has a next line, go to the read Technician Entry method to read a line from the file
		while (techFileScanner.hasNextLine())
		{

				String empID = techFileScanner.nextLine();
				String firstName = techFileScanner.nextLine();
				String lastName = techFileScanner.nextLine();
				String hireDate = techFileScanner.nextLine();
				String department = techFileScanner.nextLine();
				String phoneNumber = techFileScanner.nextLine();
				String emailAddress = techFileScanner.nextLine();
				String supervisorName = techFileScanner.nextLine();
				String supervisorID = techFileScanner.nextLine();
				String status = techFileScanner.nextLine();
				String technicianSupervisor = techFileScanner.nextLine();
				techFileScanner.nextLine();
				
				Technicians tech = new Technicians(firstName, lastName, phoneNumber, department, emailAddress, empID, supervisorID, 
						hireDate, supervisorName, status, technicianSupervisor);
				
				technicians.add(tech);
		}
		techFileScanner.close();
		
		return technicians;
	}
	
	/**
	 * This method calls the readTicketEntry method while ticket data is still left to be read.
	 * @throws IOException  Input or Output error
	 * @return tickets 
	 */
	public static ArrayList<Tickets> readTicketsFile() throws IOException
	{
		File tickFile = new File("Tickets");
		Scanner tickFileScanner = new Scanner(tickFile);
		ArrayList<Tickets> tickets = new ArrayList<Tickets>();
		//if the file has a next line, go to the read Ticket Entry method to read a line from the file
		while (tickFileScanner.hasNextLine())
		{				
			String status = tickFileScanner.nextLine();
			String firstName = tickFileScanner.nextLine();
			String lastName = tickFileScanner.nextLine();
			String email = tickFileScanner.nextLine();
			String phoneNumber = tickFileScanner.nextLine();
			String department = tickFileScanner.nextLine();
			String descp = tickFileScanner.nextLine(); 
			String priority  = tickFileScanner.nextLine();
			String impact  = tickFileScanner.nextLine();
			String uNotes  = tickFileScanner.nextLine();
			String cOwner = tickFileScanner.nextLine();
			String tNotes  = tickFileScanner.nextLine();
			tickFileScanner.nextLine();
					
			Tickets ticket = new Tickets(status, descp, priority, impact, firstName, lastName, phoneNumber, department, email, uNotes, cOwner, tNotes);
			tickets.add(ticket);
		}
	
		tickFileScanner.close();
		
		return tickets;
	}
	/**
	 * This method writes to the technician File if there are more technicians left 
	 * @param tech technician
	 * @throws FileNotFoundException  Input or Output error
	 */
	public static void writeTechnicianFile(ArrayList<Technicians> tech) throws FileNotFoundException
	{
		PrintWriter outputFile = new PrintWriter("Technicians"); 
		for (int count = 0; count < tech.size(); count++)
		{
		outputFile.println(tech.get(count));
		}
		outputFile.close();
	}
	/**
	 * This method writes to the ticket file if there is more ticket info left 
	 * @param ticket tickets
	 * @throws FileNotFoundException  Input or Output error
	 */
	public static void writeTicketFile(ArrayList<Tickets> ticket) throws FileNotFoundException
	{
		PrintWriter outputFile = new PrintWriter("Tickets"); 
		for (int count = 0; count < ticket.size(); count++)
		{
		outputFile.println(ticket.get(count));
		}
		outputFile.close();
	}
}

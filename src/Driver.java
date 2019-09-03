import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author simran bhamra & marissa shores
 * This class is the driver which uses all the methods made in other classes in a menu driven fashion controlled by the user also takes in new information
 *
 */
public class Driver {
/**
 * This method presents a menu to the user and takes in information about the ticket and a technician as well as prints information to the console
 * @param args
 * @throws IOException
 */
	public static void main (String [] args) throws IOException
	{
		//create an array list of technicians and populate it with data from the file
		ArrayList<Technicians> techs = new ArrayList<Technicians>();
		techs = DBHelper.readTechnicianFile();
		
		//create an array list of tickets and populate it with data from the file
		ArrayList<Tickets> tickets = DBHelper.readTicketsFile();
		tickets = DBHelper.readTicketsFile();
		Tickets tick = new Tickets();
	
		
		//open a new scanner for user input
		Scanner kb = new Scanner(System.in);
		
		//variables to hold user input
		int userChoice;
		String answer;

		//ask user what they want to do
			System.out.println("Would you like to: \n1.) Add a new ticket.  \n2.) Add a new technician. \n3.) Read entire tickets file."
					+ "\n4.) Read entire technician's file. \n5.) See all tickets assigned to a technician. \n6.) Add update or technician notes."
					+ "\n7.) Reassign a ticket. \nSelect one number. ");
			userChoice = kb.nextInt();
			kb.nextLine();
			
			switch (userChoice)
			{
			case 1:
				System.out.println("Please enter the first name: ");
				String fName = "First Name: " + kb.nextLine();
				System.out.println("Please enter the last name: ");
				String lName = "Last Name: " + kb.nextLine();
				System.out.println("Please enter the phone number: ");
				String phone = "Phone Number: " + kb.nextLine();
				System.out.println("Please enter the department: ");
				String department = "Department: " + kb.nextLine();
				System.out.println("Please enter the email: ");
				String email = "Email Address: " + kb.nextLine();
				System.out.println("Please enter the incident description: ");
				String incDesc = "Incident Description: " + kb.nextLine();
				System.out.println("Please enter the priority (1-5): ");
				String priority = "Priority: " + kb.nextLine();
				System.out.println("Please enter the impact (Person, Small Group, Team, Department, Company, or Client): ");
				String impact = "Impact: " + kb.nextLine();
				System.out.println("Please enter any update notes: ");
				String upNotes = "Update Notes: " + kb.nextLine();
				
				String status = "Status: Open";
				String cOwner = "Current Owner: 12345";
				String tNotes = "Technician-Only Notes: Null";
				
				Tickets tick1 = new Tickets(status, incDesc, priority, impact, fName, lName, phone, department, email, upNotes, cOwner, tNotes);
				
				tickets.add(tick1);
				
				break;
			case 2:
				//a new technician can only be added by a supervisor
				System.out.println("Are you a supervisor? Yes or No.");
				answer = kb.nextLine();
				
				//add a new technician if employee is a supervisor
				if (answer.equalsIgnoreCase("Yes"))
				{
					System.out.println("Please enter the first name: ");
					fName = "First Name: " + kb.nextLine();
					System.out.println("Please enter the last name: ");
					lName = "Last Name: " + kb.nextLine();
					System.out.println("Please enter the phone number: ");
					phone = "Phone Number: " + kb.nextLine();
					System.out.println("Please enter the department: ");
					department = "Department: " + kb.nextLine();
					System.out.println("Please enter the email: ");
					email = "Email Address: " + kb.nextLine();
					System.out.println("Please enter the employee ID: ");
					String empID = "Employee ID: " + kb.nextLine();
					System.out.println("Please enter the supervisor ID: ");
					String supervisorID = "Supervisor ID: " + kb.nextLine();
					System.out.println("Please enter the hire date: ");
					String hireDate = "Hire Date: " + kb.nextLine();
					System.out.println("Please enter the supervisor's name: ");
					String supName = "Supervisor Name: " + kb.nextLine();
					System.out.println("Please enter the status of the employee: ");
					status = "Status: " + kb.nextLine();
					System.out.println("Is the employee a supervisor?");
					String empSupervisor = "Technician is a Supervisor: " + kb.nextLine();
					
					Technicians Tech1 = new Technicians(fName, lName, phone, department, email, empID, supervisorID, hireDate, supName, status, empSupervisor);
					
					techs.add(Tech1);
				}
				
				//if user is not a supervisor, they cannot add a new technician
				else
				{
					System.out.println("Sorry, you cannot add a new technician.");
				}
				break;
			case 3:
				//read the tickets file
				for (int count = 0; count < tickets.size(); count++)
				{
				System.out.println(tickets.get(count));
				}
				break;
			case 4:
				//read the technician file
				for (int count = 0; count < techs.size(); count++)
				{
				System.out.println(techs.get(count));
				}
				break;
			case 5:
				//ask for technician ID 
				System.out.println("Please enter the technician's employee ID.");
				answer = kb.nextLine();
				
				ArrayList<Integer> ticketOwners = new ArrayList<Integer>();
				ticketOwners = tick.ticketOwner(tickets, answer);
				System.out.println("The ticket that " + answer + " owns is ticket #" + ticketOwners.toString() + ".");
				break;
			case 6:
				System.out.println("Please enter a ticket ID.");
				int tickID = kb.nextInt();
				tickID--;
				
				System.out.println(tickets.get(tickID));
		
				
				System.out.println("Do you want to 1.) Add an update note. \n2.) Add a technician only note.");
				userChoice = kb.nextInt();
				kb.nextLine();

				
				if (userChoice == 1)
				{
					//ticket add update note
					System.out.println("Please enter the update notes beginning with the date and time of the note.");
					String updateNotes = kb.nextLine();
					tickets.get(tickID).addUpdateNotes(updateNotes);

				}
				
				else
				{
					//ask user to enter technician only notes
					System.out.println("Please enter the technician only notes beginning with the date and time of the note.");
					String techNotes = kb.nextLine();
					tickets.get(tickID).addTechNotes(techNotes);
				}
				break;
			case 7:
				System.out.println("Please enter a ticket ID.");
				tickID = kb.nextInt();
				kb.nextLine();
				tickID--;
				
				
				System.out.println("Please enter the technician employee ID you are reassigning the ticket.");
				String empID = kb.nextLine();
				
				tickets.get(tickID).setCurrentOwner(empID);

				break;
			default:
				System.out.println("Please enter a number 1-7 unless you are exiting the program.");
			}

		
		//write to the file
		DBHelper.writeTechnicianFile(techs);
		DBHelper.writeTicketFile(tickets);
		
		
		//notify user that the program is done
		System.out.println("The program is complete!");

		//close the Scanner
		kb.close();

	}

}



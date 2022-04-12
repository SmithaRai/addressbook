package AddressBookMain;

import java.util.Scanner;

public class AddContact {
	
	   public String firstName;
	   public String lastName;
	   public long phoneNumber;
	   public String emailId;
	   public String address;
	   public String city;
	   public String state;
	   public int zip;
	    
	    static Scanner input = new Scanner(System.in);

	    public String setFirstName(String firstName){
	        this.firstName = firstName;
	        return firstName;
	    }
	    public String setLastName(String lastName){
	        this.lastName = lastName;
	        return lastName;
	    }
	    public long setPhoneNumber(long phoneNumber){
	        this.phoneNumber = phoneNumber;
	        return phoneNumber;
	    }
	    public String setEmailId(String emailId){
	        this.emailId = emailId;
	        return emailId;
	    }
	    public String setAddress(String address){
	        this.address = address;
	        return address;
	    }
	    public String setCity(String city){
	        this.city = city;
	        return city;
	    }
	    public String setState(String state){
	        this.state = state;
	        return state;
	    }
	    public int setZips(int zip) {
	        this.zip = zip;
	        return zip;
	    }
	    public static void main(String[] args) {

	        AddContact person = new AddContact();

	        System.out.println("add person details");
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter First name: ");
	        person.setFirstName(scanner.next());

	        System.out.println("Enter Last name: ");
	        person.setLastName(scanner.next());

	        System.out.println("Enter Mobile Number: ");
	        person.setPhoneNumber(scanner.nextLong());

	        System.out.println("Enter  Email id: ");
	        person.setEmailId(scanner.next());

	     
	        System.out.println("Enter Address: ");
	        person.setAddress(scanner.next());

	        System.out.println("Enter City: ");
	        person.setCity(scanner.next());

	        System.out.println("Enter State : ");
	        person.setState(scanner.next());

	        System.out.println("Enter Zip: ");
	        person.setZips(scanner.nextInt());

	        System.out.println("****************Person details******************** ");
	        System.out.println(" ");
	        
	        System.out.println("FirstName    : "+person.firstName);
	        System.out.println("LastName     : "+person.lastName);
	        System.out.println("PhoneNumber  : "+person.phoneNumber);
	        System.out.println("Email id     : "+person.emailId);
	        System.out.println("Address      : "+person.address);
	        System.out.println("City         : "+person.city);
	        System.out.println("State        : "+person.state);
	        System.out.println("Zip          : "+person.zip);
	    }
	}



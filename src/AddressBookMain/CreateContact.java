package AddressBookMain;

public class CreateContact {
	
	public String firstName;
    public String lastName;
    public long phoneNumber;
    public String emailId;
    public String address;
    public String city;
    public String state;
    public int zip;
    
    
    public CreateContact (String firstName, String lastName, long phoneNumber,
            String emailId, String address, String city, String state, int zip) {
    	
          this.firstName = firstName;
          this.lastName = lastName;
          this.phoneNumber = phoneNumber;
          this.emailId = emailId;
          this.address = address;
          this.city = city;
          this.state = state;
          this.zip = zip;
       
       }

    public static void main(String[] args){
       CreateContact contacts = new CreateContact("Smitha", "Rai", 453274351, "smitha@gmail.com",
                                           "abdse", "banglore","karnataka", 65432 );
        System.out.println("FirstName : "+contacts.firstName);
        System.out.println("LastName : " +contacts.lastName);
        System.out.println("PhoneNumber : "+contacts.phoneNumber);
        System.out.println("EmailId : " +contacts.emailId);
        System.out.println("Address : "+contacts.address);
        System.out.println("City : " +contacts.city);
        System.out.println("State : " +contacts.state);
        System.out.println("Zip : "+contacts.zip);
    }

}

public class BuisnessContact extends Contact {
    private String phoneNumber;

    public BuisnessContact(String name, String emailAddress, String phoneNumber) {
        super(name, emailAddress);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void display() {
        System.out.println("Email: " + super.getEmailAddress() + " | Name: " + super.getName() + " | Phone number: " + phoneNumber);
    }


}

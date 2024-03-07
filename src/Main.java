import java.util.*;
public class Main {
    //Name : Wyatt Compton
//Exercise : Exercise07
//Date : 3/3/2024
    public static void main(String[] args) {
        Contact contact1 = new Contact
                ("billy bob", "billy bob joe@gmail.com");
        BuisnessContact businessDude = new BuisnessContact
                ("Nick", "Nickthepoliceman@yahoo.com", "911");

        ArrayList<Contact> listOfContact = new ArrayList<>();
        listOfContact.add(contact1);
        listOfContact.add(businessDude);

        for (Contact contact : listOfContact) {
            contact.display();
        }
    }
}
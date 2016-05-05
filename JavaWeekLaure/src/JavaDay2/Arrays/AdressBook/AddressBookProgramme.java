package JavaDay2.Arrays.AdressBook;
import java.io.File;
/**
 * Created by student on 5/4/2016.
 */
public class AddressBookProgramme {

    public static void main (String[] arg) {

        System.out.println(System.getProperty("user.dir"));

        AddressBook addressBook = new AddressBook();
        try
        {
            addressBook.loadContactFromFile(new File ("ContactDetails.txt"));
            System.out.println("we boom it");
        }catch (Exception e)
        {
            System.out.println("failed ");

        }

        //addressBook.printAllContacts();

        //after sort

        addressBook.sortByLastName();
        addressBook.printAllContacts();

        //System.out.println(addressBook.seachContact("Guery"));

    }

}

import java.util.ArrayList;
import java.util.List;

// Class to represent a Contact
class Contact {
  private String name;
    private String phoneNumber;
    private String email;

    // Constructor
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters for contact details
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    // Display contact details
    public void displayContact() {
        System.out.println("Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email);
    }
}

// Class to represent a Group (e.g., Family, Friends, Work)
class Group {
 String name;
    private List<Contact> contacts;

    // Constructor
    public Group(String name) {
        this.name = name;
        this.contacts = new ArrayList<>();
    }

    // Add a contact to the group
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Display contacts in the group
    public void displayGroupContacts() {
        System.out.println("Group: " + name);
        for (Contact contact : contacts) {
            contact.displayContact();
        }
    }
}

// Class to represent an AddressBook
class AddressBook {
    private List<Contact> contacts;
    private List<Group> groups;

    // Constructor
    public AddressBook() {
        this.contacts = new ArrayList<>();
        this.groups = new ArrayList<>();
    }

    // Add a contact to the address book
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    // Create a new group
    public void createGroup(String groupName) {
        groups.add(new Group(groupName));
    }

    // Add contact to a specific group
    public void addContactToGroup(String groupName, Contact contact) {
        for (Group group : groups) {
            if (group.name.equals(groupName)) {
                group.addContact(contact);
                break;
            }
        }
    }

    // Display all contacts
    public void displayAllContacts() {
        System.out.println("All Contacts:");
        for (Contact contact : contacts) {
            contact.displayContact();
        }
    }

    // Display all groups and their contacts
    public void displayAllGroups() {
        System.out.println("All Groups:");
        for (Group group : groups) {
            group.displayGroupContacts();
        }
    }
}

// Main class to test the system
public class Adb {
    public static void main(String[] args) {
        // Create an address book
        AddressBook addressBook = new AddressBook();

        // Create some contacts
        Contact contact1 = new Contact("John Doe", "1234567890", "john@example.com");
        Contact contact2 = new Contact("Jane Smith", "9876543210", "jane@example.com");
        Contact contact3 = new Contact("Alice Brown", "5556667777", "alice@example.com");

        // Add contacts to the address book
        addressBook.addContact(contact1);
        addressBook.addContact(contact2);
        addressBook.addContact(contact3);

        // Create some groups
        addressBook.createGroup("Family");
        addressBook.createGroup("Friends");

        // Add contacts to groups
        addressBook.addContactToGroup("Family", contact1);
        addressBook.addContactToGroup("Friends", contact2);
        addressBook.addContactToGroup("Friends", contact3);

        // Display all contacts
        addressBook.displayAllContacts();

        // Display all groups and their contacts
        addressBook.displayAllGroups();
    }
}

import java.util.ArrayList;
import java.util.Objects;

/**
 * User
 */
public class User {

    ArrayList<Long> phNumbers;
    String name;
    long number;
    public Phonebook phbook = new Phonebook(name, phNumbers);

    public User(String name, long number) {
        this.name = name;
        this.number = number;
    }

    public User() {

    }

    public void addContact(String name, long number) {
        if (!phbook.phonebook.containsKey(name)) {
            phNumbers = new ArrayList<>();
            phNumbers.add(number);
        } else {
            phNumbers = phbook.phonebook.get(name);
            phNumbers.add(number);
        }
        phbook.addPhone(name, phNumbers);
    }

    public void delContact(String name, long number) {
        phbook.removePhone(name, number);
    }

    public void getPhoneBook() {
        phbook.printAll();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

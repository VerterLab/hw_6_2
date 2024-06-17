
public class ProgramPhone {

    public static void main(String[] args) {

        User user = new User();

        user.addContact("Anton", 2222);
        user.addContact("Pasha", 1666);
        user.addContact("Anton", 1333);
        user.addContact("Pasha", 999);
        user.addContact("Sashik", 735);
        user.addContact("Pasha", 701);
        user.addContact("Boris", 9099);
        user.addContact("Anton", 1111);
        user.addContact("Pasha", 431);
        System.out.println("");
        user.getPhoneBook();
        System.out.println("");
        user.delContact("Anton", 1333);
        user.addContact("Boris", 1222);
        user.addContact("Boris", 2323);
        user.getPhoneBook();
    }
}

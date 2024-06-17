import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Phonebook
 */
public class Phonebook {

    String name;
    long phone;
    ArrayList<Long> phoneList;
    public Map<String, ArrayList<Long>> phonebook = new HashMap<>();

    public Phonebook(String name, ArrayList<Long> phoneNumber) {
        this.name = name;
        this.phoneList = phoneNumber;
    }

    public void addPhone(String name, ArrayList<Long> phoneNumber) {
        phonebook.put(name, phoneNumber);
    }

    public void removePhone(String name, long phone) {
        phonebook.get(name).remove(phone);

    }

    public void printAll() {
        String nameTemp;
        int temp;
        HashMap<String, Integer> hmTemp = new HashMap<>();

        for (@SuppressWarnings("rawtypes") Map.Entry entry : phonebook.entrySet()) {
            nameTemp = (String) entry.getKey();
            // temp = (int) entry.getValue();
            temp = phonebook.get(nameTemp).size();
            hmTemp.put(nameTemp, temp);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hmTemp.entrySet());
        Comparator<Map.Entry<String, Integer>> valueComparator = Comparator.comparing(Map.Entry::getValue);

        Collections.sort(list, valueComparator.reversed());

        LinkedHashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            String key = entry.getKey();
            // int value = entry.getValue();
            sortedHashMap.put(entry.getKey(), entry.getValue());
            System.out.println(key + " : " + phonebook.get(key));
        }

        // Выводим отсортированный HashMap по значениям в консоль
        // for (Map.Entry<String, Integer> entry : sortedHashMap.entrySet()) {
        // String key = entry.getKey();
        // int value = entry.getValue();

        // System.out.println(key + " : " + value);
        // }
    }

}

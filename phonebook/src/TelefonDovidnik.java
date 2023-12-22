import java.util.ArrayList;

public class TelefonDovidnik {
    ArrayList <Zapis> contacts=new ArrayList();
    public void add(Zapis newZapis) {
        contacts.add(newZapis);
    }
    public Zapis find(String name) {
        for (Zapis contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }
    public ArrayList <Zapis> findAll(String name) {
        ArrayList <Zapis> result=new ArrayList();
        for (Zapis contact : contacts) {
            if (contact.getName().equals(name)) {
                result.add(contact);
            }
        }
        return result;
    }
}

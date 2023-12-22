import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TelefonDovidnik dovidnik =new TelefonDovidnik();
        dovidnik.add(new Zapis("Bob","69798798789"));
        dovidnik.add(new Zapis("Bill","7987987987"));
        dovidnik.add(new Zapis("Bob","708908098908"));
        dovidnik.add(new Zapis("Mukola","666667868"));

        System.out.println(dovidnik.find("Bob").name);
        ArrayList <Zapis> myTest = dovidnik.findAll("Bob");
        for (Zapis contact : myTest) {
            System.out.println(contact.name);
            }

    }
}
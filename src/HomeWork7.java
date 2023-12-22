import java.util.*;

public class HomeWork7 {
    public static void main(String args[]) {
        //#1
        ArrayList test1List = new ArrayList(
                Arrays.asList("5", "0", "3", "1", "20", "3", "0", "0"));
        int test1Result = countOccurance (test1List, "0");
        System.out.println("Test 1 results:");
        System.out.println(test1Result);

        //#1
        int [] myTestArray =  { 3, 2, 1, 7 };
        List test2Result = toList (myTestArray);
        System.out.println("Test 2 results:");
        System.out.println(test2Result);

        //#3
        ArrayList test3 = new ArrayList(
                Arrays.asList(5, 0, 3, 1, 2, 3, 0, 0));
        List test3Result=findUnique(test3);
        // Print #3 results
        System.out.println("Test 3 results:");
        for(Object result : test3Result) {
            System.out.println(result.toString());
        }
        //4
        ArrayList test4List = new ArrayList(
                Arrays.asList("5", "0", "3", "1", "20", "3", "0", "0"));
        int test4Result = calcOccurance (test1List, "0");
        System.out.println("Test 4 results:");
        System.out.println(test4Result);
        //#4.1
        ArrayList test41List = new ArrayList(
                Arrays.asList("5", "0", "3", "1", "20", "3", "0", "0"));
        System.out.println("Test 4.1 results:");
        findOccurance (test41List);
    }

    //#1
    static int countOccurance (List myList, String ryadok) {
        int count =0;
        for (Object element : myList) {
            if (element.toString().contains(ryadok)) count++;
        }
        return count;
    }

    //#2
    static List toList (int myArray []){
        List newList = new ArrayList();
        for (int item : myArray){
            newList.add(item);
        }
        return newList;
    }

    //#3
    static List findUnique (List ogiginalList) {

        List uniqueList = new ArrayList(
                new HashSet(ogiginalList));
        return uniqueList;
    }

    //#4
    static int calcOccurance (List myList, String ryadok){
        int count =0;
        for (Object element : myList) {
            if (element.toString().equals(ryadok)) count++;
        }
        return count;
    }

    //#4.1
    static void findOccurance (List myList){
        Hashtable<String, Integer> result = new Hashtable<>();
        for (Object element : myList) {
            result.put(element.toString(),calcOccurance(myList,element.toString()));
        }
        System.out.println(result);
    }
}



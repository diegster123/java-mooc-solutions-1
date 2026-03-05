import java.util.*;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        String[] strings = {"John", "Diego", "Echo", "Brent"};
        
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);
        intList.add(3);
        intList.add(1);
        intList.add(99);
        intList.add(45);
        
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("xqf12");
        stringList.add("alpha9");
        stringList.add("zebra77");
        stringList.add("k9lmno");
        stringList.add("delta42");
        stringList.add("sunrise");
        stringList.add("omega3");
        stringList.add("pixel88");
        stringList.add("nova21");
        stringList.add("tango55");
        
        sort(array);
        System.out.println(Arrays.toString(array));;
        sort(strings);
        System.out.println(Arrays.toString(strings));
        System.out.println(" ");
        sortIntegers(intList);
        System.out.println(intList);
        sortStrings(stringList);
        System.out.println(stringList);

    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}

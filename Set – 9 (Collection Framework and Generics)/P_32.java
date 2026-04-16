import java.util.LinkedList;
import java.util.Scanner;

public class P_32 {

    // Generic method
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer LinkedList
        LinkedList<Integer> rollNumbers = new LinkedList<Integer>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();

        if (searchElement(rollNumbers, roll))
            System.out.println("Roll number found.");
        else
            System.out.println("Roll number not found.");

        // String LinkedList
        LinkedList<String> names = new LinkedList<String>();
        names.add("Utsav");
        names.add("Rahul");
        names.add("Amit");

        sc.nextLine();

        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        if (searchElement(names, name))
            System.out.println("Name found.");
        else
            System.out.println("Name not found.");

        sc.close();
    }
}

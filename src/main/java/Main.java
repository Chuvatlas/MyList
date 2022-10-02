import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyList <Integer> listNumbers = new MyList<>();
        listNumbers.addLast( 1);
        listNumbers.addLast(2);
        listNumbers.addLast(3);
        listNumbers.addLast(4);
        listNumbers.addLast(5);
        listNumbers.addLast(6);
        listNumbers.addLast(7);
        listNumbers.addLast(8);
        listNumbers.addLast(9);
        listNumbers.addLast(10);
        listNumbers.addLast(11);
        listNumbers.addLast(12);
        listNumbers.addLast(13);
        listNumbers.addFirst(0);
        listNumbers.addFirst(-1);
        listNumbers.addFirst(-2);
        listNumbers.addFirst(-3);
        listNumbers.addFirst(-4);
        listNumbers.addFirst(-5);
        listNumbers.addFirst(-6);
        listNumbers.addFirst(-7);


        System.out.println("до удаления: " + Arrays.toString(listNumbers.toArray()));
        listNumbers.remove(2);

        listNumbers.Lexa();



        System.out.println("после удаления: " + Arrays.toString(listNumbers.toArray()));




    }
}

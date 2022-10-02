import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestClass {

    MyList<Integer> listNumbers = new MyList<>();

    @Test
    public void addElementsTest(){
        listNumbers.addAll(List.of(1,2,3));
        listNumbers.addLast(4);
        listNumbers.addLast(5);
        listNumbers.addFirst(0);
        listNumbers.addFirst(-1);

        for (int i = 0; i < listNumbers.size(); i++){
            Assertions.assertEquals(i-1, listNumbers.get(i));
        }
    }

    @Test
    public void findIndexTest(){
        listNumbers.addAll(List.of(3, 15, 25, 45, 12, -2, 13, 5, 20, 2, 12));
        Assertions.assertEquals(8, listNumbers.indexOf(20));
    }

    @Test
    public void removeIndexTest(){
        listNumbers.addAll(List.of(-3, -4, 7, 11, 10, -33));
        listNumbers.remove(1);
        Assertions.assertArrayEquals(new Integer[] {-3, 7, 11, 10, -33}, listNumbers.toArray());
    }

    @Test
    public void removeValueTest(){
        listNumbers.addAll(List.of(2, 4, 3, 5, 6, 9, 19));
        listNumbers.remove(1);
        listNumbers.remove(5);
        Assertions.assertArrayEquals(new Integer[] {2, 3, 5, 6, 9}, listNumbers.toArray());
    }

    @Test
    public void sizeTest(){
        listNumbers.addAll(List.of(-8, 7, -6, 5, 4, -3));
        Assertions.assertEquals(6, listNumbers.size());
    }

    @Test
    public void isEmptyListTest(){
        listNumbers.addAll(List.of(1, 2, 22, 3, 33, 333));
        listNumbers.clear();
        Assertions.assertEquals(true, listNumbers.isEmpty());
    }

    @Test
    public void iteratorTest(){
        listNumbers.addAll(List.of(8, 800, 555, 3, 5, 35));
        for (Integer i: listNumbers){
            System.out.println(i);
        }
    }

}

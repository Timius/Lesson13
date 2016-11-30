import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 23.11.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {

        DemoArray array1 = new DemoArray();

        array1.lenght(20);
        array1.creat();
        array1.addElement(4);
        array1.max();
        array1.min();
        array1.avg();
        System.out.println("Увеличенный массив" + Arrays.toString(array1.addElement(10)));
        System.out.println("Уменьшенный массив " + Arrays.toString(array1.deleteElement(5)));





    }
}

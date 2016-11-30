import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 23.11.2016.
 */
public class DemoArray {

    private     int[] array;
    protected int length = 0;
    public DemoArray () {    //что это
        array = new int[10];
    }

    public void lenght (int i){
        array = new int[i];
    }

   protected void creat() {

        for (int i = 0; i < array.length; i++) {
            int k = new Random().nextInt(50);
            array[i] = k;
        }
        System.out.println("Исходный массив" + Arrays.toString(array));
        }

    protected int max(){
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (max < array[i]) {
                max = array[i];
                }
        System.out.println("max=" + max);
        return max;
    }
    protected int min(){
        int min = array[0];
        for (int i = 0; i < array.length; i++)
            if (min > array[i]) {
                min = array[i];
            }
        System.out.println("min=" + min);
        return min;
    }
    protected double avg(){
        double avg = 0;int n =0;
        for (int i = 0; i < array.length; i++)
            if (array[i]!=0) {
                avg += array[i];
                n++;
            }
        avg = avg/n;
        System.out.println("avg=" + avg + "; n=" + n);
        return avg;
    }

    protected int[] addElement (int value){
        int[] arrayN = new int[array.length+1];

        for (int i = 0; i < array.length; i++){
        arrayN[i]=array[i];}
        arrayN[array.length]= value;

        int [] array = arrayN;
        return array;
    }

    protected int [] deleteElement (int j) {
        for (int i = j; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        int[] arrayD = new int[array.length - 1];
        for (int i = 0; i < arrayD.length; i++) {
           arrayD[i] = array[i];
        }
        int [] array = arrayD;
        return array;

    }
}


//    protected void addElement (int j, int value){
//        int[] arrayN = new int[array.length+1];
//
//        for (int i = 0; i < array.length; i++){
//        arrayN[i]=array[i];}
//        for (int i = arrayN.length; i > j; i--) {
//            arrayN[i-1] = arrayN[i - 2];
//        }
//        arrayN[j]= value;
//        System.out.println("Увеличенный массив " + Arrays.toString(arrayN));
//    }

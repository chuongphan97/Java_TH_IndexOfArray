import java.util.Scanner;

public class IndexOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Input size: ");
            size = scanner.nextInt();
        } while (size <= 0);
        
        int[] array = new int[size];

        for (int i = 0;i < size;i++){
            System.out.print("array["+i+"]= ");
            array[i] = scanner.nextInt();
        }
        int index = IndexOf(4,array);
        System.out.println(index);

    }

    public static int IndexOf(int value, int[] arr){
        int index = -1;
        for (int i = 0; i < arr.length; i++){
            if (value == arr[i]) index = i;
            break;
        }
        return index;
    }
}

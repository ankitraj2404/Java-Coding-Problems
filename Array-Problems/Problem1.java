import java.util.*;

public class Problem1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter elements: ");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.stream(arr)
        .forEach(n -> System.out.print(n+" "));
       
    }
}
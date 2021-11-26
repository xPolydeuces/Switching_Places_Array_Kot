import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// This app takes array within range (10-1) and then moves it by one index to the left
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Przed: ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                int larger = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = larger;
            }
        }
        System.out.println("Po: ");
        System.out.println(Arrays.toString(arr));
    }
}

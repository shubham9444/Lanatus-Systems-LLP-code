import java.util.Scanner;

import javafx.scene.transform.Scale;

/**
 * removeDuplicate
 */
public class removeDuplicate {

    static int removeDuplicates(int arr[], int n) {
        if (n == 0 || n == 1)
            return n;

        int j = 0;

        for (int i = 0; i < n - 1; i++)

            if (arr[i] != arr[i + 1])

                arr[j++] = arr[i];

        arr[j++] = arr[n - 1];

        return j;
    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int nonDuplicateElemet = removeDuplicates(arr, n);

        System.out.println("nonDuplicateElemet");
        System.out.println(nonDuplicateElemet);
        System.out.println("non deplicate array");
        for (int i = 0; i < nonDuplicateElemet; i++)
            System.out.print(arr[i] + " ");
    }
}

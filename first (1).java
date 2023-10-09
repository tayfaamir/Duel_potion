import java.util.Scanner;

public class first {


    static int answer =-1;



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr1[] = new int[n];


        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }
        int m =scanner.nextInt();
        int arr2[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = scanner.nextInt();
        }

        LCIS(arr1, arr2);
        System.out.println(answer);
    }


    static void LCIS(int arr1[], int arr2[]) {
        int dp[] = new int[arr2.length];
        int maxLength = 0;

        for (int i = 0; i < arr1.length; i++) {
            int currentLength = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j]) {
                    if (dp[j] > currentLength) {
                        currentLength = dp[j];
                    }
                }
                if (arr1[i] == arr2[j]) {
                    if (currentLength + 1 > dp[j]) {
                        dp[j] = currentLength + 1;
                    }
                }
                if (dp[j] > maxLength) {
                    maxLength = dp[j];
                }
            }
        }

        answer = maxLength;

    }


}

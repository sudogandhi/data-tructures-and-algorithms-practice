import java.util.*;
import java.lang.*;
import java.io.*;

public class MissingNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0 ) {
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().trim().split(" ");

            int arr[] = new int[n-1];

            for(int i = 0;i<n-1;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            System.out.println(missingNumber(arr,n));
        }
    }

    private static int missingNumber(int[] array, int n) {
        boolean arr[] = new boolean[n+1];
        int i;
        for(i=0;i<n-1;i++) {
            arr[array[i]] = true;
        }
        for(i=1;i<n+1;i++) {
            if (arr[i] == false) {
                break;
            }
        }
        return i;
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;

public class KadanesAlgorithm {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0 ) {
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().trim().split(" ");

            int arr[] = new int[n];

            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            System.out.println(maxSubarraySum(arr,n));
        }
    }
    public static long maxSubarraySum(int arr[], int n) {
        long sum = 0;

        return sum;
    }
}

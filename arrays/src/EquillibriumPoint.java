import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class EquillibriumPoint {
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
            System.out.println(equilibriumPoint(arr,n));
        }
    }

    private static int equilibriumPoint(int[] arr, int n) {
        int lsum,rsum;
        lsum = rsum = 0;
        int i;
        for(i=0;i<n;i++) {
            rsum += arr[i];
        }

        for(i=0;i<n;i++) {
            if(lsum == rsum-arr[i]-lsum) {
                return i+1;
            } else {
                lsum += arr[i];
            }
        }
        return -1;
    }

}

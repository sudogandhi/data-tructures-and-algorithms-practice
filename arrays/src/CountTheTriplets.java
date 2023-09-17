import java.util.*;
import java.lang.*;
import java.io.*;

public class CountTheTriplets {
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
            System.out.println(countTriplet(arr,n));
        }
    }
    static int countTriplet(int arr[], int n) {
        int res = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        int i,j;
        for(i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(i=0;i<n;i++) {
            for(j=i+1;j<n;j++) {
                if (set.contains(arr[i]+arr[j])) {
                    res++;
                }
            }
        }
        return res;
    }
}

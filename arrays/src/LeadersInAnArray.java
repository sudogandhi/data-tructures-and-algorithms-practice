import java.util.*;
import java.lang.*;
import java.io.*;

public class LeadersInAnArray {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0 ) {
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().trim().split(" ");

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            ArrayList<Integer> res = new ArrayList<>();
            res = leaders(arr,n);
            for(int i=0;i<res.size();i++){
                System.out.print(res.get(i)+" ");
            }
            System.out.println();
        }

    }

    private static ArrayList<Integer> leaders(int[] arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int max=arr[n-1];
        res.add(arr[n-1]);
        for(int i=n-2;i>=0;i--) {
            if(arr[i]>=max) {
                res.add(0,arr[i]);
                max = arr[i];
            }
        }
        return res;
    }
}

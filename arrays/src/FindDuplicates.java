import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.io.*;

public class FindDuplicates {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().trim().split(" ");

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            ArrayList<Integer> res = new ArrayList<>();
            res = duplicates(arr, n);
            for (int i = 0; i < res.size(); i++) {
                System.out.print(res.get(i) + " ");
            }
            System.out.println();
        }
    }

    private static ArrayList<Integer> duplicates(int[] arr, int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int hash[] = new int[n];
        boolean f = false;
        for(int i = 0;i<n;i++) {
            hash[arr[i]]++;
        }
        for(int i = 0;i<n;i++) {
            if(hash[i] > 1) {
                res.add(i);
                f = true;
            }
        }

        if(!f) {
            res.add(-1);
        }
        return res;
    }
}

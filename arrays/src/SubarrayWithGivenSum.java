import java.util.*;
import java.lang.*;
import java.io.*;

public class SubarrayWithGivenSum {
    static BufferedReader br;
    static PrintWriter ot;

    public static void main(String args[])throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            String s[] = br.readLine().trim().split(" ");

            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0;i<n;i++) {
                a[i] = Integer.parseInt(s[i]);
            }
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a,n,k);

            for(int ii = 0;ii<res.size();ii++) {
                ot.print(res.get(ii)+" ");
            }
            ot.close();
        }
    }
}


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        int l,u,sum;
        l = 0;
        sum = 0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (s != 0) {
            for(u=0;u<n;u++) {
                sum += arr[u];
                while(sum > s) {
                    sum -= arr[l];
                    l++;
                }
                if(sum == s) {
                    res.add(l+1);
                    res.add(u+1);
                    break;
                }
            }
        }
        if (res.size() == 0) {
            res.add(-1);
        }
        return res;
    }
}
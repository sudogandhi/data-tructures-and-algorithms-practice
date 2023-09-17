import java.lang.*;
import java.io.*;
import java.util.HashMap;

public class LargestSubarrayWith0Sum {
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
            System.out.println(maxLen(arr,n));
        }
    }

    private static int maxLen(int[] arr, int n) {
        int len = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int current = 0;
        int i,j;
        for(i = 0;i<n;i++) {
            current = current+arr[i];
            if (map.containsKey(current)) {
                j = map.get(current);
                if(len < (i-j)) {
                    len = i-j;
                }
            } else {
                map.put(current,i);
            }
        }
        if (current == 0) {
            return n;
        }
        return len;
    }
}

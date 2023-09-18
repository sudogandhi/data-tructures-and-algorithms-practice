import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FrequenciesOfLimitedRangeArrayElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0 ) {
            int n = Integer.parseInt(br.readLine());
            String input[] = br.readLine().trim().split(" ");

            int arr[] = new int[n];

            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            int p = Integer.parseInt(br.readLine());

            frequencies(arr,n,p);
            for(int i = 0;i<n;i++){
                System.out.println(arr[i]);
            }

        }
    }

    private static void frequencies(int[] arr, int N, int p) {
        int maxi=N+1;
        for(int i=0;i<N;i++){
            if(arr[i]>N){
                arr[i]=0;
            }
        }
        for(int i=0;i<N;i++){
            if(arr[i]%maxi==0)continue;
            int ind=arr[i]%maxi-1;
            arr[ind]=arr[ind]+maxi;
        }
        for(int i=0;i<N;i++){
            arr[i]=arr[i]/maxi;
        }
    }

}

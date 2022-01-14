package algorithmWeek2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2293 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int p[] = new int[n];
		for(int i=0; i<n; i++) {
			p[i] = Integer.parseInt(br.readLine());
		}
		
		int dp[] = new int[k+1];
		dp[0] = 1;
		
		for(int i=0; i<n; i++) {
			for(int j=p[i]; j<=k; j++) {
				dp[j] += dp[j-p[i]];
			}
		}
		System.out.print(dp[k]);
	}

}

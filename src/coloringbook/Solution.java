package coloringbook;

import java.util.ArrayList;

public class Solution {
	public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        ArrayList<Integer> area = new ArrayList<>();
        
        for(int i = 0; i<m-1;i++) {
        	for(int j =0; j<n-1;j++) {
        		if(picture[i][j] == 0)continue;
        		if(picture[i][j] == picture[i][j+1]) {
        			
        		}
        	}
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}

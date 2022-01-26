package silpe;

import java.util.Arrays;

public class Solution {
	
	public int[] solution(int N, int[] stages) {
        int[] hoony = new int[stages.length];
        
        for(int i = 0; i<stages.length; i++){
            hoony[i] = stages[i];
        }
		
		double[][] carr = new double[N][2];
		
		for(int i = 0; i<N; i++) {
			//하나씩 빼면서 도달 못한 스테이지 세기위한 카운트 선언
			int count = 0;
			//분모 스테이지 세기위한 변수 선언
			int bm = 0;
			for(int j = 0; j< stages.length; j++) {
				for(int k = 0; k< stages.length; k++) {
					//모든 stages length 하나씩 빼기
					
					hoony[k] -=1;
				}
				if(hoony[j] >=0) {
					bm += 1;
				}
				if(hoony[j]==0) {
					count += 1;
				}
			}
			carr[i][0] = (double)count/bm;
			carr[i][1] = i+1;
		}
		
		int[] answer = new int[N];
		
		for(int i = 0; i<N; i++) {
			int n = 0;
			for(int j = 0; j<N; j++) {
				if((carr[i][0]-carr[j][0])>0) {
					n +=1;
				}
			}
            for(int k = 0; i<N;k++){
			if(answer[n]>0) {
				n +=1;
			}
            }
			answer[n] = (int)carr[i][1];
		}
		
        
        return answer;
	}
	
	public static void main(String[] args) {
		
	}
	
	
}

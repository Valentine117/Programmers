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
			//�ϳ��� ���鼭 ���� ���� �������� �������� ī��Ʈ ����
			int count = 0;
			//�и� �������� �������� ���� ����
			int bm = 0;
			for(int j = 0; j< stages.length; j++) {
				for(int k = 0; k< stages.length; k++) {
					//��� stages length �ϳ��� ����
					
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

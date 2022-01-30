package crain;

public class Solution {
	static public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int H = board.length;
        int Y = board[0].length;
        int N = moves.length;
        int[] C = new int[N];
        int count = 0;
        
        int[][] x = new int[H][Y];
        
        for(int i=0;i<H;i++) {
        	for(int j = 0; j<Y;j++) {
        		x[i][j] = board[i][j];
        	}
        }
        
        int ii = 0;
        
        for(int i = 0; i<N; i++) {
        	int m = moves[i];
        	for(int j = 0; j<H;j++) {
        		if(x[j][m-1]==0) {
        			continue;
        		}
        	else if(x[j][m-1]!=0) {
        			
        			C[ii] = x[j][m-1];
        			x[j][m-1] = 0;
        			
        			ii += 1;
        			
        			if(ii>1) {
        				if(C[ii-1] == C[ii-2]) {
            				C[ii] = 0;
            				C[ii-1] = 0;
            				
            				ii -=2;
            				answer +=2;
            			}
        			}
        			break;
        		}
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int a = solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}},new int[] {1,5,3,5,1,2,1,4});
		System.out.println(a); 
	}
}

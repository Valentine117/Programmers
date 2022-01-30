package secretMap;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        char[][] narr = new char[n][n];
		
		for(int i =0; i<n; i++) {
			int a1, a2;
			a1 = arr1[i];
			a2 = arr2[i];
			int e1,e2;
			int a11,a22;
			a11 = 0; a22 = 0;
			for(int j = 0; j<n ; j++) {
				
				if(j==0) {a11 = a1;}
				else if(a11/(int)Math.pow(2, n-j)>0){
					a11 -=  (int)Math.pow(2, n-j);
				}
				
				if(j==0) {a22 = a2;}
				else if(a22/(int)Math.pow(2, n-j)>0){
					a22 -=  (int)Math.pow(2, n-j);
				}
				
				e1 = a11/(int)Math.pow(2, n-j-1);
				e2 = a22/(int)Math.pow(2, n-j-1);
				
				if(e1>=1||e2>=1) {
					narr[i][j] = '#';
				}
				else {
					narr[i][j] = ' ';
				}
			}
		}
		
		
		String[] answer = new String[n];
		
		for(int i = 0; i < n; i++) {
			String a = new String(narr[i]);
			answer[i] = a;
		}
        return answer;
    }
}
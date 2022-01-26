package yaksu;

public class Solution {
	
	static public int solution(int left, int right) {
        int answer = 0;
        int sum =0;
        for(int i = left; i<=right; i++){
            int count = 0;
            for(int f = 1; f<=i; f++){
                if(i%f == 0){
                    count += 1;
                }
                }
            if(count%2 ==0){
                    sum += i;
                }
            else{
                    sum -= i;
            }
        }
        answer = sum;
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(13,17));
	}
}

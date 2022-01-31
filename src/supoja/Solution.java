package supoja;

import java.util.ArrayList;

public class Solution {
	 

	public static int[] solution(int[] answers) {
		int length = answers.length;
		 int[] supo1 = new int[length];
		 int[] supo2 = new int[length];
		 int[] supo3 = new int[length];
		 int count1 = 0;
		 int count2 = 0;
		 int count3 = 0;
		 
		 
		 for(int i =0; i<10000; i+=5) {
			 supo1[i] = 1;
			 if(i == length-1)break;
			 supo1[i+1] = 2;
			 if(i == length-2)break;
			 supo1[i+2] = 3;
			 if(i == length-3)break;
			 supo1[i+3] = 4;
			 if(i == length-4)break;
			 supo1[i+4] = 5;
			 if(i == length-5)break;
		 }
		 for(int i =0; i<10000; i+=8) {
			 supo2[i] = 2;
			 if(i == length-1)break;
			 supo2[i+1] = 1;
			 if(i == length-2)break;
			 supo2[i+2] = 2;
			 if(i == length-3)break;
			 supo2[i+3] = 3;
			 if(i == length-4)break;
			 supo2[i+4] = 2;
			 if(i == length-5)break;
			 supo2[i+5] = 4;
			 if(i == length-6)break;
			 supo2[i+6] = 2;
			 if(i == length-7)break;
			 supo2[i+7] = 5;
			 if(i == length-8)break;
		 }
		 for(int i =0; i<10000; i+=10) {
			 supo3[i] = 3;
			 if(i == length-1)break;
			 supo3[i+1] = 3;
			 if(i == length-2)break;
			 supo3[i+2] = 1;
			 if(i == length-3)break;
			 supo3[i+3] = 1;
			 if(i == length-4)break;
			 supo3[i+4] = 2;
			 if(i == length-5)break;
			 supo3[i+5] = 2;
			 if(i == length-6)break;
			 supo3[i+6] = 4;
			 if(i == length-7)break;
			 supo3[i+7] = 4;
			 if(i == length-8)break;
			 supo3[i+8] = 5;
			 if(i == length-9)break;
			 supo3[i+9] = 5;
			 if(i == length-10)break;
		 }
		 
		 for(int i = 0;i<length;i++) {
			 if(supo1[i] == answers[i]) {
				 count1 +=1;
			 }
			 if(supo2[i] == answers[i]) {
				 count2 +=1;
			 }
			 if(supo3[i] == answers[i]) {
				 count3 +=1;
			 }
		 }
		 ArrayList<Integer> answer0 = new ArrayList<Integer>();
		 
		 if(count1==count2 && count1 == count3 && count1>0) {
			 answer0.add(1);
			 answer0.add(2);
			 answer0.add(3);
		 }
		 
		 else if(count1 > count2 && count2 >= count3) {
			 answer0.add(1);
		 }
       
       else if(count1 > count2 && count1 > count3) {
			 answer0.add(1);
		 }
		 
		 else if(count2 > count1 && count1 >= count3) {
			 answer0.add(2);
		 }
       
       else if(count2 > count1 && count2 > count3) {
			 answer0.add(2);
		 }
		 
		 else if(count3 > count2 && count2 >= count1) {
			 answer0.add(3);
		 }
       
       else if(count3 > count2 && count3 > count1) {
			 answer0.add(3);
		 }
		 
		 else if(count1 == count2 &&count1>count3) {
			 answer0.add(1);
			 answer0.add(2);
		 }
		 
		 else if(count1 == count3 && count1 > count2) {
			 answer0.add(1);
			 answer0.add(3);
		 }
		 
		 else if(count2 == count3 && count3 > count1) {
			 answer0.add(2);
			 answer0.add(3);
		 }
       
       else{
           
       }
		 int[] answer = answer0.stream().mapToInt(i->i).toArray();
		 
	     return answer;
	    }
	
	public static void main(String[] args) {
		int[] a = {1,3,2,3,4};
		System.out.println(solution(a));
	}
}

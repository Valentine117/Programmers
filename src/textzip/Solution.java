package textzip;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static int solution(String s) {
        int answer = 0;
        int sLength = s.length();
        String text = new String();
        String sameText = new String();
        ArrayList<Integer> answers = new ArrayList<Integer>();
        text = s;
        int count = 0;
        
        
        for(int i = 1; i<sLength;i++) {
        	answers.add(text.length()-count);
        	text = s;
        	count = 0;
        	int strcount = 1;
        	for(int j = 0; j<sLength;j+=i) {
        		 if(j+i>text.length())break;
        		 sameText = text.substring(j, j + i);
        		 if(j+(2*i) <=text.length()) {
        			 if(sameText.equals(text.substring(j+i, j+(2*i))) ){
        				 count+= i;
        				 strcount++;
        				 System.out.println("count: " + count);
        				 if((j+(2*i))==((text.length()))){
        					 count -= 1;
    					 }
//        				 if(j==0) {
////        					 text = text.substring(i,text.length());
////        					 System.out.println("if j == 0: " + text);
//        				 }
//        				 else {
//        					 text = text.substring(0, j)+text.substring(j+1,text.length());
//        					 System.out.println("same else: " +text);
        					 
//        				 }
        			 }
        			 else {
        				 if(strcount>1) {
        					 count -=1;
        					 strcount = 1;
        				 }
//        				 if(count >1) {
//        					 if(j==0) {
//        						 text = Integer.toString(count) + text;
//        						 System.out.println(text);
//            				 }
//            				 else {
//            					 text =text.substring(0, j)+ Integer.toString(count)+ text.substring(j,text.length());
//            					 System.out.println("else count>1 else: " + text);
//            				 }
//        					 count = 1;
//        				 }
        			 }
        		 }
        		 
//        		 System.out.print("sameText: ");
//        		 System.out.println(sameText);
//        		 System.out.print("text.substring(j+i, j+(2*i)): ");
//        		 System.out.println(text.substring(j+i, j+(2*i)));
//        		 System.out.print("text: ");
//        		 System.out.println(text);
//        		 System.out.println("is it same :"+sameText.equals(text.substring(j+i, j+(2*i))));
        		 
        	}
        }
        answer = Collections.min(answers);
        System.out.println(answers);
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution("aabbccddeee"));
//		 
	}
}

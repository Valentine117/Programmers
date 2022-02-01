package textzip;

import java.util.ArrayList;
import java.util.Collections;

public class Resolutionmine {
	public static int solution(String s) {
        int answer = 0;
        int sLength = s.length();
        String text = new String();
        String sameText = new String();
        ArrayList<Integer> answers = new ArrayList<Integer>();
        text = s;
        int count = 0;
        int onecount =0;
    	int tencount =0;
    	int hundredcount =0;
    	int thousandcount =0;
        
        
        for(int i = 1; i<=sLength;i++) {
        	System.out.print("textLength : " + text.length() + " ");
        	System.out.print("count: " + count + " ");
        	System.out.print("one: " + onecount + " ");
        	System.out.print("ten: " + tencount + " ");
        	System.out.print("hund: " + hundredcount + " ");
        	System.out.println("thou: " + thousandcount + " ");
        	
        	answers.add(text.length()-count + tencount + hundredcount + thousandcount + onecount);
        	onecount =0;
        	tencount =0;
        	hundredcount =0;
        	thousandcount =0;
        	text = s;
        	count = 0;
        	int strcount = 1;
        	
        	for(int j = 0; j<=sLength;j+=i) {
        		 if(j+i>text.length()) {
        				 break;
        			 }
        		 sameText = text.substring(j, j + i);
        		 if(j+(2*i) <=text.length()) {
        			 if(sameText.equals(text.substring(j+i, j+(2*i))) ){
        				 count+= i;
        				 strcount++;
        				 System.out.println("count: " + count);
        				 System.out.println("strcount: " + strcount);
        				 
        				 if((j+(2*i))>((text.length()))){
        					 onecount +=1;
        					 if((strcount/10)>=1) {
        	        			 tencount += 1;
        	        		 }
        	        		 if((strcount/100)>=1) {
        	        			 hundredcount += 1;
        	        		 }
        	        		 if((strcount/1000)>=1) {
        	        			 thousandcount += 1;
        	        		 }
        	        		 strcount = 1;
    					 }
        			 }
        			 else {
        				 if(strcount>1) {
        					 onecount +=1;
        					 if((strcount/10)>=1) {
        	        			 tencount += 1;
        	        		 }
        	        		 if((strcount/100)>=1) {
        	        			 hundredcount += 1;
        	        			 
        	        		 }
        	        		 if((strcount/1000)>=1) {
        	        			 thousandcount += 1;
        	        		 }
        	        		 strcount = 1;
        				 }
        			 }
        		 }
        		 else {
        			 if(strcount>1) {
        			 if(i<=(double)sLength/2)
        			 onecount +=1;
					 if((strcount/10)>=1) {
	        			 tencount += 1;
	        		 }
	        		 if((strcount/100)>=1) {
	        			 hundredcount += 1;
	        		 }
	        		 if((strcount/1000)>=1) {
	        			 thousandcount += 1;
	        		 }
        			 }
        		 }
        	}
        }
        answer = Collections.min(answers);
        System.out.println(answers);
        return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxz"));
	}
}


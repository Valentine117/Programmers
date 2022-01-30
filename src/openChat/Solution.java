package openChat;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.ArrayList;

public class Solution {
    public static String[] solution(String[] record) {
        
    	int count = 0;
        HashMap<String, String> user = new HashMap();
        
        
        
        
		
		for(int i = 0; i< record.length; i++) {
            
            int fs = record[i].indexOf(" ")+1;
	        int ss = record[i].substring(7, record[i].length()).indexOf(" ")+7;
			
			if(record[i].contains("Enter")) {
				count++;
				String key = record[i].substring(fs,ss);
				String Kchar = record[i].substring(ss+1, record[i].length());
                
                
				
				if(user.containsKey(key)==true) {
					for(int j=0;j<record.length;j++) {
						if(!record[j].contains("Leave")) {
						user.put(key, Kchar);
					}
					}
				}
				
				else {
					user.put(key, Kchar);
				}
			}
			
			else if(record[i].contains("Change")) {
				String key = record[i].substring(fs,ss);
				String Kchar = record[i].substring(ss+1, record[i].length());
				
              
				
				for(int j=0;j<record.length;j++) {
					if(!record[j].contains("Leave")) {
					user.put(key, Kchar);
					}
				}
				
				user.put(key, Kchar);
			}
			
			else {
				count++;
			}
			
			
		}
			
		String[] answer = new String[count];
		
		for(int i = 0; i<record.length;i++) {
            
			int fs = record[i].indexOf(" ")+1;
	        int ss = record[i].substring(7, record[i].length()).indexOf(" ")+7;
			
			if(record[i].contains("Enter")) {
				answer[i] = user.get(record[i].substring(fs,ss)) + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
               
			}
			
			else if(record[i].contains("Leave")) {
				answer[i] = user.get(record[i].substring(fs,record[i].length())) + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
             
			}
			
			else {
				
			}
		}
		
        
        return answer;
    }
    
    public static void main(String[] args) {
    	String[] a = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
    	
    	for(int i =0; i<solution(a).length;i++) {
    		System.out.println(solution(a)[i]);
    	}
//    	String[] answer = {};
//        HashMap<String, String> user = new HashMap();
//		String[] d = new String[a.length];
////		
//		for(int i = 0; i< a.length; i++) {
//			d[i] = a[i];
//			if(d[i].contains("Enter") == true) {
//			System.out.println(d[i]);
//			d[i].substring(5, d[i].length());
//			System.out.println(d[i]);
//			}
//		}
		
//for(int i = 0; i< a.length; i++) {
//			
//			if(a[i].contains("Enter") == true) {
//				
//				String key = a[i].substring(6,12);
//				String Kchar = a[i].substring(14, 18);
//				
//				if(user.containsKey(key)==true) {
//					for(int j=0;j<a.length;j++) {
//						user.put(key, Kchar);
//						if(a[j].charAt(13)==' '){
//							a[j] = a[j].replaceAll(a[j].substring(14,a[j].length()), Kchar);
//						}
//						else if(a[j].charAt(14)==' ') {
//							a[j] = a[j].replaceAll(a[j].substring(15,a[j].length()), Kchar);
//						}
//					}
//				}
//				
//				else {
//					user.put(key, Kchar);
//				}
//			}
//			
//			else if(a[i].contains("Change") == true) {
//				String key =a[i].substring(7,13);
//				String Kchar = a[i].substring(15, 19);
//				
//				for(int j=0;j<a.length;j++) {
//					user.put(key, Kchar);
//					if(d[j].charAt(13)==' ') {
//						d[j] = d[j].replaceAll(d[j].substring(14,a[j].length()), Kchar);
//					}
//					else if(d[j].charAt(14)==' ') {
//						d[j] = d[j].replaceAll(d[j].substring(15,a[j].length()), Kchar);
//					}
//				}
//				
//				user.put(key, Kchar);
//			}
//			
//			
//		}
	}
}

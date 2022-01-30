package openChat;

import java.util.HashMap;
import java.util.Map;

public class Solution_re {
	
	public static String[] solution(String[] record) {
		
		int count = 0;
		HashMap<String, String> user = new HashMap<>();
		String id;
		String Kchar;
		int firstSpace,secondSpace;
		
		
		for(int i = 0;i<record.length;i++) {
			firstSpace = record[i].indexOf(" ");
			if(record[i].startsWith("Enter")) {
				secondSpace = (record[i].substring(firstSpace+1,record[i].length())).indexOf(" ")+firstSpace+1;
				count++;
			}
			else if(record[i].startsWith("Leave")) {
				count++;
				continue;
			}
			else {
				secondSpace = (record[i].substring(firstSpace+1,record[i].length())).indexOf(" ")+firstSpace+1;
			}
			id = record[i].substring(firstSpace+1, secondSpace);
			
			Kchar = record[i].substring(secondSpace+1, record[i].length());
			
			user.put(id, Kchar);
		}
		
		int j =0;
		
		String[] answer = new String[count];
		for(int i = 0; i< count; i++) {
			
			if(record[j].startsWith("Change")) {
				i--;
				j++;
				continue;
			}
			
			answer[i] = record[j];
			j++;
		}
		
		for(int i = 0; i<count;i++) {
			firstSpace = answer[i].indexOf(" ");
			if(answer[i].startsWith("Enter")) {
				secondSpace = (answer[i].substring(firstSpace+1)).indexOf(" ")+firstSpace+1;
				id = answer[i].substring(firstSpace+1, secondSpace);
				answer[i] = user.get(id) + "´ÔÀÌ µé¾î¿Ô½À´Ï´Ù.";
			}
			else if(answer[i].startsWith("Leave")) {
				id = answer[i].substring(firstSpace+1, answer[i].length());
				answer[i] = user.get(id) + "´ÔÀÌ ³ª°¬½À´Ï´Ù.";
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String[] a = {"Enter a b", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 BRyan","Enter cd d"};
    	
    	for(int i =0; i<solution(a).length;i++) {
    		System.out.println(solution(a)[i]);
    	}
	}
	
}

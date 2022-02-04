package chusuktraffic;

import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Solution {
	public static int solution(String[] lines) {
		int N = lines.length;
		int hour;
		int min;
		int sec;
		int date;
		int month;
        int answer = 0;
        return answer;
    }
	
	public static void main(String[] args) {
		String dateTime = "01/10/2020 06:43:21";
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.from(formatDateTime.parse(dateTime));
        Timestamp ts = Timestamp.valueOf(localDateTime);

        System.out.println(ts);
        
        
        String dateTime2 = "01/10/2020 06:43:24";
        DateTimeFormatter formatDateTime2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime2 = LocalDateTime.from(formatDateTime2.parse(dateTime2));
        Timestamp ts2 = Timestamp.valueOf(localDateTime2);
        
        System.out.println(ts2);
        
        System.out.println(localDateTime);
        
	}
}

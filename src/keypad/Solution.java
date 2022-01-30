package keypad;

public class Solution {
	public String solution(int[] numbers, String hand) {
        int lp =0;
        int rp =0;
        int[][] button = new int [4][3];
        char[] an = new char[numbers.length]; 
        
        int ll = numbers.length;
        
        for(int i = 0; i<4;i++) {
        	for(int j = 0; j<3; j++) {
        		button[i][j] = 0;
        	}
        }
        
        if(hand == "left") {
        	button[3][0] = 2;
        	button[3][2] = 1;
		}
        
        else {
        	button[3][0] = 1;
        	button[3][2] = 2;
        }
        
        for(int i = 0; i < ll; i++) {
        	int x;
        	lp = button[3][0];
        	rp = button[3][2];
        	int n = numbers[i];
        	switch(n) {
        	case 1:
        	case 4:
        	case 7:
        		for(int a = 0; a<4;a++) {
                	for(int b = 0; b<3; b++) {
                		if(button[a][b]==rp) {
                			continue;
                		}
                		button[a][b] = 0;
                	}
                }
        		switch(n) {
        		case 1:
        			button[0][0] = lp;
        			an[i] = 'L';
        			break;
        		case 4:
        			button[1][0] = lp;
        			an[i] = 'L';
        			break;
        		case 7:
        			button[2][0] = lp;
        			an[i] = 'L';
        			break;
        		}
        	case 3:
        	case 6:
        	case 9:
        		for(int a = 0; a<4;a++) {
                	for(int b = 0; b<3; b++) {
                		if(button[a][b]==lp) {
                			continue;
                		}
                		button[a][b] = 0;
                	}
                }
        		switch(n) {
        		case 3:
        			button[0][2] = rp;
        			an[i] = 'R';
        			break;
        		case 6:
        			button[1][2] = rp;
        			an[i] = 'R';
        			break;
        		case 9:
        			button[2][2] = rp;
        			an[i] = 'R';
        			break;
        		}
        	case 2:
        	case 5:
        	case 8:
        	case 0:
        		if(hand == "left") {
        			for(int a = 0; a<4;a++) {
                    	for(int b = 0; b<3; b++) {
                    		if(button[a][b]==rp) {
                    			continue;
                    		}
                    		button[a][b] = 0;
                    	}
                    }
        			switch(n) {
            		case 2:
            			button[0][1] = lp;
            			an[i] = 'L';
            			break;
            		case 5:
            			button[1][1] = lp;
            			an[i] = 'L';
            			break;
            		case 8:
            			button[2][1] = lp;
            			an[i] = 'L';
            			break;
            		case 0:
            			button[3][1] = lp;
            			an[i] = 'L';
            			break;
            		}
        		}
        		else {
        			for(int a = 0; a<4;a++) {
                    	for(int b = 0; b<3; b++) {
                    		if(button[a][b]==lp) {
                    			continue;
                    		}
                    		button[a][b] = 0;
                    	}
                    }
        			switch(n) {
            		case 2:
            			button[0][1] = rp;
            			an[i] = 'R';
            			break;
            		case 5:
            			button[1][1] = rp;
            			an[i] = 'R';
            			break;
            		case 8:
            			button[2][1] = rp;
            			an[i] = 'R';
            			break;
            		case 0:
            			button[3][1] = rp;
            			an[i] = 'R';
            			break;
            		}
        		}
        	}
        }
        
        String answer = new String(an);
        
        return answer; 
    }
}

package numEngGame;

import java.util.Arrays;

public class Solution {
	public int solution(String s) {
        int answer = 0;
        char[] c = s.toCharArray();
        int l = c.length;
        int[] ci = new int[l];
        int aspn = 48;
        int cil = 0;
        int count = 0;
        
        // ���� String�� ��ȯ�� Char�� �迭�� ���� �� ���� 
        // �� ���� ���� ������
        // ���� ������ �״�� �ް� �迭 �ѹ� +1
        // ���ܾ� ������ ���ĺ� ����-1 ��ŭ �迭 �ѹ� +
        
        // char���� ��Ʈ�� ��ȯ�� �� �ǵ���� ���ڰ� �ȳ����Ƿ�
        //�˻��� �ϴ��� �� ����� �غ��� ��Ȯ�� ���ڰ� ������
        // ���� ��������.
        for(int i = 0; i < l; i++) {
        	count += 1;
        		switch (c[i]) {//switch case������ ���ڿ� ���� �и�
				case 'z':
					ci[cil]= (int)c[i]-122 +0;
					cil +=1;
					i += 3;
					break;
				case 'o':
					ci[cil]= (int)c[i]- 111+1;
					cil +=1;
					i += 2;
					break;
				case 't':
					if(c[i+1] == 'w') {
						ci[cil]= (int)c[i]- 116+2;
						cil +=1;
						i += 2;
						break;
					}
					else {
						ci[cil]= (int)c[i]- 116+3;
						cil +=1;
						i += 4;
						break;
					}
					
				case 'f':
					if(c[i+1] == 'o') {
						ci[cil]= (int)c[i]- 102+4;
						cil +=1;
						i += 3;
						break;
					}
					else {
						ci[cil]= (int)c[i]- 102+5;
						cil +=1;
						i += 3;
						break;
					}
				
				case 's':
					if(c[i+1] == 'i') {
						ci[cil]= (int)c[i]- 115+6;
						cil +=1;
						i += 2;
						break;
					}
					else {
						ci[cil]= (int)c[i]- 115+7;
						cil +=1;
						i += 4;
						break;
					}
				
				case 'e':
					ci[cil]= (int)c[i]- 101 +8;
					cil +=1;
					i += 4;
					break;
					
				case 'n':
					ci[cil]= (int)c[i]- 110 +9;
					cil +=1;
					i += 3;
					break;	
				default:
					ci[cil]= (int)c[i] - aspn;
					cil +=1;
					break;
				}
        }
        //�迭�� �׿� ���̰� �����Ƿ� �ٽ� �Űܾ���
        int[] ai = new int[count];
        for(int i = 0; i<count;i++) {
        	ai[i] = ci[i];
        }
        //ù°�ڸ����� 10�� ������ ���Ͽ� 5+2+7+8+
        //�� �ƴ� 5000+200+70+8�� �Ͽ� 5278 ������ �ؾ���
        for(int i = (ai.length-1); i>0; i--) {
        	for(int j = 0; j<i; j++) {
        		ai[j] = ai[j] * 10;
        	}
        }
        
        //�迭�� 5000 200 70 8 �̷��� ������ �� �����ָ� ��.
        for(int i = 0; i<ai.length;i++) {
        	answer += ai[i];
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		char[] b = {'0','1','2','3','4','5','6','7','8','9','a'};
		int[] a = new int[b.length];
		for(int i = 0;i<b.length;i++) {
			a[i] = (int)b[i];
			System.out.println("a["+ i + "]: " + a[i]);
			System.out.println("b["+ i + "]: " + b[i]);
		}
		
		char[] c = {'z','o','t','f','s','e','n'};
		
		for(int i = 0;i<c.length;i++) {
			System.out.println("c["+ i + "]: " + c[i]);
			System.out.println("c["+ i + "]: " + (int)c[i]);
		}
		
		for(int i = 0; i<c.length;i++) {
			
		}
		
		
		int[] arr = new int [5];
		for(int i=0; i <3; i++) {
			arr[i] = 1;
		}
		
		for(int i=0; i <5; i++) {
			System.out.println(arr[i]);
		}
	}
}
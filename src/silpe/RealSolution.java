package silpe;

import java.util.ArrayList;

public class RealSolution {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] arrive = new int[N]; // �ش� �ܰ���� ������ ����
        int[] fail = new int[N]; // ����
        ArrayList<Double> percentage = new ArrayList<Double>();

        // �ܰ躰 ���� �� ���� counting
        for (int i = 0; i < stages.length; i++) {
            for (int j = 0; j < stages[i]; j++) {
                // �ְ� �ܰ� �̻��̸� pass
                if (j >= N) {
                    break;
                }
                arrive[j]++;
                if (j == stages[i] - 1) {
                    fail[j]++;
                }
            }
        }

        // Percent ���
        for (int i = 0; i < N; i++) {
            if (arrive[i] == 0) {
                percentage.add(0.); // �ش� �ܰ���� ������ ���� ���� ��쿡 ���� ���� ó��
            } else {
                percentage.add((double) ((double) fail[i] / (double) arrive[i]));
            }
            System.out.println((i+1) + "�ܰ� : " + fail[i] + " / " + arrive[i] + " = " + percentage.get(i));
        }

        // �������� ���� �ܰ���� �迭�� ����
        ArrayList<Integer> maxArr = new ArrayList<>();
        double max = -99999999.0f;
        int maxIndex = 999999;
        for (int i = 0; i < percentage.size(); i++) {
            max = -99999999.0f;
            maxIndex = -1;
            for (int j = 0; j < percentage.size(); j++) {
                if (maxArr.contains(j)) {
                    continue;
                }
                if (max < percentage.get(j)) {
                    max = percentage.get(j);
                    maxIndex = j;
                }
            }
            maxArr.add(maxIndex);
        }

        // ���Ե� �迭�� ���� �迭�� ����
        for (int i = 0; i < maxArr.size(); i++) {
            answer[i] = (maxArr.get(i) + 1);
        }
        return answer;
	}
}

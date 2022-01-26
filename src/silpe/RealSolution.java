package silpe;

import java.util.ArrayList;

public class RealSolution {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] arrive = new int[N]; // 해당 단계까지 도달한 개수
        int[] fail = new int[N]; // 실패
        ArrayList<Double> percentage = new ArrayList<Double>();

        // 단계별 도달 및 실패 counting
        for (int i = 0; i < stages.length; i++) {
            for (int j = 0; j < stages[i]; j++) {
                // 최고 단계 이상이면 pass
                if (j >= N) {
                    break;
                }
                arrive[j]++;
                if (j == stages[i] - 1) {
                    fail[j]++;
                }
            }
        }

        // Percent 계산
        for (int i = 0; i < N; i++) {
            if (arrive[i] == 0) {
                percentage.add(0.); // 해당 단계까지 도달한 적이 없을 경우에 대한 예외 처리
            } else {
                percentage.add((double) ((double) fail[i] / (double) arrive[i]));
            }
            System.out.println((i+1) + "단계 : " + fail[i] + " / " + arrive[i] + " = " + percentage.get(i));
        }

        // 실패율이 높은 단계부터 배열에 삽입
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

        // 삽입된 배열을 정답 배열에 복사
        for (int i = 0; i < maxArr.size(); i++) {
            answer[i] = (maxArr.get(i) + 1);
        }
        return answer;
	}
}

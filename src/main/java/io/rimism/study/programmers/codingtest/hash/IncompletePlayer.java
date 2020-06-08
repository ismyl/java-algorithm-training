package io.rimism.study.programmers.codingtest.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class IncompletePlayer {
  /*
   * 정확성  테스트는 통과, 효율성 테스트를 통과하지 못함, key와 value에 대한 구상이 잘못됨
   * */
  public String solution(String[] participant, String[] completion) {
    if (completion.length >= participant.length) {
      throw new IllegalArgumentException();
    }

    // 중복값이 존재할 수 있으므로 참가자 명단을 Map 으로 변환한다.
    Map<Integer, String> participantMap = new HashMap<>();
    for (int i = 0; i < participant.length; i++) {
      participantMap.put(i, participant[i]);
    }

    // 합격자 명단을 순회하며 합격자가 참가자 Map에 존재할 경우 참가자 Map의 첫번째 대상 합격자를 찾아 제거한다
    for (String comp : completion) {
      if (participantMap.containsValue(comp)) {
        participantMap.keySet()
            .stream()
            .filter(key -> comp.equals(participantMap.get(key)))
            .findFirst()
            .ifPresent(participantMap::remove);
      }
    }

    return participantMap.values().parallelStream().collect(Collectors.joining());
  }

  /*
   * 참가자 명을 key로 활용한 HashMap 풀이
   * */
  public String solutionHashKey(String[] participant, String[] completion) {
    String answer = "";
    HashMap<String, Integer> hm = new HashMap<>();
    for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
    for (String player : completion) hm.put(player, hm.get(player) - 1);

    for (String key : hm.keySet()) {
      if (hm.get(key) != 0) {
        answer = key;
      }
    }
    return answer;
  }

  /*
   * sort를 활용한 풀이. 두 배열을 정렬하여 각 index로 비교하면 일치하지 않는 값, 혹은 참가자 중 마지막 남은 값이 정답이다
   * Hash를 사용하지 않았으나 참고가 되는 풀이
   * */
  public String solutionSort(String[] participant, String[] completion) {
    Arrays.sort(participant);
    Arrays.sort(completion);

    int i;

    for (i = 0; i < completion.length; i++) {
      if (!participant[i].equals(completion[i])) {
        return participant[i];
      }
    }

    return participant[i];
  }
}

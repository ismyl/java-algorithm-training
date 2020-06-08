package io.rimism.study.programmers.codingtest.hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IncompletePlayerTest {

  private IncompletePlayer incompletePlayer;

  @Before
  public void setUp() throws Exception {
    this.incompletePlayer = new IncompletePlayer();
  }

  @Test
  public void 입출력_예제_1() {
    assertEquals("leo", incompletePlayer.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
  }

  @Test
  public void 입출력_예제_2() {
    assertEquals("vinko", incompletePlayer.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"marina", "josipa", "nikola", "filipa"}));
  }

  @Test
  public void 입출력_예제_3() {
    assertEquals("mislav", incompletePlayer.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
  }
}
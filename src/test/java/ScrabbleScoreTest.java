import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScoreTest {

  @Test
  public void ScrabbleScore_returnsAScrabbleScoreForALetter_1() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 1;
    assertEquals(score, scrabbleScore.ScrabbleScore("a"));
  }

//   @Test
// public void leetSpeakTranslator_replacesEveryEWithA3_wordChanges() {
//   LeetSpeak testLeetSpeak = new LeetSpeak();
//   assertEquals("3l3phant", testLeetSpeak.leetSpeakTranslator("elephant"));
// }
}

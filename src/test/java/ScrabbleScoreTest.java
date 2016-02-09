import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScoreTest {

  @Test
  public void ScrabbleScore_returnsAScrabbleScoreForALetter_1() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 1;
    assertEquals(score, scrabbleScore.ScrabbleScore("a"));
  }

  @Test
  public void ScrabbleScore_returnsAScrabbleScoreForALettersEqualToOne_10() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 10;
    assertEquals(score, scrabbleScore.ScrabbleScore("aeioulnrst"));
  }

  @Test
  public void ScrabbleScore_returnsAScrabbleScoreForALettersEqualAWord_7() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 7;
    assertEquals(score, scrabbleScore.ScrabbleScore("mop"));
  }
}

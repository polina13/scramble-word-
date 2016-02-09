import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleScoreTest {

  @Test
  public void isScrabbleScore_returnsAScrabbleScoreForALetter_1() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 1;
    assertEquals(score, scrabbleScore.isScrabbleScore("a"));
  }

  @Test
  public void isScrabbleScore_returnsAScrabbleScoreForALettersEqualToOne_10() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 10;
    assertEquals(score, scrabbleScore.isScrabbleScore("aeioulnrst"));
  }

  @Test
  public void isScrabbleScore_returnsAScrabbleScoreForALettersEqualAWord_7() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 7;
    assertEquals(score, scrabbleScore.isScrabbleScore("mop"));
  }

  @Test
  public void isScrabbleScore_returnsAScrabbleScoreForALettersEqualAnyWord_18() {
    ScrabbleScore scrabbleScore = new ScrabbleScore();
    Integer score = 18;
    assertEquals(score, scrabbleScore.isScrabbleScore("zoink"));
  }
}

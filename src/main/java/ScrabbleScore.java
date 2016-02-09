import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class ScrabbleScore {
  public static void main(String[] args) {}

  public static Integer ScrabbleScore(String userWord) {
    Integer score = 0;
    char[] pointOne = {'a','e','i','o','u','l','n','r','s','t'};
    char[] userWordArray = userWord.toCharArray();
    for (char userWordLetter : userWordArray) {

      for (char letter : pointOne) {
        if( letter == 'a') {
          score += 1;
        }
      }
    }
    return score;


  }
}

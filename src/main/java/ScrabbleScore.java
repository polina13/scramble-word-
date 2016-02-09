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
    char[] pointThree = {'b','c','m','p'};

    char[] userWordArray = userWord.toCharArray();

      for (char letter : userWordArray) {
        if( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'l' || letter == 'n' || letter == 'r' || letter == 's' || letter == 't' ) {
          score += 1;
        }
      }
      for (char letter : userWordArray) {
        if( letter == 'm' || letter == 'c' || letter == 'b' || letter == 'p')
          score += 3;
      }

    return score;


  }
}

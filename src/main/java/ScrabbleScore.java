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
    String userPoint = userWord.replaceAll("a", "1");

    Integer userPointNumber = Integer.parseInt(userPoint);
    score += userPointNumber;
    return score;
  }
}

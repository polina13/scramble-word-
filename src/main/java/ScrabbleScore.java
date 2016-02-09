import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class ScrabbleScore {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, reponse) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/output", (request, reponse) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/output.vtl");
      String userWord = request.queryParams("userWord");
      Integer results = ScrabbleScore.isScrabbleScore(userWord);
      model.put("results", results);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

  public static Integer isScrabbleScore(String userWord) {
    userWord.toLowerCase();
    Integer score = 0;

    char[] userWordArray = userWord.toCharArray();

      for (char letter : userWordArray) {
        if( letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'l' || letter == 'n' || letter == 'r' || letter == 's' || letter == 't' ) {
          score += 1;
        }
        if( letter == 'm' || letter == 'c' || letter == 'b' || letter == 'p') {
          score += 3;
        }
        if( letter == 'f' || letter == 'h' || letter == 'v' || letter == 'w' || letter == 'y') {
          score += 4;
        }
        if( letter == 'k') {
          score += 5;
        }
        if( letter == 'j' || letter == 'x') {
          score += 8;
        }
        if(letter == 'q' || letter == 'z') {
          score += 10;
        }

     }
     return score;
  }
}

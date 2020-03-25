import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

  public static String getIpAddress(String text) {
String string = "[0-2]?[0-9]{0,2}[.][0-2]?[0-9]{0,2}[.][0-2]?[0-9]{0,2}[.][0-2]?[0-9]{0,2}";
Pattern pattern = Pattern.compile(string);
    Matcher matcher = pattern.matcher(text);
    String expectedResult = "";
    if(matcher.find()){
      expectedResult = matcher.group(0);
    }
    return expectedResult;
  }
}
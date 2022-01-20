import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Expressions {


    public void patern() {
        String re = "[0-9]";
        String text = "12121212";
        Pattern pattern = Pattern.compile(re, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

    }









}

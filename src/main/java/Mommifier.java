import java.util.ArrayList;
import java.util.Arrays;

public class Mommifier {

    public static final ArrayList<Character> VOWELS = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    String convert(String string) {
        if(string.equals("")) {
            return "";
        }
        int vowelsCount = 0;
        for (char item : VOWELS) {
            if(VOWELS.contains(item)) {
                vowelsCount ++;
            }
        }
        if(vowelsCount / string.length() < 0.3) {
            return string;
        }
        return null;
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Mommifier {

    public static final ArrayList<Character> VOWELS = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public static final double LIMIT = 0.3;

    String convert(String string) {
        if(string.equals("")) {
            return "";
        }
        int vowelsCount = getVowelsCount();
        if(vowelLimitReached(string, vowelsCount)) {
            ArrayList vowelIndexArr = new ArrayList();
            for (int i = 0; i < string.length() - 1; i ++) {
                char preChar = string.charAt(i);
                char nextChar = string.charAt(i + 1);
                if(VOWELS.contains(preChar) && VOWELS.contains(nextChar)) {
                    vowelIndexArr.add(i+1);
                }

            }
            StringBuffer temp = new StringBuffer(string);
            for (int i = vowelIndexArr.size() - 1; i >= 0; i --) {
                temp.insert((int)vowelIndexArr.get(i), "memmy");
            }
            return temp.toString();
        }
        return string;
    }

    private boolean vowelLimitReached(String string, float vowelsCount) {
        return vowelsCount / string.length() > LIMIT;
    }

    private int getVowelsCount() {
        int vowelsCount = 0;
        for (char item : VOWELS) {
            if(VOWELS.contains(item)) {
                vowelsCount ++;
            }
        }
        return vowelsCount;
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Mommifier {

    public static final ArrayList<Character> VOWELS = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public static final double LIMIT = 0.3;

    String convert(String string) throws Exception{
        if(string.equals("")) return "";
        if(!string.matches("^[A-Za-z0-9]+$")) {
            throw new Exception("input is wrong");
        }
        int vowelsCount = getVowelsCount(string);
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
                temp.insert((int)vowelIndexArr.get(i), "mommy");
            }
            return temp.toString();
        }
        return string;
    }

    private boolean vowelLimitReached(String string, float vowelsCount) {
        return vowelsCount / string.length() > LIMIT;
    }

    private int getVowelsCount(String string) {
        int vowelsCount = 0;
        for (int i = 0; i < string.length(); i ++) {
            if(VOWELS.contains(string.charAt(i))) {
                vowelsCount ++;
            }
        }
        return vowelsCount;
    }
}

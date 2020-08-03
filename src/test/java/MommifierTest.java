import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {
    @Test
    void should_return_empty_when_convert_given_params_is_empty() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("");
        Assertions.assertEquals("", result);
    }
    @Test
    void should_return_original_when_convert_given_the_number_of_vowels_are_not_more_than_30_percent_of_the_string_length() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("allset");
        Assertions.assertEquals("allset", result);
    }

}

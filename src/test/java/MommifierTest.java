import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MommifierTest {
    @Test
    void should_return_empty_when_convert_given_params_is_empty() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("");
        Assertions.assertEquals("", result);
    }

}

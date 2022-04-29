import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestSentence {
    @ParameterizedTest
    @ValueSource(strings = {"aaaaabbbbb bbbbbaaaa","iiiiiisssss ffffffhhhhh"})
    public void TestString(StringBuilder Sentences ){
        Assertions.assertThrows(IllegalArgumentException.class,()->{
            Sentence sentence = new Sentence();
            sentence.SentenceTranslate(Sentences);
        });

    }

}

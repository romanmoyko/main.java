import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestError {
    @Test
    public void VaildSentence (){
        Sentence sentence = new Sentence();
        StringBuilder sentTest = new StringBuilder("aaaaaabbbbb");
        StringBuilder Sent = sentence.SentenceTranslate(sentTest);
        Assertions.assertEquals("bbbbbaaaaaa",Sent);
    }
}

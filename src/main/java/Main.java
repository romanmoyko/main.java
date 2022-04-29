import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sentence sentence = new Sentence();

        Scanner in = new Scanner(System.in);
        System.out.println("input your sentence");
        StringBuilder sent = new StringBuilder(in.nextLine());
        StringBuilder Sent = sentence.SentenceTranslate(sent);
        System.out.println(Sent);
    }
}

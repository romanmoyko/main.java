public class Sentence {


    public StringBuilder SentenceTranslate(StringBuilder sent){
        int lengthArray;
        StringBuilder SetFinal = new StringBuilder();

        while(sent.length ()>0){

            if (sent.indexOf (" ") >0) {
                lengthArray = sent.indexOf(" ");
                char[] letters = new char [lengthArray];
                sent.getChars(0,sent.indexOf(" "),letters,0);
                SetFinal.append(replayce(letters));
                sent.delete(0,sent.indexOf(" "));
            }else{
                lengthArray = sent.length();
                char[] letters = new char [sent.length()];
                sent.getChars(0,sent.length(),letters,0);
                SetFinal.append(replayce(letters));
                sent.delete(0,sent.length());
            }
            SetFinal.append(" ");
        }
        return SetFinal;
    }

    public StringBuilder replayce (char[] letters){
        StringBuilder Word = new StringBuilder();
        for (int i = letters.length-1;i>=0;i--){
            Word.append(letters[i]);
        }
        return Word;
    }
}

/** MainCode - creates an instance of a simple flashcard program */
public class MainCode {
    public static void main(String[] args){
        MainCode q = new MainCode();
        q.go();
    }
    private void go(){
        QuizCardBuilder quizCardBuilder = new QuizCardBuilder(new Deck());
        quizCardBuilder.build();
    }
}

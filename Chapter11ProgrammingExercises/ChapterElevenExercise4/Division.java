package ChapterElevenExercise4;

public abstract class Division {
    protected String divisionTitle;
    protected int accountNumber;
    public Division(String title, int num){
        divisionTitle = title;
        accountNumber = num;
    }
    public abstract void display();


}

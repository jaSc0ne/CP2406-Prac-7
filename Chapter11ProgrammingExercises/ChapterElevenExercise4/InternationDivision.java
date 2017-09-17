package ChapterElevenExercise4;

public class InternationDivision extends Division {
    protected String country;
    protected String language;
    InternationDivision(String title, int num, String country, String language){
        super(title, num);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("\nInternational Division: "+divisionTitle+" Account #"+accountNumber);
        System.out.println("Located in "+country+". Language spoken is "+language);
    }
}

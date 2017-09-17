package ChapterElevenExercise1;

public class UseBook {
    public static void main(String args[]){
        Fiction novel1 = new Fiction("A Novel");
        NonFiction nonFiction1 = new NonFiction("A Textbook");
        System.out.println("Fiction "+novel1.getTitle()+" costs $"+novel1.getPrice());
        System.out.println("Non Fiction "+nonFiction1.getTitle()+" costs $"+nonFiction1.getPrice());
    }


}

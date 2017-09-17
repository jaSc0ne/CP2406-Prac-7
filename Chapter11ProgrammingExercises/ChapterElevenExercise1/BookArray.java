package ChapterElevenExercise1;

public class BookArray {

    public static void main(String args[]){
        Book selectionBooks[] = new Book[10];
        int i;
        selectionBooks[0] = new Fiction("Casino Royale");
        selectionBooks[1] = new NonFiction("How to program in Java");
        selectionBooks[2] = new Fiction("Live and Let Die");
        selectionBooks[3] = new NonFiction("How to program in C");
        selectionBooks[4] = new Fiction("Moonraker");
        selectionBooks[5] = new NonFiction("Electrical Circuits for Dummies");
        selectionBooks[6] = new Fiction("Diamonds are Forever");
        selectionBooks[7] = new NonFiction("Signal Processing with MATLAB");
        selectionBooks[8] = new Fiction("Dr. No");
        selectionBooks[9] = new NonFiction("Advanced Quantum Physics");

        for(i = 0; i<selectionBooks.length; i++){
            System.out.println("Book: "+selectionBooks[i].getTitle()+" costs $"+selectionBooks[i].getPrice());
        }

    }

}

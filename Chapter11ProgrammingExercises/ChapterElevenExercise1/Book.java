package ChapterElevenExercise1;

public abstract class Book {
    String title = new String();
    double price;

    public Book(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
    public abstract void setPrice();
}

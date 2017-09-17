package ChapterElevenExercise4;

import com.sun.java.browser.plugin2.DOM;

public class UseDivision {
    public static void main(String args[]){
        DomesticDivision firstDomestic = new DomesticDivision("Marketing", 42, "Queensland");
        DomesticDivision secondDomestic = new DomesticDivision("R&D", 36, "New South Wales");
        InternationDivision firstInternational = new InternationDivision("Marketing", 12, "Australia", "English");
        InternationDivision secondInternational = new InternationDivision("R&D", 108, "France", "French");

        firstDomestic.display();
        secondDomestic.display();
        firstInternational.display();
        secondInternational.display();
    }


}

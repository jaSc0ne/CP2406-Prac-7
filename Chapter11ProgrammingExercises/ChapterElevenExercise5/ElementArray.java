package ChapterElevenExercise5;

public class ElementArray {
    public static void main(String args[]){

        Element listOfElements[] = new Element[4];
        int i;
        listOfElements[0] = new MetalElement("Ag", 47, 107.8682);
        listOfElements[1] = new NonMetalElement("C", 6, 12.0107);
        listOfElements[2] = new MetalElement("Pt",78, 195.084);
        listOfElements[3] = new NonMetalElement("Si", 14, 28.0855);

        for(i = 0; i < listOfElements.length; i++){
            listOfElements[i].describeElement();
        }


    }


}

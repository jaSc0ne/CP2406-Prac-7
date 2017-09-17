package ChapterElevenExercise5;

public class NonMetalElement extends Element {

    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight){
        super(symbol, atomicNumber, atomicWeight);
    }
    public void describeElement(){
        System.out.println("This nonmetal is denoted as "+getSymbol()+" on the periodic table. It has a atomic number of "+getAtomicNumber()+
                " and has an atomic weight of "+getAtomicWeight()+". As it is a nonmetal, it is a poor electrical conductor.");
    }



}

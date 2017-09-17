package ChapterElevenExercise5;

public class MetalElement extends Element {

    public MetalElement(String symbol, int atomicNumber, double atomicWeight){
        super(symbol, atomicNumber, atomicWeight);
    }
    public void describeElement(){
        System.out.println("This metal is denoted as "+getSymbol()+" on the periodic table. It has a atomic number of "+getAtomicNumber()+" and" +
                "has an atomic weight of "+getAtomicWeight()+". As it is a metal, it is a good electrical conductor.");
    }


}

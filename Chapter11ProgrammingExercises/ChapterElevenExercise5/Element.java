package ChapterElevenExercise5;

public abstract class Element {
    String symbol;
    int atomicNumber;
    double atomicWeight;
    public Element(String symbol, int atomicNumber, double atomicWeight){
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }
    public String getSymbol(){
        return symbol;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }
    public abstract void describeElement();
}

package ChapterElevenExercise2;

public abstract class PhoneCall {
    String phoneNumber = new String();
    double priceOfCall;

    PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        priceOfCall = 0.0;
    }
    public void setPriceOfCall(double priceOfCall){
        this.priceOfCall = priceOfCall;
    }

    public abstract String getPhoneNumber();
    public abstract double getPriceOfCall();
    public abstract void getInformation();



}

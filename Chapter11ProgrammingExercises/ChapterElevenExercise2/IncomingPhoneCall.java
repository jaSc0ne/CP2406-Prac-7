package ChapterElevenExercise2;

public class IncomingPhoneCall extends PhoneCall {

    public static final double RATE = 0.02;
    public IncomingPhoneCall(String phoneNumber){
        super(phoneNumber);
        priceOfCall = RATE;
    }
    public void getInformation(){
        System.out.println("Incoming phone call "+getPhoneNumber()+" "+RATE+" per call. Total is $"+getPriceOfCall());
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public double getPriceOfCall(){
        return priceOfCall;
    }
}

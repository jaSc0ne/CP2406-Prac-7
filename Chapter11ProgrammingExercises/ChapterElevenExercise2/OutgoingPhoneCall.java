package ChapterElevenExercise2;

public class OutgoingPhoneCall extends PhoneCall{

    public static final double RATE = 0.04;
    private int time; // time of outgoing call in minutes

    public OutgoingPhoneCall(String phoneNumber, int time){
        super(phoneNumber);
        this.time = time;
        priceOfCall = time*RATE;
    }

    @Override
    public void getInformation() {
        System.out.println("Outgoing phone call to "+getPhoneNumber()+" "+RATE+" per minute at "+time+" minutes. Total cost is $"+getPriceOfCall());
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public double getPriceOfCall(){
        return priceOfCall;
    }
}

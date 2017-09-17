package ChapterElevenExercise2;

public class DemoPhoneCalls {

    public static void main(String args[]){
        IncomingPhoneCall incomingCall = new IncomingPhoneCall("0429997192");
        OutgoingPhoneCall outgoingCall = new OutgoingPhoneCall("0428228282", 15);

        incomingCall.getInformation();
        outgoingCall.getInformation();

    }


}

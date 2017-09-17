package ChapterElevenExercise2;

public class PhoneCallArray {
    public static void main(String args[]){
        PhoneCall listOfCalls[] = new PhoneCall[10];
        int i;
        listOfCalls[0] = new IncomingPhoneCall("0428228282");
        listOfCalls[1] = new IncomingPhoneCall("0428188237");
        listOfCalls[2] = new OutgoingPhoneCall("47887467", 2);
        listOfCalls[3] = new OutgoingPhoneCall("47289909", 6);
        listOfCalls[4] = new IncomingPhoneCall("0428228282");
        listOfCalls[5] = new IncomingPhoneCall("0428188237");
        listOfCalls[6] = new OutgoingPhoneCall("47887467", 8);
        listOfCalls[7] = new OutgoingPhoneCall("47289909", 3);
        listOfCalls[8] = new OutgoingPhoneCall("0429997192", 10);
        listOfCalls[9] = new IncomingPhoneCall("47636198");
        for(i = 0; i < listOfCalls.length; i++){
            listOfCalls[i].getInformation();
        }
    }


}

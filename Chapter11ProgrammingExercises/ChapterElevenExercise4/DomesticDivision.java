package ChapterElevenExercise4;

public class DomesticDivision extends Division {
        protected String state;
        public DomesticDivision(String title, int num, String state){
            super(title, num);
            this.state = state;
        }
        public void display(){
            System.out.println("\nDomestic Division: "+divisionTitle+" Account #"+accountNumber+"\nLocated in "+state);
        }


}

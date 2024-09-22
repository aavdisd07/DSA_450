package RSL_Questions;

public class HrMinAngle {
    public static void main(String[] args) {
        int hour = 12;
        int minute = 35;

        // Convert hour to 0 if it's 12 to fit the clock model
        if (hour == 12) {
            hour = 0;
        }
        int minuteAngle =minute*6;
         // as each minute rotate 6deg
         float hourAngle= (float) hour*30+ (minute/60.f)*30;
         float angle= minuteAngle-hourAngle;
        if(angle>180){
         angle=360-angle;
        }
         System.out.println("Angle between hour and minute hands: " + angle + " degrees");
    }
}

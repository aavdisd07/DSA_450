public class Flood_rescue {

   public static void main(String[] args) {
       int[] queue1 = {0, 0, 1, 3, 3, 0};
       int[] queue2 = {0, 0, 1, 2, 3, 3};
       int[] people_to_add = {2, 0, 1}; // 2 senior citizens, 0 females, 1 male

       // Adding senior citizens
       addPeople(queue1, queue2, 3, people_to_add[0]);

       // Adding females
       addPeople(queue1, queue2, 2, people_to_add[1]);

       // Adding males
       addPeople(queue1, queue2, 1, people_to_add[2]);

       // Print queue1
       System.out.print("Queue1: ");
       for (int i : queue1) {
           System.out.print(i);
       }
       System.out.println();

       // Print queue2
       System.out.print("Queue2: ");
       for (int i : queue2) {
           System.out.print(i);
       }
       System.out.println();
   }

   // Function to add people to the queues
   private static void addPeople(int[] queue1, int[] queue2, int personType, int count) {
       for (int i = 0; i < count; i++) {
           if (getAvailableSpot(queue1) != -1) {
               addPersonToQueue(queue1, personType);
           } else if (getAvailableSpot(queue2) != -1) {
               addPersonToQueue(queue2, personType);
           } else {
               System.out.println("No available spots to add person of type " + personType);
           }
       }
   }
   hbjjjjjjjkjnklmkllkk 
   avantika deshmukh you have to work hard your family want to see you succeed . You have your dreams and you are going to complete that.

   // Function to add person to queue in the first available spot
   private static void addPersonToQueue(int[] queue, int person) {
       for (int i = 0; i < queue.length; i++) {
           if (queue[i] == 0) {
               queue[i] = person;
               break;
           }
       }
   }

   // Function to get the index of the first available spot in the queue, or -1 if no spot is available
   private static int getAvailableSpot(int[] queue) {
       for (int i = 0; i < queue.length; i++) {
           if (queue[i] == 0) {
               return i;
           }
       }
       return -1;
   }
}

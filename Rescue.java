
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Rescue {

    public static void main(String[] args) {
        int[] arr ={0,0,0, 1, 3, 3};
        int[] arr2 = { 0,0,0, 2, 3, 3};
        int[] add_p = {2, 0, 1};
        Queue<Integer> a = new LinkedList<>();
        Queue<Integer> b = new LinkedList<>();
        for (int i : arr) {
            a.add(i);
        }

        for (int i : arr2) {
            b.add(i);
        }
        if(a.contains(0)|| b.contains(0)){
         for(int i=0;i<add_p.length;i++){
            if(add_p[i]%2==0){
               while(add_p[i]!=0){
               if(a.contains(0)){
                a.poll();
                a.add(3-i);
                add_p[i]--;
               }
                b.poll();
                b.add(3-i);
                add_p[i]--;
               }
            }
            else{
              a.poll();
              a.add(3-i);

            }

         }

            
        }

        

        Collections.sort((LinkedList<Integer>) a);
        Collections.sort((LinkedList<Integer>) b);

        System.out.println(a); // Expected output: [0, 1, 1, 3, 3, 3]
        System.out.println(b); // Expected output: [0, 0, 2, 3, 3, 3]
    }
}

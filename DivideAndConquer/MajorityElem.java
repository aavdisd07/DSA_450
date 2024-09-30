package DivideAndConquer;

import java.util.Hashtable;

public class MajorityElem {

    // Approach 1  O(N^2)
    static int MajorityElem1(int arr[], int si, int ei) {
        int target = arr.length / 2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            if (count >= target) {
                return arr[i];
            }
        }

        return -1;

    }
    // Approach 2 --> O(N) but extra space 
    static int MajorityElem2(int arr[], int si, int ei) {
        Hashtable<Integer, Integer> freqMap = new Hashtable<>();
        for (int i = si; i <= ei; i++) {
            // Get the current frequency of the element, or 0 if it hasn't appeared yet
            int count = freqMap.getOrDefault(arr[i], 0);
            // Increment the frequency by 1
            freqMap.put(arr[i], count + 1);
        }

        // Now, check for the majority element
        int majorityCount = (ei - si + 1) / 2;
        for (int key : freqMap.keySet()) {
            if (freqMap.get(key) > majorityCount) {
                return key; // Return the majority element if found
            }
        }

        return -1; // Return -1 if there is no majority element
    }
    // Approach 3 --> nlog(n) using merge Sort but as the condition is element count is greater than array.length/2 so the mid of array is always majority element so after the sorting whole array just return the mid element
    //   Approach 4 ----> Moore's Voting Algorithm 
    //    ------> In which the the voting is started from first element and if similar element is found then vote increment if not then vote decrement if vote is equal to 0 then majority element is upcoming element
    // this id O(n) and O(1)    ### Optimal solution####

       static int MajorityElement3(int arr[]){
        int majority=arr[0];
        int vote=0;
        for(int i=1;i<arr.length;i++){
            if(vote==0){
                majority=arr[i];
                vote++;
            }
          else if(arr[i]==majority){
                vote++;
            }
            else{
                vote--;
            }
            
        }
        return majority;
       }

    public static void main(String[] args) {
        int arr[] = {5,5,2,1,3,7,5,5,5,2};
        //approach 4 -->
       System.out.println( MajorityElement3(arr));
    }
}

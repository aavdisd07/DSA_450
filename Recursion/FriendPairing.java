public class FriendPairing {
    static int Pairfriend(int a){
        // base case
        if(a==1 || a==2){
            return a;
        }
        // choices for be single or pair
        // int Sin=Pairfriend(a-1);
        // int pair= Pairfriend(a-2);
        // int totalWays=(a-1)*pair+Sin;
        // return totalWays;
//   single choice + if(pair) then (n-1) remaining with whom n-2
        return Pairfriend(a-1)+(a-1)*Pairfriend(a-2);
    }
    public static void main(String[] args) {
        int no_of_Friends=3;
        System.out.println(Pairfriend(no_of_Friends));
    }
}

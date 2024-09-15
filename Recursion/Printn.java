class Printn{
    static void Likho(int a){
        if(a==0){
            return;
        }
        Likho(a-1);
        System.out.print(a+" ");


    }
    public static void main(String [] args){
         int n=10;
         Likho(n);
    }
}
class count_digits{

    static int  rev_no(int num){
      int ans=0;
      int count=0;
      int demo=num;
      while(num>0){
        ans=ans*10+num%10;
        num=num/10;
        count++;
      }
      String str;
      str=demo==ans?"True":"false";

      System.out.println(str);
    return count;
   }
    public static void main(String[] args) {
        int ans=rev_no(11);
      System.out.println(ans);
     
    }
}
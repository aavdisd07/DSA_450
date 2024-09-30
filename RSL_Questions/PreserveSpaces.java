package RSL_Questions;

public class PreserveSpaces {
    public static void main(String[] args) {
        String str="Avanti whar are u doing?";
        char strArr[]=str.toCharArray();
        int start=0;
        int end=strArr.length-1;

        for(char c:strArr){
            System.out.print(c);
        }
        System.out.println();
        while(start<end) {
         if(strArr[start]==' '){
            start++;
            continue;
         }
         if(strArr[end]==' '){
            end--;
            continue;
         }
         else{
            char temp=strArr[start];
            strArr[start]=strArr[end];
            strArr[end]=temp;
            start++;
            end--;
         }


        }


        for(char c:strArr){
            System.out.print(c);
        }
    
    
    }
}

class RemoveDuplicateFromString{
    static void RMD(String str,int ind,StringBuilder newStr,boolean Arr[]){
        if(ind==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentChar=str.charAt(ind);

        if(Arr[currentChar-'a']==true){
            RMD(str,ind+1,newStr,Arr);
        }
        else{
            Arr[currentChar-'a']=true;
            RMD(str,ind+1,newStr.append(currentChar),Arr);
        }
    }
    public static void main(String[] args) {
        String str="sggsieandtcollege";
        RMD(str,0,new StringBuilder(""), new boolean [26]);
    }
}
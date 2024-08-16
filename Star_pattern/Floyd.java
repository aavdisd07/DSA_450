package Star_pattern;

public class Floyd {
    public static void main(String[] args) {
        int row=5;
        int count=0;
        for(int i=0;i<=row;i++){
        for(int j=0;j<i;j++){
            System.out.print(++count+" ");
        }
        System.out.println();
        }
    }
}


// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
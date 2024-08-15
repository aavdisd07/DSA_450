class Min_jump {
    static int Minjumps(int arr[], int len) {
        if (len <= 1) {
            return 0;
        }
        if (arr[0] == 0) {
            return -1;
        }
        int maxReach = arr[0];
        int jumps = 1;
        int steps = arr[0];
        for (int i = 1; i < len; i++) {
            if (i == len - 1)
                return jumps;
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;
            if (steps == 0) {
                if (i > maxReach)
                    return -1;
                jumps++;
                steps = maxReach - i;

            }

        }

        return -1;
    }

    public static int MyMinjumps(int arr[], int length) {
        int maxReach = 0;
        int jumps = 0;
        int lastIndex = 0;
        for (int i = 0; i < length; i++) {

            maxReach = Math.max(maxReach, i + arr[i]);
            if (i == length - 1) {
                return jumps;
            }
            if (i >= maxReach) {
                return -1;
            }
            if (i == lastIndex) {
                jumps++;
                lastIndex = maxReach;

            }

        }

        return jumps;
    }

    public static void main(String[] args) {
        // int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};

        // System.out.println(Minjumps(arr, arr.length));
        // System.out.println( findDuplicate(arr));
    }

}
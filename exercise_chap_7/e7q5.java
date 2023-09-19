public class e7q5 {
    public static void main(String[] args) {
        int[] arr = {27, 15, 15, 11, 27};
        System.out.println(mode(arr));
    }

    public static int mode(int[] arr) {
        int[] frequency = new int[101]; 

        for (int num : arr) {
            frequency[num]++; 
        }
        int maxFrequency = 0;
        int modeValue = -1;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                modeValue = i;
            }
        }
        return modeValue;
    }
}


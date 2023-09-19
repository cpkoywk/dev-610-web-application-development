public class e4q6 {
    public static void main(String[] args) {
    printRange(9,2);
    printRange(2,7);
    printRange(19,11);
    printRange(5,5);
    }
    public static void printRange(int a,int b) {
        int numRange=b-a;
        int num=a;
        System.out.print(num + " ");

        if (numRange>=0){
        for (int i = 1; i <= numRange; i++) {
            num=num+1;
            System.out.print(num + " ");

        }
        }else{
            for (int i = -1; i >= numRange; i--) {
            num=num-1;
            System.out.print(num+" ");
        }
}         System.out.println("");

    }
}
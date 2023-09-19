public class e4q5 {
    public static void main(String[] args) {
        System.out.println(pow(9,2));
        System.out.println(pow(3,4));
        System.out.println(pow(5,3));

        System.out.println(pow(5,0));


    }
    public static int pow(int base,int exp) {
        int result=1;
        for (int i = 1; i < exp+1; i++) {
            result=result*base;
        }
        return result;


}


}

public class e4q14 {
    public static void main(String[] args) {
        System.out.println(pow2(9,2));
        System.out.println(pow2(-4,-3));
        System.out.println(pow2(-4,3));
        System.out.println(pow2(-4,0));
        System.out.println(pow2(4,-2));


    }
    public static double pow2(double base,int exp) {
        double result=1;
        if (exp>=0){
        for (int i = 1; i < exp+1; i++) {
            result=result*base;
        }}else{exp=Math.abs(exp);
            for (int i = 1; i < exp+1; i++) {
            result=result*(1/base);}}
        return result;


}


}

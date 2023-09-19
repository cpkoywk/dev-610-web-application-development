public class e4q15 {
    public static void main(String[] args) {
        System.out.println(getGrade(9));
        System.out.println(getGrade(99));
        System.out.println(getGrade(30));

    }
    public static double getGrade(int score) {
        if(score>100||score<0){
            throw new IllegalArgumentException("IllegalArgumentException");
        }  
        else{return (double) score/25;
}
}
}

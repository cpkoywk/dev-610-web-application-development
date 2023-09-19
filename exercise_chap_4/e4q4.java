public class e4q4 {
    public static void main(String[] args) {
        System.out.println(daysInMonth(9));
        System.out.println(daysInMonth(10));
        System.out.println(daysInMonth(2));


    }
    public static int daysInMonth(int m) {
        int result=0;
        if (m==1||m==3||m==5||m==7||m==8||m==10||m==12){
            result=31;
        }else if (m==4||m==6||m==9||m==11){
            result=30;
        }else if(m==2){
            result=28;

}
        return result;


}
}

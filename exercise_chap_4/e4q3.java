public class e4q3 {
    public static void main(String[] args) {
        System.out.println(season( 2,3));
        System.out.println(season( 12,1));
        System.out.println(season( 12,16));


    }
    public static String season(int m,int d) {
        String result="";
        int datee=m*100+d;
        if (datee>=1216||datee<=315){
            result="winter";
        }else if(datee>=316&&datee<=615){
            result="spring";
        }else if(datee>=616&&datee<=915){
            result="summer";
        }else if(datee>=916&&datee<=1215){
            result="fall";
}
        return result;


}
}

public class test {
    public static void main(String[] args) {
        Marketer myMarketer = new Marketer();
        myMarketer.advertise();
        Janitor myJanitor = new Janitor();
        myJanitor.clean();
        System.out.println(myJanitor.getHours());
        System.out.println(myJanitor.getSalary());

        MonsterTruck testMonsterTruck = new MonsterTruck();
        testMonsterTruck.m1();
        testMonsterTruck.m2();
        System.out.println(testMonsterTruck.toString());
        System.out.println("e9q8:");

        StudentAdvanceTicket myStudentAdvanceTicket=new StudentAdvanceTicket(2,2);
        System.out.println(myStudentAdvanceTicket.toString());
    }
}


/*
 * Method  Output/Return
 *  m1        monster 1
 *  m2        truck 1
 *            car 1
 *  toString  "monster vroomvroom"
 */
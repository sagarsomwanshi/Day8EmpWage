public class EmpWage {
    static int workHour,workDay,fullDay,halfDay;
    int hourWage = 20;
    String emp1 = "Regular Employee";
    String emp2 = "Part Time Employee";
    public static void main(String[] args) {
        EmpWage E = new EmpWage();
        UC5(E.emp1);
        UC5(E.emp2);
    }
    public static int UC1(){
        int attendance = (int) ((Math.random() * 10) % 3);
        return attendance;
    }
    public static void UC2(){
        EmpWage E = new EmpWage();
        switch (UC1()) {
            case 0 :
                workHour += 8;
                workDay++;
                fullDay++;
                break;
            case 1:
                workHour += 4;
                workDay++;
                halfDay++;
                break;
        }
    }
    public static void UC5(String X){
        EmpWage E = new EmpWage();
        while(workDay <=20 && workHour<100){
            UC2();
        }
        System.out.println("\n"+X+" : ");
        System.out.println("Full Day : " +fullDay+" Days");
        System.out.println("Half Day : " +halfDay+" Days");
        System.out.println("Monthly Wage of " +X+ " : " +(workHour*E.hourWage));

        workDay = 0;
        workHour = 0;
        fullDay = 0;
        halfDay = 0;
    }
}

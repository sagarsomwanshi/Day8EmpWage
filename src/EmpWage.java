public class EmpWage {
    int workHour;
    int hourWage = 20;
    public static void main(String[] args) {
        UC2();
    }
    public static int UC1(){
        int attendance = (int) ((Math.random() * 10) % 3);
        return attendance;
    }
    public static void UC2(){
        EmpWage E = new EmpWage();
        switch (UC1()) {
            case 0 :
                E.workHour = 8;
                System.out.println("Employee is present for full day");
                System.out.println("Daily Wage : " + (E.workHour*E.hourWage));
                break;
            case 1:
                E.workHour = 4;
                System.out.println("Employee is present for Half day");
                System.out.println("Daily Wage : " + (E.workHour*E.hourWage));
                break;
            default:
                System.out.println("Employee is Absent");
        }

    }
}

public class EmpWage {
    int workHour;
    int hourWage = 20;
    String emp1= "Regular Employee";
    String emp2 = "Part Time Employee";

    public static void main(String[] args) {
        EmpWage E = new EmpWage();
        UC2(E.emp1);
        UC2(E.emp2);
    }
    public static int UC1(){
        int attendance = (int) ((Math.random() * 10) % 3);
        return attendance;
    }
    public static void UC2(String X ){
        EmpWage E = new EmpWage();
        switch (UC1()) {
            case 0 :
                E.workHour = 8;
                System.out.println("\n"+X+" is present for full day");
                System.out.println("Daily Wage : " + (E.workHour*E.hourWage));
                break;
            case 1:
                E.workHour = 4;
                System.out.println("\n"+X+" is present for Half day");
                System.out.println("Daily Wage : " + (E.workHour*E.hourWage));
                break;
            default:
                System.out.println("\n"+X+" is Absent");
        }

    }
}

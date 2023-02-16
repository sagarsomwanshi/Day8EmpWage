public class EmpWage {
    public static void main(String[] args) {
        int attendance = UC1();
        System.out.println(attendance);


    }
    public static int UC1(){
        int attendance = (int) ((Math.random() * 10) % 2);
        return attendance;
    }
}

public class passingArgs2 {

    public void details(String fname, String lname, String sex, String address, int mobile_no, int pin_code) {
        System.out.println(".................Your Details..................");
        System.out.print("First Name: " + fname + " " + "Last Name: " + lname + " " + "Gender:" + sex + " " + "Address:"
                + address + " " + "Mobile_no: " + mobile_no + " " + "Pin_Code:" + pin_code);
    }

    public static void main(String[] args) {
        passingArgs2 myObj = new passingArgs2();
        myObj.details("Rezzak", "Ali", "Male", "Goalpara", 600324993, 783132);
    }
}
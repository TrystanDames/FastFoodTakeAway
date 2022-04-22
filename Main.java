import javax.swing.JOptionPane;

public class Main {

    public static String fullName;
    public static int contactDetails;
    public static double price;
    public static double fullPrice = 0;
    
    //Menu

    //Food
    public static double Burger = 60.50;
    public static double Pasta = 50.00;
    public static double Taco = 75.99;

    //Drinks
    public static double CokeCan = 10.99;
    public static double BotCoke = 14.99;
    public static double Pepsi = 12.99;
    public static double Water = 11.99;
    public static double Monster = 20.00;

    //Sides
    public static double Chips = 14.00;
    public static double Salad = 10.50;
    public static double OnionRings = 15.00;
    public static double Sauce = 12.00;

    static MainClass mc;

    public static void main(String[] args){
        
    }

    public void getFullName() {
        fullName = JOptionPane.showInputDialog(null, "Please Enter Your Full Name");
        mc.setFullName(fullName);
    }

    public void getContactInfo() {
        contactDetails = Integer.valueOf(JOptionPane.showInputDialog(null, "Please Enter Your Contact Number"));
        mc.setContactInfo(contactDetails);
    }

    public void getFood() {
    }
}
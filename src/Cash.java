public class Cash {
    //attributes
    private static double change;
    public static int paymentopt;
    private final static double icel = 4.00;
    private final static double arabica = 4.50;
    private final static double robusta = 4.20;
    private final static double excelsa = 4.00;
    private final static double liberica = 4.00;

    //method to check for each option if the price is enough or if change is required
    //with receipt, that shows what you ordered, price and how you paid

    //cash method for iced lotte
    public static void cashIce(double cash) {
        paymentopt = 1;
       // cash = cash;
        if (cash == icel) {
            System.out.println("You purchased an iced lotte for" + " " + cash);
            System.out.println("Paid with cash");
        } else if (cash > icel) {
            System.out.println("You purchased an iced lotte for" + " " + cash);
            change = cash - icel;
            System.out.println("Your change is " + " " + change);
        } else if (cash < icel) {
            System.out.println("Unable to purchase Iced lotte");
        }
    }
    //cash method for arabica coffee
        public static void cashArabica(double cash){
            paymentopt = 1;
            if (cash == arabica) {
                System.out.println("You purchased an Arabica coffee for" + " " + cash);
                System.out.println("Paid with cash");
            } else if (cash > arabica) {
                System.out.println("You purchased an Arabica coffee for" + " " + cash);
                change = cash - arabica;
                System.out.println("Your change is " + " " + change);
            } else if (cash < arabica) {
                System.out.println("Unable to purchase Arabica coffee");
            }
        }
        //cash method for robusta coffee
        public static void cashRobusta(double cash){
            paymentopt = 1;
            if (cash == robusta) {
                System.out.println("You purchased a robusta for" + " " + cash);
                System.out.println("Paid with cash");
            } else if (cash > robusta) {
                System.out.println("You purchased an robusta for" + " " + cash);
                change = cash - robusta;
                System.out.println("Your change is " + " " + change);
            } else if (cash < robusta) {
                System.out.println("Unable to purchase Robusta coffee");
            }
        }
    //cash method for exclesa coffee
        public static void cashExclesa(double cash){
            paymentopt = 1;
            if (cash == excelsa) {
                System.out.println("You purchased an excelsa for" + " " + cash);
                System.out.println("Paid with cash");
            } else if (cash > excelsa) {
                System.out.println("You purchased an excelsa for" + " " + cash);
                change = cash - excelsa;
                System.out.println("Your change is " + " " + change);
            } else if (cash < excelsa) {
                System.out.println("Unable to purchase excelsa coffee");
            }
        }
    //cash method for liberica coffee
        public static void cashLiberica(double cash){
            int moneyopt = 1;
            paymentopt = moneyopt;
            if (cash == liberica) {
                System.out.println("You purchased a liberica for" + " " + cash);
                System.out.println("Paid with cash");
            } else if (cash > liberica) {
                System.out.println("You purchased a liberica for" + " " + cash);
                change = cash - excelsa;
                System.out.println("Your change is " + " " + change);
            } else if (cash < liberica) {
                System.out.println("Unable to purchase liberica coffee");
            }
        }
    }
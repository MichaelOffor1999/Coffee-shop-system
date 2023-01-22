public class Card {
    private String cardopt;
    //method that automatically accept payment with no change required
        //with receipt, that shows what you ordered, price and how you paid

    //card method for iced lotte
    public static void cardIce() {
        int cardopt = 2;
        Cash.paymentopt = cardopt;
        if (Cash.paymentopt == 2) {
            System.out.println("You purchased an iced lotte");
            System.out.println("Paid with card");
        }
    }
    //card method for arabica coffee
    public static void cardArabica() {
        int cardopt = 2;
        Cash.paymentopt = cardopt;
        if (Cash.paymentopt == 2) {
            System.out.println("You purchased an Arabica coffee");
            System.out.println("Paid with card");
        }
    }
    //card method for robusta
    public static void cardRobusta() {
        int cardopt = 2;
        Cash.paymentopt = cardopt;
        if (Cash.paymentopt == 2) {
            System.out.println("You purchased a Robusta coffee");
            System.out.println("Paid with card");
        }
    }
    //card method for excelsa coffee
    public static void cardExcelsa() {
        int cardopt = 2;
        Cash.paymentopt = cardopt;
        if (Cash.paymentopt == 2) {
            System.out.println("You purchased an Excelsa coffee");
            System.out.println("Paid with card");
        }
    }
    //cash method for liberica coffee
    public static void cardLiber(){
            int cardopt = 2;
            Cash.paymentopt = cardopt;
        if(Cash.paymentopt == 2){
            System.out.println("You purchased a Liberica coffee");
            System.out.println("Paid with card");
        }
    }
}

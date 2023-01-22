import java.util.Scanner;
public class Menu{
    public void showMenu(){
        System.out.println("1. Iced latte  $4.00");
        System.out.println();
        System.out.println("2. Arabica  $4.50");
        System.out.println();
        System.out.println("3. Robusta  $4.20");
        System.out.println();
        System.out.println("4. Excelsa  $4.00");
        System.out.println();
        System.out.println("5. Liberica  $4.00");
        System.out.println();
        System.out.println("6. Exit");
        System.out.println();

        int payopt;
        Scanner in = new Scanner(System.in);
        do{
            Keyboard.board("Enter an option from 1 - 6: ");
            switch(Keyboard.opt) {
                case 1:
                    System.out.println("Enter 1 to pay with cash or 2 to pay with card");
                    Cash.paymentopt = in.nextInt();
                    if(Cash.paymentopt == 1){
                        System.out.print("Enter amount: ");
                        double money = in.nextDouble();
                           Cash.cashIce(money);
                    }else if(Cash.paymentopt == 2){
                        Card.cardIce();
                    }
                    break;
                case 2:
                    System.out.println("Enter 1 to pay with cash or 2 to pay with card");
                    Cash.paymentopt = in.nextInt();
                    if(Cash.paymentopt == 1){
                        System.out.print("Enter amount: ");
                        double amount = in.nextDouble();
                        Cash.cashArabica(amount);
                    }else if(Cash.paymentopt == 2){
                        Card.cardArabica();
                    }
                    break;
                case 3:
                    System.out.println("Enter 1 to pay with cash or 2 to pay with card");
                    Cash.paymentopt = in.nextInt();
                    if(Cash.paymentopt == 1){
                        System.out.print("Enter amount: ");
                        double amount = in.nextDouble();
                        Cash.cashRobusta(amount);
                    }else if(Cash.paymentopt == 2){
                        Card.cardRobusta();
                    }
                    break;
                case 4:
                    System.out.println("Enter 1 to pay with cash or 2 to pay with card");
                    Cash.paymentopt = in.nextInt();
                    if(Cash.paymentopt == 1){
                        System.out.print("Enter amount: ");
                        double amount = in.nextDouble();
                        Cash.cashExclesa(amount);
                    }else if(Cash.paymentopt == 2){
                        Card.cardExcelsa();
                    }

                case 5:
                System.out.println("Enter 1 to pay with cash or 2 to pay with card");
                Cash.paymentopt = in.nextInt();
                if(Cash.paymentopt == 1){
                    System.out.print("Enter amount: ");
                    double amount = in.nextDouble();
                    Cash.cashLiberica(amount);
                }else if(Cash.paymentopt == 2){
                    Card.cardLiber();
                }
                break;
                case 6:
                    break;
            }
        }while(Keyboard.opt != 6);

    }
}

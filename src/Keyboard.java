import java.util.Scanner;
public class Keyboard {
    //attributes
    public static int opt;
    //method for check, takes input as string, if unable to covert to int then print an error message to screen
    public static void board(String promt){
        String strInt = "";
        int option = 0;
        boolean stop = false;
        Scanner in = new Scanner(System.in);
        while(!stop){
            System.out.print(promt);
            strInt = in.nextLine();
            try{
            option = Integer.parseInt(strInt);
                if(option < 0 || option > 6) {
                    System.out.println("Please enter a valid option");
                }
            opt = option;
            stop = true;
        }catch(Exception e){
            System.out.println("Enter a valid option!");
            }
        }
    }
}

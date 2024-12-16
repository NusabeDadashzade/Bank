import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            MenuUtil.printmenu();
            System.out.print("Please enter number: ");
            int number =scanner.nextInt();
            switch(number){
                case 1-> MenuUtil.addingCase1();
                case 2-> Bank.showAllAccount();
                case 3->MenuUtil.addDepositCase3();
                case 4-> MenuUtil.transferMoney();
                case 5-> System.exit(0);

            }
        }
































    }
}
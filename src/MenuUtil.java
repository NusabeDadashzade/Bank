import java.util.Random;
import java.util.Scanner;

public class MenuUtil {
    public static Scanner scanner=new Scanner(System.in);
   private static String menu="1.Create an Account \n"+
                              "2.Show all Accounts \n"+
                              "3.add deposit \n" +
                               "4.Transfer Money \n"+
                                "5.exit";


   public static void printmenu(){
       System.out.println("-------------------MENU-------------------");
       System.out.println(menu);
   }


   public static  String getAccountNom(){
       Random rnd=new Random();
       String reqemler="1234567890";
       String accountNom="";
       String[] herReqem=reqemler.split("");
       for(int i=0; i<10; i++){
           accountNom+=herReqem[rnd.nextInt(10)];
       }
       return  accountNom;
   }
   public static void addingCase1 (){
       boolean check=true;
       System.out.print("Pls enter your name -> ");
       String customerName=scanner.next();
       System.out.print("Pls enter your Surname -> ");
       String customerSurname=scanner.next();
       System.out.print("Pls enter your PIN ->");
       String customerFin=scanner.next();
       do{
           String accountNom=MenuUtil.getAccountNom();
           System.out.println("Account N: "+ accountNom);
           long balance=0;
           Account account = new Account(accountNom,balance);
           Customer customer=new Customer(customerName, customerSurname, customerFin, account);
           Bank.addAccount(customer);
           System.out.print("Do you want to add Account again?(yes/no) ");
           String yesno=scanner.next();
           if(yesno.equals("yes")){
               check=false;
           }else if (yesno.equals("no")){
               check=true;
           }
       }while(!check);

       System.out.println("Account is created succesfully!");
   }
   public static void addDepositCase3(){
       System.out.print("Enter your Name: ");
       String customerName=scanner.next();
       System.out.print("Enter Account number: ");
       String accountNo=scanner.next();
       System.out.print("Enter Deposit Money: ");
       long deposit=scanner.nextLong();
       Bank.addDeposit(customerName,accountNo,deposit);
   }
  public static void transferMoney (){
      System.out.print("From this account : ");
      String accountNo=scanner.next();
      System.out.print("To this account: ");
      String accountNo2=scanner.next();
      System.out.println("How much Money -> ");
      long money=scanner.nextLong();
      Bank.transferMoney(accountNo,accountNo2,money);
  }


}

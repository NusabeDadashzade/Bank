public class Bank {
    public static int k=0;
    public static  Customer[] accounts=new Customer[10];
    public static void addAccount(Customer customer){
        if(k>=accounts.length*0.8){
            Customer[] accounts1=new Customer[accounts.length*2];
            for(int i=0;i<k;i++){
                accounts1[i]=accounts[i];
            }
            accounts=accounts1;
        }
        accounts[k]=customer;
        k++;
    }
    public static void showAllAccount(){
        System.out.println("All Accounts : ");
        for(int i=0;i<k;i++){
            System.out.println(accounts[i].getCustomerName() + " " + accounts[i].getCustomerSurname() +
                    " " + accounts[i].account().getAccountNom() + " BALANCE: "+ accounts[i].account().getBalance());
        }
    }

    public static void addDeposit (String customerName, String accountName, long deposit){
          boolean check=true;
        for(int i=0;i<k;i++){
          long currentBalance =accounts[i].account().getBalance();
          if(accounts[i].getCustomerName().equals(customerName) && accounts[i].account().getAccountNom().equals(accountName)){
              currentBalance+=deposit;
              accounts[i].account().setBalance(currentBalance);
              System.out.println("Deposit is succesfully added!");
              check =false;
          }
        }
        if(check){
            System.out.println("Customer is not found!");
        }

    }


  public static void transferMoney(String accountNo, String accountNo2, long money){
        int x=0;
     for(int i=0;i<k;i++){
         long hazirkiPulumuz=accounts[i].account().getBalance();
         if(accounts[i].account().getAccountNom().trim().equals(accountNo.trim())){
             hazirkiPulumuz-=money;
             accounts[i].account().setBalance(hazirkiPulumuz);
             x++;
         }
         if(x!=0){
             if(accountNo2.trim().equals(accounts[i].account().getAccountNom().trim())){
                 hazirkiPulumuz+=money;
                 accounts[i].account().setBalance(hazirkiPulumuz);
             }
         }

     }
     if(x==0){
         System.out.println("Accounts is not found!");
     }

  }









}

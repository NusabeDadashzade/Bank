public class Account {
    private String accountNom ;
    private long balance;
    public Account(String accountNom, long balance){
        this.accountNom=accountNom;
        this.balance=balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getAccountNom(){
        return  this.accountNom;
    }
    public long getBalance(){
        return this.balance;
    }


}

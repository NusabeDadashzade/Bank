public class Customer {
    private String customerName ;
    private String customerSurname;
    private String customerFin;
    private Account account;
    public Customer(String customerName, String customerSurname, String customerFin, Account account){
        this.customerName=customerName;
        this.customerSurname=customerSurname;
        this.customerFin=customerFin;
        this.account=account;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getCustomerSurname(){
        return this.customerSurname;
    }
    public String getCustomerFin(){
        return this.customerFin;
    }
    public Account account(){
        return  account;
    }
}

package Banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Itau");
        bank.addBranch("Botafogo");
        bank.addCustomer("Paulo", "Botafogo", 150);
        bank.addCustomerTransaction("Paulo", "Botafogo", -70);
        bank.addCustomer("Joao", "Botafogo", 23);
        bank.addBranch("Flamengo");
        bank.addCustomer("Larissa", "Flamengo", 11200);
        bank.addCustomerTransaction("Larissa", "Flamengo", -2000);
        bank.listCustomers("Botafogo", true);
        bank.listCustomers("Flamengo", true);
    }
}

package Banking;

import java.util.ArrayList;

//Cria um bank digital onde voce pode inserir agências(branches), inserir usuarios
//da agência(customer), fazer movimentações, e imprimir uma lista de usuarios 
//pertencentes a todas as agências
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkedBranch = branches.get(i);
            if (checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }
        return null;
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String CustomerName, String BranchName, double InitialAmount) {
        Branch branch = findBranch(BranchName);
        if (branch != null) {
            branch.newCustomer(CustomerName, InitialAmount);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, String branchName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            branch.addCustomerTransaction(customerName, amount);
            return true;
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer branch details for " + branch.getName() + "\n");
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer checkedBranch = branchCustomers.get(i);
                System.out.print("Customer Nº" + (i + 1) + ": ");
                System.out.print(checkedBranch.getName() + "\n");
                if (showTransactions) {
                    ArrayList<Double> transactions = checkedBranch.getTransactions();
                    double sum = 0;
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.print("Transaction Nº" + (j + 1) + ": ");
                        System.out.println(transactions.get(j).doubleValue() + " R$");
                        sum += transactions.get(j).doubleValue();
                    }
                    System.out.println("The total amount is: "+sum+" R$");
                    System.out.println("");
                }

            }
            return true;
        }
        return false;
    }
}

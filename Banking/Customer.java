package Banking;

import java.util.ArrayList;

//Classe customer que é o usuario base do banco
//contem metodos para adicionar transação, pegar nome
//e retornar a lista de transações

public class Customer {
    private String name;
    private ArrayList<Double> transactions ;
    
    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }   
    
    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }
    
    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

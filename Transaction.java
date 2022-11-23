public class Transaction {
    private String id;
    private double amount;

    public Transaction(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void printInfo() {
        System.out.println("Transaction ID: " + id);
        System.out.println("Transaction amount: " + amount);
    }
}

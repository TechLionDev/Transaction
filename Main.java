class Main {
    public static void main(String[] args) {
        Transaction firstTransaction = new Transaction(GenerateUUID.generateUUID(), 56.42);
        firstTransaction.printInfo();
        Transaction secondTransaction = new Transaction(GenerateUUID.generateUUID(), 75.82);
        secondTransaction.printInfo();
    }
}
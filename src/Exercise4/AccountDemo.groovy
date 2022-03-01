package Exercise4

class AccountDemo {
    static void main(String[] args) {
        Account checking = new Account("Checking")
        checking.deposit(100.0)

        Account savings = new Account("Savings")
        savings.deposit(50.0)
        savings.withdraw(20.0)

        BigDecimal total = checking + savings
        println total
    }
}

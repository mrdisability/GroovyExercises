package Exercise4

import groovy.transform.ToString

@ToString
class Account {
    BigDecimal balance = 0
    String type

    Account(String type) {
        this.type = type
    }

    // Deposit, add amount to balance
    void deposit(BigDecimal amount) {
        balance += amount
    }

    void withdraw(BigDecimal amount) {
        balance -= amount
    }

    BigDecimal plus(Account account) {
        balance + account.balance
    }
}

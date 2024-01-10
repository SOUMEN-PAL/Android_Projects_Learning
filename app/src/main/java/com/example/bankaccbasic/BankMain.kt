package com.example.bankaccbasic

fun main() {
    val account1 = BankAccount("John Doe", 100.0)
    val account2 = BankAccount("Jane Doe", 100.0)

    account1.deposit(50.0)
    account2.deposit(100.0)

    account1.transfer(50.0, account2)
    account1.displayTransaction()
    account2.displayTransaction()


}
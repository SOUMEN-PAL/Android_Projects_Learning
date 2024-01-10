package com.example.bankaccbasic

class BankAccount(var accountHolder: String , var balance: Double) {

    private val transactionHistory = mutableListOf<String>()
    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited $$amount")
    }

    fun withDraw(amount: Double){
        if(balance >= amount){
            balance -= amount
            transactionHistory.add("$accountHolder withdrew $$amount")
        }
        else{
            transactionHistory.add("$accountHolder tried to withdraw $$amount but there was insufficient funds")
        }
    }

    fun displayTransaction(){
        println("Transaction History for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }
    }

    private fun recieveTransfer(amount: Double , account: BankAccount){
        balance += amount
        transactionHistory.add("$accountHolder recieved $$amount from ${account.accountHolder}")
    }
    fun transfer(amount: Double , account: BankAccount){
        if(balance >= amount){
            balance -= amount
            account.recieveTransfer(amount , this)

            transactionHistory.add("$accountHolder transfered $$amount to ${account.accountHolder}")
        }
        else{
            transactionHistory.add("$accountHolder tried to transfer $$amount to ${account.accountHolder} but there was insufficient funds")
        }
    }

    fun displayBalance(){
        println("Current balance for $accountHolder is $$balance")
    }
}
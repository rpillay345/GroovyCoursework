class Account { 
    
    BigDecimal balance
    
    Account plus(Account other) {   // add a plus method that takes one account and adds another account together
        new Account( balance: this.balance + other.balance ) // from this balance to another balance
    }
    
    String toString(){
        "Account Balance: $balance"
    }
} 

Account savings = new Account(balance:100.00)
Account checking = new Account(balance:500.00)

println savings
println checking
println savings + checking
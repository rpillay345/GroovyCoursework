class Account { 

    BigDecimal balance = 0.0                   // initialize balance to 0
    String type                                // checking or savings

    BigDecimal deposit(BigDecimal amount){     // deposit allows us to deposit an amount and add to our balance
    
        balance += amount
    
    }
    
    BigDecimal withdraw(BigDecimal amount){     // withdraw allows us to withdraw an amount and remove from our balance
    
        balance -= amount
    } 
    
    String toString(){                          //can be also handled with a @groovy.transform.ToString
        "$type Balance: $balance"
    }

    BigDecimal plus(Account account){
        this.balance + account.balance
    
    }

}

Account checking = new Account(type:"Checking")
checking.deposit(100.00)
Account savings = new Account(type:"Savings")
savings.deposit(50.00)

println checking
println savings

BigDecimal total = checking + savings
println total
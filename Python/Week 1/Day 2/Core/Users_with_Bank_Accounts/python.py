class BankAccount:
    def __init__(self, int_rate, balance): 
        self.int_rate=int_rate
        self.balance=balance
    def deposit(self, amount):
        amount+=5
        print("succssesful deposit")
    def withdraw(self, amount):
        print("Insuffcient funds: Charging a $5 fee")
        amount-=5
    def display_account_info(self):
        print("Balance : $100")
    def yield_interest(self):
        if(self.balance>0):
            self.balance+=0.01
            print(f"the intrest rate increased {self.balance}")


class User:
    def __init__(self, name, email,account):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate=0.02, balance=0)
    
    def example_method(self):
        self.account.deposit(100)		# we can call the BankAccount instance's methods
        print(self.account.balance)		# or access its attributes


    def make_deposit(self, amount):
        self.account.balance+=amount
        print(f"you have deposited {amount} ")   


    def make_withdraw(self,amount):
        self.account.balance-=amount
        print(f"withdraw done {amount}")


    def account_balance(self):
        print(f"your account balnce : {self.account.balance}")



account1=User("JaneDoe","a@gmail.com",BankAccount(0.02,0))
account1.make_deposit(5)
account1.make_withdraw(5)
account1.account_balance()


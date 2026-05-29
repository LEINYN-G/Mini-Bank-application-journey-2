import java.util.Scanner;

Public class Account {
 String customerName;
 String customerID;
 int balance = 0;
 int previousTransaction = 0;

Account(String cutomerName, String CustomerID) {
  this.customerName = customerName;
  this.customerID = customerID;
  }
}
void deposit(int amount) {
 if(amount > 0) { //checking if amt is greater than 0
balance = balance + amount;  //updating new bal
previousTransaction = amount;
System.out.println("Amount Deposited Successfully");
System.out.println("New Balance is:" + balance);
} else {
System.out.println("Please enter amount greater than 0");
  }
}

void withdraw(int amount) {
if(amount < balance) {
 if (amount > 0) {
 balance = balance - amount;
 previousTransaction = -amount;
 System.out.println("Withdrawal Successful");
 System.out.println("New Balance is:" + balance);
}  else {
System.out.println("Please enter amount greater than 0");
   }
} else {
System.out.println("Insufficient Funds, Cannot Withdraw");
  } 
}
//the getPreviousTransaction() method
void getPreviousTransaction() {
  if (previousTransaction > 0) {
 System.out.println("Deposited: " + previousTransaction);
} else if (previousTransaction < 0) {
value = Withdrawal
 System.out.println("Withdrawn: " + previousTransaction);
}  else  {
 System.out.println("NO transaction occured");
  }
}

void calculateInterest(int years) {
double interestRate = .o185;  //keeping a constant rate
double newBalance = (balance*interestRate*years) + balance;
System.out.println("The current interest rate is" + (100*interestRate)+"%");
System.out.println("After" + years + "years, your balance will be" + newBalance);
  }
}

public class Bank{
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("Enter account name:");
  String custName = scanner.nextLine();
  System.out.println("Enter customer ID");
  String custID = scanner.nextLine();
  Account account = new Account(custName, custID);
 }
}

System.out.println("                   ");
System.out.println("Welcome," + account.customerName+"!");
System.out.println("Your ID is" + account.customerID);
System.out.println("                       ");
Sytem.out.println("Select Any Option To Proceed");
System.out.println();
System.out.println("A. Check Balance");
System.out.println("B. Deposit");
System.out.println("C. Withdraw");
System.out.println("D. Previous Transaction");
System.out.println("E. Interest");
System.out.println("F. Exit");

  char option; 
  boolean flag = true;
while(flag) {
System.out.println("Enter your Choice: ");
option = scanner.nect().charAt(0);

switch (option) {
case 'A':
System.out.println("Account Balance = $" + account.balance);
break;
case 'B':
System.out.println("Enter an amount to deposit: ");
int depositAmount = scanner.nextInt();
account.deposit(depostAmount);
break;
case 'C':
System.out.println("Enter an amount to withdraw: ");
int withdrawAmount = scanner.nextInt();
account.withdraw(withdrawAmount);
break;
case: 'D';
account.getPreviousTransaction();
break;
case 'E';
System.out.println("Enter the years for which you wish to calculate the interest:");
int years = scanner.nextInt();
account.calculateInterest(years);
break;
case 'F':
System.out.println("Thank you for banking with us!");
scanner.close();
flag = false;
while loop
break;
default: System.out.println("Error: Invalid option. Please enter A, B, C, D, or E to access services");
   }
  }
 }
}







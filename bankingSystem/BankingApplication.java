package com.bankingSystem;
import java.util.*;

class User
{
	String name;
	int Age;
	String Gender;
	String PhoneNo;
	String Address;
	double CurrentAmount;
	String AccountNo;
	List<Transaction> transactions;
	User(String name,int age,String PhoneNo,String Address,double CurrentAmount,String AccountNo)
	{
		this.name=name;
		this.Age=age;
		this.PhoneNo=PhoneNo;
		this.Address=Address;
		this.CurrentAmount=CurrentAmount;
		this.AccountNo=AccountNo;
		transactions=new ArrayList<Transaction>();
	}
	void Display()
	{
		System.out.println("Name :"+name);
		System.out.println("Age :"+Age);
		System.out.println("Gender :"+Gender);
		System.out.println("Phone Number :"+PhoneNo);
		System.out.println("Account Number :"+AccountNo);
		System.out.println("Address :"+Address);
		System.out.println("Current Balance :"+CurrentAmount);
	}
}
class Transaction
{
	String AccountNumber;
	String transactionId;
	double Amount;
	Transaction(String AccountNumber,String transactionId,double amount)
	{
		this.AccountNumber=AccountNumber;
		this.transactionId=transactionId;
		this.Amount=Amount;
	}
}

class Functionality
{
	Random r=new Random();
	public void WithdrawMoney(User account,double amount)
	{
		if(account.CurrentAmount<amount)
		{
			System.out.println("Dosent have sufficent balance");
		}
		else
		{
			account.CurrentAmount=account.CurrentAmount-amount;
			account.transactions.add(new Transaction(account.AccountNo,"kasdjkasd",amount));
			System.out.println("Transaction successful");
		}
	}
	public void DepositMoney(User account,double amount)
	{
		account.CurrentAmount=account.CurrentAmount+amount;
		account.transactions.add(new Transaction(account.AccountNo,"kasdjkasd",amount));
		System.out.println("Amount deposited");
	}
	public void TransferMoney(User DepositAccount,User WithdrawerAccount,double amount)
	{
		if(DepositAccount.CurrentAmount<amount)
		{
			System.out.println("You dont have sufficent balanace to make the transaction");
		}
		else 
		{
			WithdrawerAccount.CurrentAmount=WithdrawerAccount.CurrentAmount-amount;
			DepositAccount.CurrentAmount=DepositAccount.CurrentAmount+amount;
			DepositAccount.transactions.add(new Transaction(DepositAccount.AccountNo,"kasdjkasd",amount));
			DepositAccount.transactions.add(new Transaction(WithdrawerAccount.AccountNo,"kasdjkasd",amount));
		}
	}
	public void TransactionHistory(User account)
	{
		//List<Transaction> li=account.transactions;
		for(Transaction l:account.transactions)
		{
			System.out.println("Amount"+l.Amount);
			System.out.println("Account No"+l.AccountNumber);
			System.out.println("Transaction Id"+l.transactionId);
		}
	}
}
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User("Shekhar",22,"8083796822","Address of Shekhar",10000,"SBI001");
		Functionality f=new Functionality();
		f.DepositMoney(u,100);
		System.out.println(u.CurrentAmount);
		f.DepositMoney(u, 2);
		f.TransactionHistory(u);
		u.Display();

	}

}

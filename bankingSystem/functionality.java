package com.bankingSystem;

import java.util.*;

public interface functionality{

	public <E>ArrayList<E> transaction(int account_no);
	void withdraw_money(int account_no);
	void deposit_money(int account_no);
	void transfer_money(int account_no,int other_account_no);
	
	
}

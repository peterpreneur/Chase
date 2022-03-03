package account;

import static java.util.Arrays.sort;

import java.util.List;

public class Account {
	private AccountType _accountType;
	private float _balance;

	private enum AccountType {
		CHECKING(false), SAVINGS(false), INVESTING(false), COLLEGE(false), MORTGAGE(true), CAR_LOAL(true); 
		private boolean _debt;
		AccountType(boolean debt) {
			_debt = debt;
		}
	}

	public Account(AccountType _accountType, float _balance) {
		super();
		this._accountType = _accountType;
		this._balance = _balance;
	}	
		
	public static float[] sortAccountsByBalance(List <Float> account) {
		
		return null;
	}

	public static float checkForDuplicateAccountTypes(List <Account> acctList) {
		return _balance;
	}

	public static float calculateTotalBalance(List <Account> acctList) {
		return _balance;
	}

	public static float calculateTotalDebt(List <Account> acctList) {
		return _balance;
	}

	public static float calculateTotalOfAccountType(List <Account> acctList) {
		return _balance;
	}


	
	public float creditBalance(float amount ) {
		
		return amount;
	}
	
	public float debitBalance(float amount ) {
		return amount;
	}

	public float get_balance() {
		return _balance;
	}
	public void set_balance(float _balance) {
		this._balance = _balance;
	}
	
	public AccountType get_accountType() {
		return _accountType;
	}
	public void set_accountType(AccountType _accountType) {
		this._accountType = _accountType;
	}		
	
}
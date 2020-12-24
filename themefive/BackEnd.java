package themefive;

public class BackEnd {
	private int balance;
	private String username;
	private String password;

	public BackEnd() {
		balance = 10000;
		username = "123456";
		password = "123456";
	}

	// 取款
	public int withdrawal(int minus) throws DWException, NoBalanceException {
		balance -= minus * 100;
		if (minus < 0) {
			balance += minus * 100;
			throw new DWException(minus);
		}
		if (balance < 0) {
			balance += minus * 100;
			throw new NoBalanceException(balance);
		}
		return minus * 100;
	}

	// 存款
	public int deposit(int plus) throws DWException {
		balance += plus * 100;
		if (plus < 0) {
			balance -= plus * 100;
			throw new DWException(plus);
		}
		return plus * 100;
	}

	// 修改密码，pw是输入的“原密码”，newpw是输入的“新密码”
	public boolean modifyPassword(String pw, String newpw) {
		if (pw.equals(password)) {
			password = newpw;
			return true;
		} else {
			return false;
		}
	}

	public int getBalance() {
		return balance;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

}

// 存、取款数额异常
class DWException extends Exception {
	/**
	 * @date 2020 12 16
	 * @author 诸行无常
	 */
	private static final long serialVersionUID = 20201216;

	private int error;

	public DWException(int get) {
		error = get;
	}

	public String toString() {
		return "存取款数额异常[ " + error + " ]";
	}
}

// 余额不足异常
class NoBalanceException extends Exception {
	/**
	 * @date 2020 12 16
	 * @author 诸行无常
	 */
	private static final long serialVersionUID = 20201216;

	private int errorbalance;

	public NoBalanceException(int getbalance) {
		errorbalance = getbalance;
	}

	public String toString() {
		return "余额不足异常[ " + errorbalance + " ]";
	}
}

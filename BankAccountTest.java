import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Performs unit tests for the BankAccount object.
 */
public class BankAccountTest {
	
	/**
	 * The bank account to be tested.
	 */
	private BankAccount bankAccount;
	
	/**
	 * Prepares a bank account for the test cases.
	 */
	@Before
	public void prepareBankAccount() {
		this.bankAccount = new BankAccount("123456789", false);
		this.bankAccount.setAccountBalance(100);
	}

	/**
	 * Tests a scenario in which a negative amount is deposited. A negative deposit will
     * not process successfully and the account balance will not be modified.
	 */
	@Test
	public void testDepositNegativeAmount() {
		Assert.assertFalse(this.bankAccount.deposit(-10));
		Assert.assertEquals(100, this.bankAccount.getAccountBalance(), 0.001);
	}
	
	/**
	 * Tests a scenario in which a zero amount is deposited. A zero deposit will process
     * successfully and the account balance will not be modified.
	 */
	@Test
	public void testDepositZeroAmount() {
		Assert.assertTrue(this.bankAccount.deposit(0));
		Assert.assertEquals(100, this.bankAccount.getAccountBalance(), 0.001);
	}
	
	/**
	 * Tests a scenario in which a positive amount is deposited. A positive deposit will
     * process successfully and the account balance will increase by the amount deposited.
	 */
	@Test
	public void testDepositPositiveAmount() {
		Assert.assertTrue(this.bankAccount.deposit(20));
		Assert.assertEquals(120, this.bankAccount.getAccountBalance(), 0.001);
	}
	
	
	/**
	 * Tests a scenario in which a zero amount is withdrawn. A zero deposit will process
     * successfully and the account balance will not be modified.
	 */
	@Test
	public void testWithdrawZeroAmount() {
		Assert.assertTrue(this.bankAccount.withdraw(0));
		Assert.assertEquals(100, this.bankAccount.getAccountBalance(), 0.001);
	}
	
	/**
	 * Tests a scenario in which a positive amount is withdrawn. A positive withdrawal will
     * process successfully and the account balance will decrease by the amount deposited.
	 */
	@Test
	public void testWithdrawPositiveAmount() {
		Assert.assertTrue(this.bankAccount.withdraw(20));
		Assert.assertEquals(80, this.bankAccount.getAccountBalance(), 0.001);
	}

	/**
	 * Tests a scenario in which a zero amount is charged. A zero charge will process
     * successfully and the account balance will not be modified.
	 */
	@Test
	public void testChargeZeroAmount() {
		Assert.assertTrue(this.bankAccount.charge(0));
		Assert.assertEquals(100, this.bankAccount.getAccountBalance(), 0.001);
	}
	
	/**
	 * Tests a scenario in which a positive amount is charged. A positive charge will
     * process successfully and the account balance will decrease by the amount deposited.
	 */
	@Test
	public void testChargePositiveAmount() {
		Assert.assertTrue(this.bankAccount.charge(20));
		Assert.assertEquals(80, this.bankAccount.getAccountBalance(), 0.001);
	}

	/**
	 * Tests a scenario in which an amount larger than the account balance is charged.
	 * A larger withdrawal will process successfully and the account balance
	 * should also be decreased by the overdraft charge.
	 */
	@Test
	public void testChargeLargerThanAccountAmount() {
		Assert.assertTrue(this.bankAccount.charge(120));
		Assert.assertEquals(-40, this.bankAccount.getAccountBalance(), 0.001);
	}
}


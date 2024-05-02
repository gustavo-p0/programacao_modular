/**
 * ContaBancaria
 */
public class ContaBancaria {
  private static final double DEBT_TAX_VALUE = 0.03;
  private static int nextAccountNumber = 0;

  private int accountNumber;
  private String cpf;
  private double balance;
  private double accountLimit;

  public ContaBancaria(String cpf, double accountLimit) {
    this.cpf = cpf;
    this.accountLimit = accountLimit;
    this.balance = 0d;
    this.accountNumber = nextAccountNumber;
    nextAccountNumber += 1;
  }

  public void withdraw(double amount) {
    double maxWithdrawValue = balance + accountLimit;
    if (amount <= maxWithdrawValue && balance >= 0) {
      balance -= amount;
    }
  }

  public void deposit(double amount) {
    if (balance < 0) {
      amount -= amount * DEBT_TAX_VALUE;
    }

    balance += amount;
  }

  @Override
  public String toString() {
    StringBuilder strBuilder = new StringBuilder("");
    strBuilder.append(String.format("CONTA BANCARIA %d%n", accountNumber));
    strBuilder.append(String.format("\t- Saldo: %.2f%n", balance));
    strBuilder.append(String.format("\t- Limite: %.2f%n", accountLimit));
    return strBuilder.toString();
  }
}

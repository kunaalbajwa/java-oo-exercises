
public class SavingsAccount {
private Integer balance;
private double interest_rate;

	public SavingsAccount(Integer balance, double interest_rate)
{
	this.balance = balance;
	this.interest_rate= interest_rate;
}

	public Integer getBalance(){ 
		return this.balance;
	}
	public double getInterestRate() {
		return this.interest_rate;
	}
	
	public Integer add (Integer amount){
		this.balance += amount;
		return this.balance;
	}
	
	public Integer remove(Integer amount)
	{
		this.balance -= amount;
		return this.balance;
	}
	
	public Integer accrue()
	{
		return (this.balance += (int) (this.balance * this.interest)); 
	}
	public String toString{
		return "balance = " + this.balance + " @i interest_rate= " +this.interest_rate; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SavingsAccount my_account = new SavingsAccount(100, 0.5);
System.out.println(my_account.getBalance());
System.out.println(my_account.my_account.add(10));
System.out.println(my_account.my_account.accrue());

	}

}

package Sim_Match_And_Sort;

public class Sim {
	
	private int id;
	private String company;
	private double balance;
	private double ratePerSecond;
	private String circle;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setCompany(String company)
	{
		this.company=company;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public void setRatePerSecond(double ratePerSecond)
	{
		this.ratePerSecond=ratePerSecond;
	}
	
	public void setCircle(String circle)
	{
		this.circle=circle;
	}
	
	
	public int getId()
	{
		return id;
	}
	
	public String getCompany()
	{
		return company;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getRatePerSecond()
	{
		return ratePerSecond;
	}
	
	public String getCircle()
	{
		return circle;
	}
	

}

class ProfitPercentage
{
public static void main(String[] args)
{
int selling_price = 191;
int cost_price = 129;
int profit; 
float profit_percentage;
profit = selling_price - cost_price;
profit_percentage = ((float)profit/cost_price) * 100;
System.out.println("The profit is:" + profit + "The profit_percentage is:" + profit_percentage);
}
}
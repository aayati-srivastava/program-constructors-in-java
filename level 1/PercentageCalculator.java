public class PercentageCalculator
{
	public static void main(String[] args)
	{
		int maths = 94;
		int physics = 95;
		int chemistry = 96;
		float securedMarks = maths + physics + chemistry;
		float totalMarks = 100*3;
		float percentage = (securedMarks / totalMarks) *100.0f;
		System.out.println("Sam's average mark in PCM is :"+percentage+" %");
	}
}
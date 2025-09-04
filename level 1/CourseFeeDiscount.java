class CourseFeeDiscount 
{
    public static void main(String[] args)
 {
        int originalFee = 125000; 
        float discountPercentage = 10.0f; 

        
        float discountAmount = (originalFee * discountPercentage) / 100;

        
        float discountedPrice = originalFee - discountAmount;
        

        System.out.println("Discounted Amount: INR " + discountAmount);
        System.out.println("Final Price after Discount: INR " + discountedPrice);
    }
}
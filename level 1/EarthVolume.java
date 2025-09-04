class EarthVolume 
{
    public static void main(String[] args) 
{
       
        double radiusKm = 6371.0;   
        double radiusMiles = 3958.8; 

                double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        
        System.out.println("Volume of Earth in cubic kilometers: " + volumeKm3 + " km^3");
        System.out.println("Volume of Earth in cubic miles: " + volumeMiles3 + " miles^3");
    }
}
class UnitsConvertor {
    public static void main(String[] args) {
        float distance_in_km = 10.8f;  // Correct variable declaration
        float distance_in_miles;

        distance_in_miles = distance_in_km * 0.621371f;  // Correct conversion

        System.out.println(distance_in_km + " kilometers in miles is: " + distance_in_miles + " miles");
    }
}
class PenDistribution {
    public static void main(String[] args) {
        int total_Pens = 14;
        int total_Students = 3;

        int pens_Per_Student = total_Pens / total_Students; 
        int remainingPens = total_Pens % total_Students;   
        System.out.println("Each student will get: " + pens_Per_Student + " pens");
        System.out.println("Remaining non-distributed pens: " + remainingPens);
    }
}
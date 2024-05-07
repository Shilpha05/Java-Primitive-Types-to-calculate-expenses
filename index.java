 class Task5 {
    public static double calcHousePayment(java.util.Scanner s){
        System.out.print("Enter the loan Amount: ");
        double l =s.nextDouble();
        System.out.print("Enter the number of years to repay: ");
        int n= s.nextInt();
        System.out.print("Enter the yearly interest rate as percent: ");
       double i= s.nextDouble()/12/100;
       double ipow=Math.pow(1+i,n);
       double m= l*(i*ipow)/(ipow-1);
       return m;
    }
    public static double calcGroceryPayment(java.util.Scanner s){
        System.out.println("Enter a weekly grocery amount: ");
        double g=s.nextDouble()*4;
        return g;
    }

   public static void main(final String [] args) {
       java.util.Scanner s = new java.util.Scanner(System.in);
       double housePay = calcHousePayment(s);
       double groceryPay = calcGroceryPayment(s);
       System.out.printf("%3.2f%n",housePay);
       System.out.printf("%3.2f%n",groceryPay);
       System.out.printf("Total monthly payments are: %3.2f", housePay + groceryPay );

   }
}
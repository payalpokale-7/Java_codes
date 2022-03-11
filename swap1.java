public class swap1 {
    static void swapValuesWithoutUsingThirdVariable(int m,int n)
    {
        m = m - n;
        n = m + n;
        m = n - m;
        System.out.println("Value of m is " + m + " and Value of n is "  + n);
    }
    //main driver method
    public static void main(String args[]) {
        int m = 8, n = 4;
        swapValuesWithoutUsingThirdVariable(m, n);
    }  
}

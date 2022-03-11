
public class swap {
    //function to swap two numbers
    //using temporary variable
    static void swapValuesUsingThirdVariable(int m,int n)
    {
        //swappig the values
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Values of m is " + m + " and Value of n is " + n);
    }
    //Main driver code
    public static void main(String args[]) {
        //Random integer values
        int m = 9, n = 5;
        //calling above function to reverse the numbers
        swapValuesUsingThirdVariable(m, n);
    }
    
}

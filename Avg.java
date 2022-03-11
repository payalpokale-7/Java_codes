public class Avg {
    public  static void main(String args[]) {
        int x,y,z,avg;
         x=30;
         y=67;
         z=76;
         avg=(x+y+z)/3;
         System.out.println(avg);
    }

    static int gcd(int x,int y)
    {
        if(y==0)
        return x;
        return gcd(y,x % y);
    }
    
}

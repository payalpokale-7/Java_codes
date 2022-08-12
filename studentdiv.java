import java.io.BufferedReader;
import java.io.InputStreamReader;

public class studentdiv {
    public static void main(String[] args)throws Exception
    {
        int m1,m2,m3,per;
        System.out.println("Enter marks in three subjects");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        m1=Integer.parseInt(br.readLine());
        m2=Integer.parseInt(br.readLine());
        m3=Integer.parseInt(br.readLine());

        per=(m1+m2+m3)*100/300;

        if(per>=60)
        System.out.println("First division");

        if((per>=50)&&(per <60))
        System.out.println("Second division");

        if((per>=40)&&(per <50))
        System.out.println("Third division");

        if(per<40)
        System.out.println("Fail");

    }
    
}

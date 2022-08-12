import java.io.BufferedReader;
import java.io.InputStreamReader;

public class gross {
    public static void main(String[] args)throws Exception
    {
        float bs,gs,da,hra;
        System.out.println("Enter basic salary");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        bs=Float.parseFloat(br.readLine());

        if(bs<1500)
        {
            hra=bs*10/100;
            da=bs*90/100;
        }
        else
        {
            hra=1200;
            da=bs*98/100;
        }
        gs=bs+hra+da;
        System.out.println("Gross salary = Rs."+gs);
    }
    
}


class S
{
int rno;
String nm;
float res;
S()
{
rno=101;
nm="John";
res=85.3f;
}
S(int rn,String n,float re)
{
rno=rn;
nm=n;
res=re;
}
//para cons 2
S(int r1,float re1,String n1)
{
rno=r1;
nm=n1;
res=re1;
}
//para cons 3
S(int rn11)
{
rno=rn11;
nm="Raj";
res=57.2f;
}
//para cons 4
S (float res,String nm,int rno)
{
this.rno=rno;
this.nm=nm;
this.res=res;
}
//para cons 5
S(int rno,String nm)
{
this.rno=rno;
this.nm=nm;
res=80.9f;
}

public String tostring() {
	return "Sent[Rollno="+rno+"Name="+nm+"Res="+res+"]";
}
}
 class Tostring{
public static void main(String[] args)
{
S s1=new S();
S s2=new S(102,"smith",78.5f);
S s3=new S(102,67.6f,"Ram");
S s4=new S(104);
S s5=new S(60.5f,"Nisha",105);
S s6=new S(106,"Abhi"); 

System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s5);
System.out.println(s6);
}
}
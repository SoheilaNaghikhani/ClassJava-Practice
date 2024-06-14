package src;

public class Session3XIILHandsOn {
    public static void main(String[] args) {
        int I=1;
        int X=10;
        int L=50;
        int sum=0;
        String s1="XIIL";
        for(int i=0;i<s1.length();i++)
        {
           String a= s1.substring(i,i+1);
           System.out.println(a);
           if(a.equals("X"))
           {
              sum+=10;
           }
           else if(a.equals("I"))
           {
               sum+=1;
           }
           else if(a.equals("L"))
           {
               sum+=50;
           }
        }
        System.out.println(sum);


    }
}

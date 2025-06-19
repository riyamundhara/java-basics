public class GradingSystem {
    public static void main(String[] args)
    {
        int a=60;
        int b=89;
        int c=55;
        int d=75;
        int e=97;
        System.out.println("Subject 1:"+a);
        System.out.println("Subject 2:"+b);
        System.out.println("Subject 3:"+c);
        System.out.println("Subject 4:"+d);
        System.out.println("Subject 5:"+e);

        int sum=a+b+c+d+e;
        double avg=sum/5;
        System.out.println("Average="+avg);

        if(avg>=90)
        System.out.println("Grade A");
        else if(avg>=75 && avg<=89)
        System.out.println("Grade B");
        else if(avg>=60&&avg<=74)
        System.out.println("Grade C");
        else
        System.out.println("Grade D");
    }
    
}

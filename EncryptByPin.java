import java.util.Scanner;
public class EncryptByPin {
public static void main(String[] args) 
{/*Name : Anweshan Satapathy
   Section:C
   REG NO:1941012216
   Branch: CSE (1st Year)*/
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the message that should be encrypted");
	String msg=sc.nextLine();
	String st="";
	msg=msg.replaceAll(" ","");
	msg=msg.toLowerCase();
	System.out.println(msg);
	        String Encry="";
	        String Encry1="";
	System.out.println("Enter the no.of digits that should be entered");
	        int n=sc.nextInt();
	       System.out.println("Enter the 1st no.");
			int n1=sc.nextInt();
	        System.out.println("Enter the 2nd no.");
			int n2=sc.nextInt();
	        System.out.println("Enter the 3rd no.");
			int n3=sc.nextInt();
	        System.out.println("Enter the 4th no.");
			int n4=sc.nextInt();
			
			int nl1=0 ,nl2=0,nl3=0,nl4=0;
			int p=0,pin=0;
	        while(n1!=0&&n2!=0&&n3!=0&&n4!=0)
	        {	//556283
	            //698123
	            //757957
	            //839685
	        nl1=n1%10;
	        	n1=n1/10;
	        	 nl2=n2%10;
	        	n2=n2/10;
	        	 nl3=n3%10;
	        	n3=n3/10;
	        	 nl4=n4%10;
	        	n4=n4/10;
	        int	min1=Math.min(nl1,nl2);
	        	int min2=Math.min(min1,nl3);
	        	int min3=Math.min(min2, nl4);
	        p=p*10+ min3;
	        	
	        }
	       for(;p!=0;p/=10)
	       {
	    	   pin=pin*10+p%10;
	       }
	        
	       System.out.println("Your pin for Encryption is "+pin);
	       Encry+=pin;
	       for(int  i= 0;i<msg.length()/n;i++)
	       {
	    	   st=st+pin;
                  
	    	}
	       if(st.length()!=msg.length())
	        for(int j=0;j<msg.length()%n;j++)
	            {st=st+Encry.charAt(j);}
	       
	     
	       for(int k=0;k<st.length();k++)
	       {	  if(k==0)    
	    	  Encry1+=(char)(msg.charAt(k)+st.charAt(k)-58-48);
	       else
	    	   Encry1+=(char)(msg.charAt(k)+st.charAt(k)-32-48); 

	       }
System.out.println("Message after encryption is: \n"+Encry1);
} 
}  
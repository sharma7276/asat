package ankit;

public class pattern$
{
    public static void main(String args[])
    {  char i,j;
    for(i=0;i<=3;i++)
	{
	for(j=0;j<=3;j++)
		{
		if(j==0||i==0||j==3||i==3)	
		System.out.print("$");
		else
			System.out.print(" ");
		}
		System.out.println();
	
        	}
    }
  
}

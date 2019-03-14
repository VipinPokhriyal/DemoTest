class Test3{
public static void main(String args[])
{
int k=0,l=0;
for(int i=1;i<=9;i++)
{
if(i<=3)
k++;
else 
k--;
if(i>=5 && i<=7) 
l++;
else 
l--;

	for(int j=1;j<=7;j++)
	{
	if(i<=4)
		{
		if(j>=1 && j<=k)
		System.out.print("*");
		else
		System.out.print(" ");
		}
	if(i>5)
		{
		if(j>=8-l && j<=7)
		System.out.print("*");
		else
		System.out.print(" ");
		//System.out.print(l);
		}
	}
System.out.println();
}
	
}
}
import java.io.*;
import java.util.*;
public class avgsum
{
public static void main(String[] args)
{
try
{
ArrayList<Integer> one=new ArrayList<Integer>();
ArrayList<Integer> two=new ArrayList<Integer>();
int temp=0,i,j=0,temp1=0,avg1,avg2,r1=0,r=0,count=0;
Scanner in = new Scanner(System.in);
int len=in.nextInt();
int[] a=new int[len];
for(int k=0;k<len;k++)
{
	a[k]=in.nextInt();
		
}
for(i=0;i<len;i++)
{
temp=temp+a[i];
		for(j=i+1;j<len;j++)
		{
			temp1=temp1+a[j];
			count++;
		}

		avg1=temp/(i+1);
		avg2=temp1/count;
		//System.out.println(i+"\t"+count+"\t"+temp+"\t"+temp1+"\t"+avg1+"\t"+avg2);
		if(avg1==avg2)
		break;
		else
		{
		temp1=0;
		count=0;
		}
}


int te=i;
for(r=i;r>=0;r--)
one.add(a[r]);
System.out.println("the first array is..."+one);
System.out.println("\n");
for(r1=j-1;r1>te;r1--)
two.add(a[r1]);
System.out.println("the second array is..."+two);


		
		}
catch(Exception e)
{
System.out.println("NOT POSSIBLE");
}

	}
}
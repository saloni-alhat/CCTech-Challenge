import java.util.Scanner;
class SurfaceBuild
{ 
	static double h(double a,double b)
	{
		return Math.abs(a-b);
	}
	static double surfacelength(double arr[][],int M,int N) 
	{ 
		int i,j;
		double ans = 0;
			int l=arr.length;
		int k=1;
		double a=arr[0][0];
		double b=arr[0][1];
		for (i=0;i<M;i++)
		{
			for(j=0;j<N;j++)
			{
				if(a==arr[k][j])
				{
					ans+=h(b,arr[k][1]);
				}
				if(b==arr[k][j+1])
				{
					ans+=h(a,arr[k][0]); 
				}
			}
			k++;
				
		}
		return ans;
	}  
	public static void main (String args[]) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("CASE 1");
		double arr[][] = {{4,0},{4,-5},{7,-5},{7,0}};
		System.out.println(surfacelength(arr,3,1));
	} 
} 
import java.util.*;
public class AddionOfNumberInLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1,n2,add=0;
		char ans=0;
		do
		{
			System.out.println("Please enter the value of n1");
			n1=sc.nextInt();
			System.out.println("Please enter the valur of n2");
			n2 = sc.nextInt();
			if (n1>=0 || n2>=0)
			{
				add= n1+n2;
			}
			System.out.println("Addition of two number is = "+add);
			System.out.println("Do you want to continue?");
			ans = sc.next().charAt(0);
		}
		while (ans == 'Y'  || ans == 'y');
		System.out.println("Addition of previous number was = "+add);
		System.out.println("Added new changes in the file.");		
	}

}

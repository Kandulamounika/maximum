import java.util.Scanner;
public class Sum_Avg
{
public static void main(String[] args)
{
int n, sum = 0;
float avg;
Scanner s = new Scanner(System.in);
System.out.println("Enter no. of elements you want in array: ");
n = s.nextInt();
int a[] = new int[n];
System.out.println("Enter all the elements: ");
for(int i = 0; i < n; i++)
{
a[i] = s.nextInt();
sum = sum + a[i];
}
System.out.println("Sum: " +sum);
avg = (float)sum / n;
System.out.println("Average: " +avg);
}
}

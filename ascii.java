import java.lang.String;
class ascii
{
public static void main(String[] args)
{
int arr[]=new int[26];
String[] alp={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
for(int i=0;i<=25;i++)
{
arr[i]=i+65;
}
for(int j=0;j<26;j++)
{
System.out.println(arr[j]+" - "+alp[j]);
}
}
}

import java.util.Scanner;
class Matrix{
   public static void main(String [] args){
    
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the rows:");
     int m=sc.nextInt();
     System.out.println("Enter the columns:");
     int n=sc.nextInt();
     int [][] matrix1= new int [m][n];
     int [][] matrix2= new int [m][n];
     int [][] resmat=new int [m][n];
     int i,j;
     System.out.println("Enter the first matrix:");
      for(i=0;i<m;i++)
       {
         for(j=0;j<n;j++)
          {
             matrix1[i][j]=sc.nextInt();
         }
      }
    System.out.println("Enter the second matrix:");
     for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
       {
         matrix2[i][j]=sc.nextInt();
    }
  }
 
  for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
       {
         resmat[i][j]=matrix1[i][j] + matrix2[i][j];
    }
  }
   System.out.println("Resultant matrix:");
     for(i=0;i<m;i++)
    {
      for(j=0;j<n;j++)
       {
         System.out.print(resmat[i][j]+"\t");
    }
     System.out.println();
  }
 }
}


     

import java.util.Scanner;
class product{
   int pCode,price;
   String pName;
    product(int pCode,String pName,int price){
     this.pCode=pCode;
     this.pName=pName;
      this.price=price;
}
}
class products{
 public static void main(String [] args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the product code:");
    int pCode=sc.nextInt();
   System.out.print("Enter the product name:");
    String pName=sc.next();
   System.out.print("Enter the price:");
    int price=sc.nextInt();
    product[] ps=new product[3];
    
    ps [0]=new product(pCode,pName,price);
    ps [1]=new product(005,"box",25);
    ps [2]=new product(001,"pencil",15);
 
    int minprice=ps[0].price;
   System.out.println("pcode\tpname\tprice");
   for(product p:ps){
         System.out.println(p.pCode+"\t"+p.pName+"\t"+p.price);
    if(minprice>p.price){
       
        minprice=p.price;
     }
 }
  System.out.println("----------------------");
 System.out.println("LOWEST COST PRODUCTS");
  
  System.out.println("------------------------");
  
 for(product p:ps){
   if(minprice==p.price){
    
     System.out.println("Product code:"+p.pCode);
     System.out.println("Product name:"+p.pName);
     System.out.println("Price:"+p.price);
 }
}

}

}
      

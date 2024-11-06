class Example3
{
  public static void main(String args[ ])
   {
     int num=Integer.parseInt(args[0]);
     int cnt=(num-1)/2;

     for(int i=1; i<=num; i+=2)
      {
         for(int k=1;k<=cnt;k++)
          {
            System.out.print(" ");
          } 

         for(int j=1;j<=i; j++)
          {
             if(i!=num)
              {

                  if((j==1)||(j==i))
                           System.out.print("*");
                  else
                           System.out.print(" ");
               }
             else  
                           System.out.print("*");
          }

            System.out.println("");
            cnt--;
      }

   }
}
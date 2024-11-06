class Example25
{
  public static void main(String args[ ])
   {    
     int num;

    for(int i=1; i<=10;)
       {
          num=(int)(Math.random()*10000);

          if(num>=1000)
            {
              System.out.println("Number is: " + num + "      SquareRoot:" + Math.sqrt(num));
              i++;
            }
       }

   }
}
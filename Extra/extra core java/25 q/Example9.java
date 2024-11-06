class Example9
{
  public static void main(String args[ ])
   {    
     int arr[ ]=new int[4];

     arr[0]=1;
     arr[1]=2;
     arr[2]=3;
     arr[3]=4;
 
     int cnt=4;

     for(int i=0; i<4; i++)
      {
       for(int j=cnt;j>0; j--)
        {
          System.out.print(arr[j-1]); 
        }

          System.out.println(""); 
          cnt--;
      }
 
   }
}
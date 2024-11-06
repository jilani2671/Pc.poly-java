class Example19
{
  public static void main(String args[ ])
   {    
     
     if(args[0].equals("byte"))
      {
        System.out.println("Max value: " + Byte.MAX_VALUE);
        System.out.println("Min Value: " + Byte.MIN_VALUE);
      }
     else if(args[0].equals("short"))
      {
        System.out.println("Max value: " + Short.MAX_VALUE);
        System.out.println("Min Value: " + Short.MIN_VALUE);
      }
     else if(args[0].equals("int"))
      {
        System.out.println("Max value: " + Integer.MAX_VALUE);
        System.out.println("Min Value: " + Integer.MIN_VALUE);
      }
     else if(args[0].equals("long"))
      {
        System.out.println("Max value: " + Long.MAX_VALUE);
        System.out.println("Min Value: " + Long.MIN_VALUE);
      }
     else if(args[0].equals("float"))
      {
        System.out.println("Max value: " + Float.MAX_VALUE);
        System.out.println("Min Value: " + Float.MIN_VALUE);
      }
     else if(args[0].equals("double"))
      {
        System.out.println("Max value: " + Double.MAX_VALUE);
        System.out.println("Min Value: " + Double.MIN_VALUE);
      }

   }
}
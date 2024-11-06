//Store this page in C:\Tomcat\webapps\examples\WEB-INF\classes\mypack

package mypack;

public class Student
{
  private int sno;
  private String sname;
  private int age;

  public void setSno(int sno)
   {
    this.sno=sno; 
   }

  public int getSno()
   {
    return sno; 
   }

  public void setSname(String sname)
   {
    this.sname=sname; 
   }

  public String getSname()
   {
    return sname; 
   }

  public void setAge(int age)
   {
    this.age=age; 
   }

  public int getAge()
   {
    return age; 
   }
}
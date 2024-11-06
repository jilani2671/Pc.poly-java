import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

class Win extends WindowAdapter 
{
  Frame frm;

  Win(Frame f)
   {
     frm=f;
   }

  public void windowClosing(WindowEvent we)
   {
      frm.setVisible(false);
      frm.dispose();
   }

}

class StudFrame extends Frame 
implements ActionListener, ItemListener
{
  Label L1,L2,L3;
  TextField t1,t2,t3;
  Panel p1=new Panel();
  Panel p2=new Panel();
  Panel p3=new Panel();
  Panel p4=new Panel();

   List Lst;

   Button badd, bmodify, bdelete, bsave, bcancel, bexit;
   String flag=""; 

   StudFrame()
    {
      setTitle("Student Information");
      addWindowListener(new Win(this));
      p1.setLayout(new GridLayout(3,2));

      L1=new Label("Enter Sno"); 
      L2=new Label("Enter Name"); 
      L3=new Label("Enter Age");

      t1=new TextField(10);  
      t2=new TextField(10);  
      t3=new TextField(10);  

       Lst=new List(5, false);

        badd=new Button("Add");
        bmodify=new Button("Modify");
        bdelete=new Button("Delete");
        bsave=new Button("Save");
        bcancel=new Button("Cancel");
        bexit=new Button("Exit");       

       p1.add(L1);
       p1.add(t1);
       p1.add(L2);
       p1.add(t2);
       p1.add(L3);
       p1.add(t3);

       p2.add(Lst);

       p3.add(p1);
       p3.add(p2);
       p3.add(p4);
       add(p3);

       p4.add(badd);
       p4.add(bmodify);
       p4.add(bdelete);
       p4.add(bsave);
       p4.add(bcancel);
       p4.add(bexit);


       p3.setBackground(Color.cyan);

       p1.enable(false);

       bmodify.enable(false);
       bdelete.enable(false);
       bsave.enable(false);  
       bcancel.enable(false);

       badd.addActionListener(this);
       bmodify.addActionListener(this);
       bdelete.addActionListener(this);
       bsave.addActionListener(this);  
       bcancel.addActionListener(this);
       bexit.addActionListener(this);

       Lst.addItemListener(this);

       fillList();
    }

    //function 1
  void fillList()
   {
     Lst.clear();

     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:MyAccDSN","","");
         String query="Select * from student";

         Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(query);

          while(rs.next())
           {
             Lst.add(rs.getString("sno") + " " + rs.getString("sname"));
           }

         rs.close();
         stmt.close();
         con.close(); 
       }
    catch(Exception e)
       {
         System.out.println(e);
       }      
   }
  //function1 ends here

    //function 2
  void getStud(int sno)
   {
     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:MyAccDSN","","");
         String query="Select * from student where sno=" + sno;

         Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(query);

          if(rs.next())
           {
             t1.setText(rs.getString("sno"));
             t2.setText(rs.getString("sname"));
             t3.setText(rs.getString("age"));
           }

         rs.close();
         stmt.close();
         con.close(); 
       }
    catch(Exception e)
       {
         System.out.println(e);
       }      
   }
  //function2 ends here

  //Function 3
   void enabled()
    {
      badd.enable(false);
      bmodify.enable(false);
      bdelete.enable(false);
      bsave.enable(true);
      bcancel.enable(true); 
    }
  //Function 3 ends here

  //Function 4
   void cancel()
    {
      t1.setText("");
      t2.setText("");
      t3.setText("");
    
      p1.enable(false); 

      badd.enable(true);
      bmodify.enable(false);
      bdelete.enable(false);
      bsave.enable(false);
      bcancel.enable(false);      
    }
  //Function 4 ends here

    //function 5
  void insertStud(int sno, String sname, int age)
   {
     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:MyAccDSN","","");
         String query="Insert into student values(" + sno + ",'" + sname + "'," + age + ")";

         Statement stmt=con.createStatement();
         stmt.executeUpdate(query);

         stmt.close();
         con.close(); 
       }
    catch(Exception e)
       {
         System.out.println(e);
       }      
   }
  //function5 ends here

    //function 6
  void updateStud(int sno, String sname, int age)
   {
     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:MyAccDSN","","");
         String query="Update student set sname='" + sname + "', age=" + age + " where sno=" + sno;

         Statement stmt=con.createStatement();
         stmt.executeUpdate(query);

         stmt.close();
         con.close(); 
       }
    catch(Exception e)
       {
         System.out.println(e);
       }      
   }
  //function6 ends here

    //function 7
  void deleteStud(int sno)
   {
     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:MyAccDSN","","");
         String query="Delete from student where sno=" + sno;

         Statement stmt=con.createStatement();
         stmt.executeUpdate(query);

         stmt.close();
         con.close(); 
       }
    catch(Exception e)
       {
         System.out.println(e);
       }      
   }
  //function7 ends here

  public void actionPerformed(ActionEvent ae)
   {
     String str=ae.getActionCommand();

     if(str.equals("Add"))
      {
        t1.setFocusable(true);
        flag="Add";
        p1.enable(true);
        enabled(); 
      } 

     if(str.equals("Cancel"))
      {
        cancel(); 
      }

     if(str.equals("Exit"))
      {
        dispose();
      }

     if(str.equals("Save"))
      {
           int sno=Integer.parseInt(t1.getText());
           String sname=t2.getText(); 
           int age=Integer.parseInt(t3.getText());

        if(flag.equals("Add"))
          {
            insertStud(sno,sname,age);
            JOptionPane.showMessageDialog(this,"Record added succesfully");    
           }

        if(flag.equals("Modify"))
          {
            updateStud(sno,sname,age);
            JOptionPane.showMessageDialog(this,"Record updated succesfully");    
           }  

        fillList();
        cancel();
      }

     if(str.equals("Modify"))
      {
        flag="Modify";
        p1.enable(true);
        enabled(); 
      }

     if(str.equals("Delete"))
      {
        //JOptionPane.showMessageDialog(this,"Click_in");    
        int i=JOptionPane.showConfirmDialog(this,"R u sure u want to delete this record?");    

        System.out.println(i); 

        if(i==0)  
          {
            int sno=Integer.parseInt(t1.getText());
            deleteStud(sno);
            JOptionPane.showMessageDialog(this,"Record deleted succesfully");    
            fillList();
            cancel();
          }
      }

   }

  public void itemStateChanged(ItemEvent ie)
   {
     badd.enable(false);
     bmodify.enable(true);
     bdelete.enable(true);
     bsave.enable(false);
     bcancel.enable(true);

     String item=Lst.getSelectedItem();
     String arr[ ]=item.split(" ");
     int sno=Integer.parseInt(arr[0]);
     getStud(sno);
   }
}

class FindFrame extends Frame
implements KeyListener
{
  TextField t1;
   List Lst;

  FindFrame()
   {
     addWindowListener(new Win(this));
     setLayout(new FlowLayout());
     t1=new TextField(20);
     Lst=new List(5, false);
     add(t1);
     add(Lst);     
     t1.addKeyListener(this);
   }

  public void keyPressed(KeyEvent ke)
  {
  }

  public void keyReleased(KeyEvent ke)
  {
      Lst.clear();
      String searchstr=t1.getText();

      if(searchstr.equals("")) return;

      int len=searchstr.length();
      String sname="", substr="";

     Connection con=null;

     try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:MyAccDSN","","");
         String query="Select * from student";

         Statement stmt=con.createStatement();
         ResultSet rs=stmt.executeQuery(query);

          while(rs.next())
           {
             sname=rs.getString("sname");
             substr=sname.substring(0,len);
             
             if(substr.equals(searchstr))
                  Lst.add(rs.getString("sno") + "  " + sname);
           }

         rs.close();
         stmt.close();
         con.close(); 
       }
    catch(Exception e)
       {
         System.out.println(e);
       }      

  }

  public void keyTyped(KeyEvent ke)
    {
    }
}

class MainFrame extends Frame implements ActionListener
{
  MainFrame()
   {
     addWindowListener(new Win(this));
     MenuBar mbar=new MenuBar();
     setMenuBar(mbar);     

     Menu m1=new Menu("Master");
     MenuItem m11=new MenuItem("Student");
     MenuItem m12=new MenuItem("Staff");
     m1.add(m11);
     m1.add(m12);
     mbar.add(m1);

     Menu m2=new Menu("Detail");
     MenuItem m21=new MenuItem("Search");
     MenuItem m22=new MenuItem("Receipt");     
     m2.add(m21);
     m2.add(m22);
     mbar.add(m2);
 
     m11.addActionListener(this);
     m12.addActionListener(this);
     m21.addActionListener(this);
     m22.addActionListener(this);
   }

  public void actionPerformed(ActionEvent ae)
   {
     String str=ae.getActionCommand();

     if(str.equals("Student"))
      {
        StudFrame sf=new StudFrame();
        sf.setSize(400,200); 
        sf.setVisible(true);        
      }
     else if(str.equals("Search"))
      {
         FindFrame ff=new FindFrame();
         ff.setSize(200,200);
         ff.setVisible(true);
         System.out.println(ff.getOwner());
      }
     else if(str.equals("Exit"))
      {
        this.dispose();
      }
   }
}

class Demo1
{
  public static void main(String args[ ])
   {
     MainFrame mf=new MainFrame();
     mf.setSize(400,200); 
     mf.setVisible(true);
     mf. setExtendedState(Frame.MAXIMIZED_BOTH);
   }
}


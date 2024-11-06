 #include<iostream.h>
 #include<conio.h>
 class first
 {
  int no;
  clrscr();
  public:
  void getdata()
  {
  cout<<"enter any no";
  cin>>no;
  }
  friend void operator+(first,first);
  };
  void operator + (first f1,first f2)
  {
  cout<<"sum="<<f1.no+f2.no;
  }
  first f1,f2;
  clrscr();
  f1.getno;
  f2.getno;
  f1+f2;
  getch();
  }
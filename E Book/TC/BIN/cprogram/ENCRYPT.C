#include<stdio.h>
#include<conio.h>
#include<string.h>
void main()
{
 char name[20];
 int i,j,count=0,l;
 clrscr();
 printf("please enter the name");
 scanf("5s",&name);
 l=strlen(name);
 for(i=0;i<=l;i++)
 {
 printf("%c",name[i]);
 for(j=65;j<=90;j++)
 {
  if(count!=3)
  {
   printf("%c"j);
   count++
  }
  else
  {
   count==0;
   continue;
  }
 }
}
getch();
}

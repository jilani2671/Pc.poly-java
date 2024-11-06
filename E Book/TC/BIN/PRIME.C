#include<stdio.h>
#include<conio.h>
void main()
{
 int n,flag=0;
 clrscr();
 printf("enter any no");
 scanf("&d",n);
 while(n>0)
 {
 if(n/2==0)
 {
 flag=1
 if(flag==1)
 {
 printf("no is not prime");
 }
 else
 {
 printf("no is prime");
 }
 }
 }
 getch();
}
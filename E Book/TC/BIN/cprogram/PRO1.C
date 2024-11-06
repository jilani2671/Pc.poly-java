#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
#define STRLEN 80
#define ENCRYPTION_KEY 47
void encrypt(char*str)
{
 int i;
 for(i=0;str[i];i++)
 {
  str[i]+=ENCRYPTION_KEY;
  }
}
void decrypt(char*str)
{
 int i;
 for(i=0;str[i];i++)
 {
  str[i]=ENCRYPTION_KEY;
 }
}
void error()
{
 printf("error please enter a string first:\n");
}
void main()
{
char str[  ];
int choice;
strcpy(str," ");
while(1)
{
printf("\n\n enter a string to encrypt decrypt \n");
printf("2 encrypt the given string");
printf("3 decrypt the given string");
printf("4 exist");
printf("you wish my command")
scanf("%d",choice);
switch(case)
{
case 1:
 gets(str);
printf("enter a string:");
gets(str);
break;
case 2:
 if(strcmp(str," ")==0)
 {
  error();
 }
 else
 {
 encrypt(string)
 printf("\n encrypted string:%s",str);
 }
 break;
 case 3:
 if(strcmp(str," ")==0)
 {
 error();
 }
 else
 {
 decrypt(str);
 printf("\n decrypted string:%s":str);
 }
 break;
 case 4:
  exist(0);
  break;
  default:
  printf("wrong choice");
  break;
 }
}

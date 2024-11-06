#include<stdio.h>
#include<conio.h>
#include<string.h>

	void main()
	{
		 char str[15],ch;
		 int i,cnt=0;
		 clrscr();

		 printf("\n Enter the String:");
		 gets(str);

		 printf("\n Enter d Character to check:");
		 scanf("%c",&ch);

		 for(i=0;str[i]!='\0';i++)
		 {
		     if(str[i]==ch)
		     {
			cnt++;
		     }
		 }

		if(cnt>0)
		{
		    printf("\n\n\t %c is present in %s %d times...!",ch,str,cnt);
		}
		  else
		  {
			printf("\n\n\t %c is not present in %s...!",ch,str);
		   }

		getch();

     }
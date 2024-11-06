#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10],i,sum=0;
	clrscr();

	printf("\n Enter the Elements in Array:");
	for(i=0;i<10;i++)
	{
	    scanf("%d",&a[i]);
	    sum=sum+a[i];
	}
	printf("\n The Sum is: %d",sum);
	getch();
  }
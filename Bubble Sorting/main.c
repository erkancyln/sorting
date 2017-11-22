#include <stdio.h>
#include <stdlib.h>
int main()
{
	int temp;
	int i,a,j,b;
	int sayi;
	int dizi[1000];
	
	printf("Kac Sayi Gireceksiniz:");scanf("%d",&sayi);
	
	for(a=0;a<sayi;a++)
	{
	printf("%d.Sayiyi Giriniz:",a+1);scanf("%d",&dizi[a]);
	}
	for(i=0;i<sayi;i++)
	{
		for(j=0;j<sayi;j++)
		{
			if(dizi[j]>dizi[j+1])
			{
				temp=dizi[j];
				dizi[j]=dizi[j+1];
				dizi[j+1]=temp;
			}
		}
	}
	for(b=0;b<sayi;b++)
	{
		printf("%d ",dizi[b]);
	}
	return 0;
}

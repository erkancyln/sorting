#include <stdio.h>
#include <stdlib.h>
int main()
{
	int sayi,i,j,temp;
	printf("Kac Sayi Gireceksiniz:");scanf("%d",&sayi);
	int dizi[sayi];
	for(i=0;i<sayi;i++)
	{
	    printf("%d.sayiyi giriniz:",i+1);scanf("%d",&dizi[i]);
    }
	for (i=0;i<sayi;i++)
    {
    	for(j=0;j<sayi;j++)
    	{
    		if(dizi[i]<dizi[j])
    		{
    			temp=dizi[i];
    			dizi[i]=dizi[j];
    			dizi[j]=temp;
			}
		}
    }
    for(i=0;i<sayi;i++)
    {
    	printf("%d\n",dizi[i]);
	}
return 0;

}

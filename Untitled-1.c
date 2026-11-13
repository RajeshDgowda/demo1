#include<stdio.h>
#include<omp.h>
int fib(int n){
    int x, y;
if(n<2)
return n;
x =fib(n-1);
y=fib(n-2);
return x+y;
int main(){
    int n;
    printf("enter number of fibonacia terms:");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    int result;
    {
        {
            result =fib(i)
        }
    }
printf("%d", result);
printf("\n");
}
return 0;
}
#include<stdio.h>

int main()
{
    int i = 11;
    float f = 90.90;
    double d = 90.28635

    int *ip = &i;
    float *fp = &f;
    double *dp = &d;

    printf("%d\n",*ip);
    printf("%f\n",*fp);
    printf("%f\n",*dp);

    vp = &ch;
    printf("%d\n",*(int *)vp);

    return 0;
}
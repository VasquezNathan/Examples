#include <stdio.h>
int main(){
    int a = 1;
    int b = 1;
    int c = 0;
    long int total = 0;
    int flag = 1;
    
    while(flag == 1){
        c = a + b;
        a = b;
        b = c;
        
        printf("%d\n", c);
        
        if((c % 2 == 0) && (c <= 4000000))
            total = total + c;
        
        if(c > 4000000)
            flag = 0;
        
        
    }
    printf("\n%ld\n", total);
    
}

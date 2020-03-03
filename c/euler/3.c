#include <stdio.h>
int main(){
long int number = 600851475143;
long int halfway = number/2;

long int largest = 0;

int flag = 1;
long int i = 2;
while(flag == 1){
	if(number % i == 0)
		printf("%ld factors to %ld and %ld\n",number,i,number/i);
i = i + 1;
	if(i >= number/i)
		flag = 0;


}
}

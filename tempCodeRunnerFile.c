#include <stdio.h>

int main() {
    char input;
    int sum = 0;

    printf("Enter a character: ");
    input = scanf("%c", &input);


    while (input != 'Q' && input != 'q') {
        if (input >= '0' && input <= '9') {
            sum += input - '0';
        } else {
            printf("Input is not a digit\n");
        }
    }

    printf("Sum of digits entered: %d\n", sum);

    return 0;
}
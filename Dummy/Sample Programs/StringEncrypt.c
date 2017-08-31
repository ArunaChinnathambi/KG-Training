public class SrtingEncrypt{
int main() {
    int i, key, j;
    char c[20];

    printf("enter a string\t");
    scanf("%s", &c);

    printf("enter key\t");
    scanf("%d", &key);

    for (i = 0; i < 20; i++) {
        for (j = 0; j < key; j++)
            c[i]++;
    }
    printf("1st encrypted text is %s \n", c);

    for (i = 0; i < 20; i++) {
        switch (i % 3) {
            case 0:
                c[i]++;
                break;
            case 1:
                c[i]--;
                break;
            case 2:
                c[i] += 2;
                break;
        }
    }
    printf("2nd encrypted text is %s \n", c);

    for (i = 0; i < 20; i++) {
        switch (i % 3) {
            case 0:
                c[i]--;
                break;
            case 1:
                c[i]++;
                break;
            case 2:
                c[i] -= 2;
                break;
        }
    }
    printf("1st decrypted text is %s \n", c);
    for (i = 0; i < 20; i++) {
        for (j = 0; j < key; j++)
            c[i]--;
    }
    printf("2nd decrypted text is %s \n", c);

    return 0;
}
}
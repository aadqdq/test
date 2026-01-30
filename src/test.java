import java.util.Scanner;
import java.util.Random;
public class test {
    public static void main(String[] args) {
        System.out.println("1234567");

        /*System.out.println("Hello World");

        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int y=0;
        int number=r.nextInt(1,101);

        while(y==0) {
            int x=sc.nextInt();
            if (x == number) {System.out.println("猜对了");
            y++;}
            if (x > number){ System.out.println("猜大了");
            continue;}
            if (x < number) {System.out.println("猜小了");
            continue;}
        int []array=new int[10];
        Random r=new Random();
        int sum=0;
        int count=0;
        for (int i = 0; i < array.length; i++) {
array[i]=r.nextInt(1,101);
sum=sum+array[i];
        }
        double P=  sum /(array.length);
        for (int j : array) {
            if (j < P) {
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(P);
        System.out.println(count);*/
        int [] array={1,2,3,4,5};
        Random r=new Random();
        for(int i=0;i<array.length/2;i++){
            while(i<array.length/2){
                int temt=0;
                int x=r.nextInt(0,array.length);
                if(i!=x){
                    temt=array[i];
                    array[i]=array[x];
                    array[x]=temt;
                    break;
                }else{
                    break;
                }
        }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }}


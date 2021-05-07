import java.util.ArrayList;
import java.util.Scanner;

public class myCod {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int student[] = new int[number];

        ArrayList<String>leg1=new ArrayList<>();
        ArrayList<String>leg2=new ArrayList<>();
        ArrayList<String>leg3=new ArrayList<>();
        for(int i=0;i<number;i++){
                student[i]=input.nextInt();
        }
        int b=1;
        for(int y=0;y<number;y++){
            int a=student[y];
            if(b==1){
                leg1.add(a+" ");
            }
            else if(b==2){
                leg2.add(a+" ");
            }
            else if (b==3){
                leg3.add(a+" ");
            }
            b++;
            if(b==4){
                b=1;
            }

        }
        System.out.println(leg1);
        System.out.println(leg2);
        System.out.println(leg3);
        }

    }

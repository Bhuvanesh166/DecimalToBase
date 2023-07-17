import java.util.Scanner;

class DecimalToBase{
    public String findNumber(int decimal,int base){
        String s="";

        while(decimal>0){
            int rem=decimal%base;
            s+=String.valueOf(rem);
            decimal=decimal/base;
        }
        StringBuilder sb=new StringBuilder(s);
        return String.valueOf(sb.reverse());
    }



    public static void main(String[] args) {
        DecimalToBase decimal=new DecimalToBase();
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int base= scanner.nextInt();
        System.out.println(decimal.findNumber(num,base));

    }

}

public class Main {
    public static void main(String[] args) {

        //задание 1
        for ( int i=0; i<10; i++){
            System.out.println("Отсчет " + i);
        }
        for ( int a=10; a>0; a--) {
            System.out.println("Отсчет "+ a );
        }

        for ( int b =0; b<17; b=b+2) {
            System.out.println("четные " + b);
        }
        for ( int c=10; c>-11; c--) {
            System.out.println("От большего " + c);
        }

        //задание 2

        for (int year = 1904; year<2096; year = year+4){
            System.out.println(year + " год является високоным");
        }

        for (int d=0; d<105; d=d+7){
            System.out.println("числа " + d);
        }


        for (int e=1; e<600; e=e*2 ){
            System.out.println(e);
        }

        //задание 3


        int salary = 74124;
        int total = 0;
        for (int f=0; f<12; f++){
            total = total+total/100;
            total = total + salary;
            System.out.println("в месяц сумма накоплений "+ total + " рубей");
        }
    }

}
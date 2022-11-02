public class Program2 {
        public static void main (String[] args) {
            int sum1 = 0; //сумма первого значения (100)
            int sum2 = 0; //сумма первого значения (400000)
            int a=1;
            int d=2;
            int i;

            for (i=0;d<100;a=i){
                if (d % 2 == 0) {
                    sum1 += d; //если значение d четное, то значение сладывает в сумму
                }
                i = d;
                d += a;
                }
            a=1;
            d=2;
            for (i=0;d<4000000;a=i){
                if (d % 2 == 0) {
                    sum2 += d; //если значение d четное, то значение сладывает в сумму
                }
                i = d;
                d += a;
            }
            System.out.println("Sum: "+sum1);
            System.out.println("Sum: "+sum2);
        }

}


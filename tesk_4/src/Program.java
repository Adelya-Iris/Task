public class Program {
    public static void main (String[] args) {
        int sum=0; //создание цельной переменной
        for (int i=1;i<1000;i++) //создаем цикл,в который будет выполняться пока i<1000
        {
            if (i%4==0 && i%7==0) //если число кратно 4 и 7 то оно складывается в sum
            {
                sum+=i;
                System.out.println(i);
            }
        }
        System.out.println("Сумма: "+sum);//Вывод
    }
}

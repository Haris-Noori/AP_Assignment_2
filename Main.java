public class Main{

    public static void countEven(int range)
    {
        int evens = 0;
        for(int i = 1; i <= range; i++)
        {
            if(i%2 == 0)
            {
                evens++;
            }
        }
        System.out.println("Evens: " + evens);
    }

    public static boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }

        for(int i = 2; i * i <= num; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void countPrime(int range)
    {
        int primes = 0;
        for(int num = 1; num <=  range; num++)
        {
            if(isPrime(num))
            {
                primes++;
            }
        }

        System.out.println("Primes: " + primes);
    }

    public static void main(String args[])
    {
        int range = 10000;

        Runnable runnable1 = ()->{
            countPrime(range);
        };

        Runnable runnable2 = ()->{
            countEven(range);
        };

        new Thread(runnable1).start();
        new Thread(runnable2).start();
    }
}
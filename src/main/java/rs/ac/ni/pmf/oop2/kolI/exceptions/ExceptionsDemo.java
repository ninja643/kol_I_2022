package rs.ac.ni.pmf.oop2.kolI.exceptions;

import java.util.Scanner;

public class ExceptionsDemo
{
    public static void main1(String[] args)
    {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj: ");

//        final int x = scanner.nextInt();
//        System.out.println("Uneli ste broj: " + x);

        try
        {
            final int x = scanner.nextInt();
            System.out.println("Uneli ste broj: " + x);
        }
        catch (Exception e)
        {
            System.out.println("Greska! Niste uneli broj");
        }

        System.out.println("Kraj");
    }

    public static void main(String[] args)
    {
        final Worker worker = new Worker();

        try
        {
            worker.doWork();
        }
        catch (CalculationException e)
        {
            System.err.println("Original stack trace: ");
            e.printStackTrace();


            Throwable actualException = e.getCause();

            System.err.println("\nActual exception stack trace");
            actualException.printStackTrace();
        }
    }
}

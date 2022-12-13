package rs.ac.ni.pmf.oop2.kolI.exceptions;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Worker
{
    public void doWork()
        //throws InitializationFailedException, CalculationFailedException
            throws CalculationException
    {
        try
        {
            prepareForWork();
            execute();
        }
        catch (CalculationFailedException | InitializationFailedException e)
        {
//            e.printStackTrace();
            throw new CalculationException(e.getMessage(), e);
        }
        finally
        {
            cleanUp();
        }
    }

    private void cleanUp()
    {
        System.out.println("Cleaning up...");
    }

    private void execute() throws CalculationFailedException
    {
        start();
        System.out.println("Doing the work...");

        final Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (y != 0)
        {
            doComplexCalculations(x / y);
        }
        else
        {
            throw new PreparationForCalculationFailedException("Division by 0!");
        }

        finishWork();
    }

    private void doComplexCalculations(int value) throws IllegalCalculationValueException
    {
        if (value > 5)
        {
            throw new IllegalCalculationValueException("Calculations cannot be done for values greater than 5");
        }

        System.out.println("Result of complex calculation: " + value);
    }

    private void finishWork()
    {
        System.out.println("Work finished");
    }

    private void start()
    {
        System.out.println("Starting work");
    }

    private void prepareForWork() throws InitializationFailedException
    {
        System.out.println("Preparing for work");

        final Random random = new Random();
        final int value = random.nextInt(10);

        if (value == 0)
        {
            throw new InitializationFailedException("Initialization failed due to random event");
        }

    }


}

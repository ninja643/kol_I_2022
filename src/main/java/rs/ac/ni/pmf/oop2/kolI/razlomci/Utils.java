package rs.ac.ni.pmf.oop2.kolI.razlomci;

public class Utils
{
    // Podrazumeva da su a i b prirodni brojevi
    public static int nzd(final int a, final int b)
    {
        if (a == b)
        {
            return a;
        }
        if (a > b)
        {
            return nzd(a - b, b);
        }

        return nzd(a, b - a);
    }
}

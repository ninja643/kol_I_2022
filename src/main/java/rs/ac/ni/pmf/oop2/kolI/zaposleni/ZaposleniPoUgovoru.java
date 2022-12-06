package rs.ac.ni.pmf.oop2.kolI.zaposleni;

public class ZaposleniPoUgovoru extends Zaposleni
{
    public ZaposleniPoUgovoru(String ime, double brutoPlata)
    {
        super(ime, brutoPlata);
    }

    @Override
    public double porez(PoreskeOpcije opcije)
    {
        return getBrutoPlata() * opcije.getProcenatPoUgovoru() / 100;
    }
}

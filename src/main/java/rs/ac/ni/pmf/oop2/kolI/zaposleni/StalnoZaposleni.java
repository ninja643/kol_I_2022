package rs.ac.ni.pmf.oop2.kolI.zaposleni;

public class StalnoZaposleni extends Zaposleni
{
    public StalnoZaposleni(String ime, double brutoPlata)
    {
        super(ime, brutoPlata);
    }

    @Override
    public double porez(PoreskeOpcije opcije)
    {
        return getBrutoPlata() * opcije.getProcenat() / 100;
    }
}

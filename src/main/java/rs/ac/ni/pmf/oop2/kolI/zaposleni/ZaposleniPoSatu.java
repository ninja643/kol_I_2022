package rs.ac.ni.pmf.oop2.kolI.zaposleni;

public class ZaposleniPoSatu extends Zaposleni
{
    private final int brojSati;

    public ZaposleniPoSatu(String ime, double brutoPlata, int brojSati)
    {
        super(ime, brutoPlata);

        this.brojSati = brojSati;
    }

    @Override
    public double porez(PoreskeOpcije opcije)
    {
        final double zarada = getBrutoPlata() * brojSati;
        return zarada > opcije.getFiksniPorez() ? opcije.getFiksniPorez() : zarada;
    }

    @Override
    public double ukupanBruto()
    {
        return getBrutoPlata() * brojSati;
    }
}

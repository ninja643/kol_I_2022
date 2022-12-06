package rs.ac.ni.pmf.oop2.kolI.zaposleni;

import java.util.ArrayList;
import java.util.List;

public class ObracunPoreza
{
    private List<Zaposleni> listaZaposlenih = new ArrayList<>();

    public void dodajZaposlenog(final Zaposleni zaposleni)
    {
        listaZaposlenih.add(zaposleni);
    }

    public double ukupnaBrutoPlata()
    {
        double ukupniBruto = 0.0;
        for (final Zaposleni zaposleni : listaZaposlenih)
        {
            ukupniBruto += zaposleni.ukupanBruto();
        }

        return ukupniBruto;
    }

    public double ukupanPorez(final PoreskeOpcije opcije)
    {
        double ukupanPorez = 0.0;
        for (final Zaposleni zaposleni : listaZaposlenih)
        {
            ukupanPorez += zaposleni.porez(opcije);
        }

        return ukupanPorez;
    }
}

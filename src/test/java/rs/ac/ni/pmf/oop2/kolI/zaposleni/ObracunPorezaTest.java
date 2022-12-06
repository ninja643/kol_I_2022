package rs.ac.ni.pmf.oop2.kolI.zaposleni;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ObracunPorezaTest
{
    @Test
    public void proveraObracuna()
    {
        final ObracunPoreza obracunPoreza = new ObracunPoreza();
        obracunPoreza.dodajZaposlenog(new StalnoZaposleni("Mika", 1000));
        obracunPoreza.dodajZaposlenog(new ZaposleniPoUgovoru("Pera", 2000));
        obracunPoreza.dodajZaposlenog(new ZaposleniPoSatu("Laza", 100, 30));
        obracunPoreza.dodajZaposlenog(new ZaposleniPoSatu("Tasa", 200, 5));

        assertThat(obracunPoreza.ukupnaBrutoPlata()).isEqualTo(7000);
        assertThat(obracunPoreza.ukupanPorez(new PoreskeOpcije(40, 20,2000)))
                .isEqualTo(3800);
    }
}
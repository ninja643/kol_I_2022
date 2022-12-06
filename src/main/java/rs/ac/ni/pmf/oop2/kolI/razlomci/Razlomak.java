package rs.ac.ni.pmf.oop2.kolI.razlomci;

import lombok.Getter;

@Getter
public class Razlomak
{
    private final int brojilac;
    private final int imenilac;

    public Razlomak(final int brojilac, final int imenilac)
    {
        if (imenilac == 0)
        {
            throw new IllegalArgumentException("Imenilac ne sme biti 0");
        }

        if (brojilac == 0)
        {
            this.brojilac = 0;
            this.imenilac = 1;
            return;
        }

        final int nzd = Utils.nzd(Math.abs(brojilac), Math.abs(imenilac));
        this.brojilac = (imenilac < 0) ? -brojilac / nzd : brojilac / nzd;
        this.imenilac = Math.abs(imenilac / nzd);
    }

    @Override
    public String toString()
    {
        if (imenilac == 1)
        {
            return String.valueOf(brojilac);
        }

        return brojilac + "/" + imenilac;
    }

    public Razlomak dodaj(final Razlomak drugi)
    {
        return new Razlomak(this.brojilac * drugi.imenilac + this.imenilac * drugi.brojilac,
                            this.imenilac * drugi.imenilac);
    }

    public Razlomak oduzmi(final Razlomak drugi)
    {
        return new Razlomak(this.brojilac * drugi.imenilac - this.imenilac * drugi.brojilac,
                            this.imenilac * drugi.imenilac);
    }

    public Razlomak pomnozi(final Razlomak drugi)
    {
        return new Razlomak(this.brojilac * drugi.brojilac, this.imenilac * drugi.imenilac);
    }

    public Razlomak podeli(final Razlomak drugi)
    {
        if (drugi.brojilac == 0)
        {
            throw new IllegalArgumentException("Nije dozvoljeno deljenje nulom");
        }

        return new Razlomak(this.brojilac * drugi.imenilac, this.imenilac * drugi.brojilac);
    }

    public static Razlomak of(int brojilac, int imenilac)
    {
        return new Razlomak(brojilac, imenilac);
    }

    public Razlomak reciprocnaVrednost()
    {
        if (brojilac == 0)
        {
            throw new UnsupportedOperationException("Nula nema reciprocnu vrednost");
        }

        return new Razlomak(this.imenilac, this.brojilac);
    }
}

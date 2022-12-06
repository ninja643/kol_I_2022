package rs.ac.ni.pmf.oop2.kolI.zaposleni;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Zaposleni
{
    private final String ime;
    private final double brutoPlata;

    public abstract double porez(final PoreskeOpcije opcije);

    public double ukupanBruto()
    {
        return brutoPlata;
    }
}

package rs.ac.ni.pmf.oop2.kolI.razlomci;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class RazlomakTest
{
    @Test
    public void kreiranjeRazlomka()
    {
        assertThat(new Razlomak(2, 2).toString()).isEqualTo("1");
        assertThat(new Razlomak(4, 2).toString()).isEqualTo("2");
        assertThat(new Razlomak(6, 9).toString()).isEqualTo("2/3");
        assertThat(new Razlomak(-2, 2).toString()).isEqualTo("-1");
        assertThat(new Razlomak(2, -2).toString()).isEqualTo("-1");
        assertThat(new Razlomak(-2, -2).toString()).isEqualTo("1");
        assertThat(new Razlomak(0, -2).toString()).isEqualTo("0");
        assertThat(new Razlomak(-2, -8).toString()).isEqualTo("1/4");
        assertThat(new Razlomak(2, -8).toString()).isEqualTo("-1/4");
        assertThat(new Razlomak(-2, 8).toString()).isEqualTo("-1/4");
        assertThat(new Razlomak(12, 18).toString()).isEqualTo("2/3");

        assertThat(Razlomak.nula().toString()).isEqualTo("0");
    }

    @Test
    public void operacije()
    {
        assertThat(Razlomak.of(2, 3).dodaj(Razlomak.of(2, 3)).toString())
                .isEqualTo("4/3");
        assertThat(Razlomak.of(2, 3).dodaj(Razlomak.of(-2, 3)).toString())
                .isEqualTo("0");
        assertThat(Razlomak.of(2, 3).oduzmi(Razlomak.of(4, 6)).toString())
                .isEqualTo("0");
        assertThat(Razlomak.of(2, 3).pomnozi(Razlomak.of(2, 3)).toString())
                .isEqualTo("4/9");
        assertThat(Razlomak.of(4, 9).podeli(Razlomak.of(2, 1)).toString())
                .isEqualTo("2/9");
    }

    @Test
    public void reciprocnaVrednost()
    {
        assertThat(Razlomak.of(3, 4).reciprocnaVrednost().toString()).isEqualTo("4/3");
        assertThat(Razlomak.of(-3, 4).reciprocnaVrednost().toString()).isEqualTo("-4/3");
        assertThat(Razlomak.of(1, 2).reciprocnaVrednost().toString()).isEqualTo("2");
    }

    @Test
    public void proveraJednakosti1()
    {
        Razlomak razlomak1 = Razlomak.of(1, 4);
        Razlomak razlomak2 = Razlomak.of(2, 8);

        List<Razlomak> razlomci = new ArrayList<>();
//        razlomci.add(razlomak1);
        razlomci.add(razlomak2);

        if (razlomci.contains(razlomak1))
        {
            System.out.println("Pronadjen!");
        }

        Set<Razlomak> skupRazlomaka = new HashSet<>();
        skupRazlomaka.add(razlomak1);
        skupRazlomaka.add(razlomak2);

        System.out.println("Broj elemenata skupa: " + skupRazlomaka.size());

        List<Integer> listaBrojeva = new ArrayList<>();
        listaBrojeva.add(new Integer(5));
        Integer broj = new Integer(5);
        if (listaBrojeva.contains(broj))
        {
            System.out.println("Broj je pronadjen u listi");
        }

        Set<Integer> skupBrojeva = new HashSet<>();

        skupBrojeva.add(new Integer(5));
        skupBrojeva.add(new Integer(5));

        System.out.println("Broj elemenata skupa: " + skupBrojeva.size());
    }

    @Test
    public void proveraJednakosti2()
    {
        Razlomak razlomak1 = Razlomak.of(1, 2);
        Razlomak razlomak2 = Razlomak.of(2, 3);
        Razlomak razlomak3 = Razlomak.of(2, 4);

        assertThat(razlomak1).isNotEqualTo(razlomak2);
        assertThat(razlomak1).isNotEqualTo(5);
        assertThat(razlomak1).isEqualTo(razlomak3);

    }

    @Test
    public void proveraJednakosti3()
    {
        Set<Razlomak> razlomci = new HashSet<>();
        System.out.println("Dodajem 10/3 u skup");
        razlomci.add(Razlomak.of(10, 3));
        System.out.println("Dodajem 4/9 u skup");
        razlomci.add(Razlomak.of(4, 9));
//        razlomci.add(Razlomak.of(3, 4));
//        razlomci.add(Razlomak.of(4, 5));

        System.out.println("Provera");

        if (razlomci.contains(Razlomak.of(8, 18)))
        {
            System.out.println("Razlomak pronadjen");
        }
        else
        {
            System.out.println("Razlomak nije pronadjen");
        }
    }
}
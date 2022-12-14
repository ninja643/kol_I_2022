package rs.ac.ni.pmf.oop2.kolI.razlomci;

import org.junit.jupiter.api.Test;

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
}
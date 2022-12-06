package rs.ac.ni.pmf.oop2.kolI.razlomci;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UtilsTest
{
    @Test
    public void shouldTestNzd()
    {
        assertThat(Utils.nzd(1, 1)).isEqualTo(1);
        assertThat(Utils.nzd(4, 12)).isEqualTo(4);
        assertThat(Utils.nzd(12, 8)).isEqualTo(4);
        assertThat(Utils.nzd(12, 12)).isEqualTo(12);
        assertThat(Utils.nzd(12, 13)).isEqualTo(1);
        assertThat(Utils.nzd(12, 39)).isEqualTo(3);
        assertThat(Utils.nzd(12, 32)).isEqualTo(4);
    }
}
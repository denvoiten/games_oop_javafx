package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BishopBlackTest {

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        BishopBlack expected = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position(), is(expected.position()));
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        BishopBlack expected = new BishopBlack(Cell.B7);
        assertThat(bishopBlack.copy(Cell.B7).position(), is(expected.position()));
    }
}
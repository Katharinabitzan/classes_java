import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(10, 70);
    }

    @Test
    public void hasPaper() {
        assertEquals(10,printer.getPaper());
    }

    @Test
    public void hasToner() {
        assertEquals(70, printer.getToner());
    }

    @Test
    public void canPrintIfItHasEnoughPaper() {
        printer.print(2, 4);
        assertEquals(2, printer.getPaper());
    }

    @Test
    public void wontPrintIfItHasTooLittlePaper() {
        printer.print(2, 12);
        assertEquals(10, printer.getPaper());
    }

    @Test
    public void canRefillAll() {
        printer.refillAll();
        assertEquals(100, printer.getPaper());
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canPrintIfTonerIsEnough() {
        printer.print(2, 2);
        assertEquals(66, printer.getToner());
    }

    @Test
    public void cantPrintIfTonerIsToLow() {
        printer.print(100, 2);
        assertEquals(70, printer.getToner());
    }

}

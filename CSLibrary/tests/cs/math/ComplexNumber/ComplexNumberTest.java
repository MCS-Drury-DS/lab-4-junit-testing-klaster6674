package cs.math.ComplexNumber;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ComplexNumberTest {
    static final double DELTA = .000001;

    @Test
    public void getRealPart() {
        ComplexNumber cn = new ComplexNumber(1.0,1.0);
        double realPart = cn.getRealPart();
        assertEquals(1.0, realPart, .0000001);
    }

    @Test
    public void setRealPart() {
    }

    @Test
    public void getImagPart() {
        ComplexNumber cn = new ComplexNumber(1.0,1.0);
        double imagPart = cn.getImagPart();
        assertEquals(1.0, imagPart, .0000001);
    }

    @Test
    public void setImagPart() {
    }

    @Test
    public void add() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        cn1.add(cn2);
        assertEquals( 10.5, cn1.getRealPart(), DELTA);
        assertEquals(7.0, cn1.getImagPart(), DELTA);

    }

    @Test
    public void add1() {
        ComplexNumber cn1 = new ComplexNumber(4.5, 3.0);
        ComplexNumber cn2 = new ComplexNumber(6.0, 4.0);
        ComplexNumber result =  ComplexNumber.add(cn1, cn2);
        assertEquals( 10.5, result.getRealPart(), DELTA);
        assertEquals(7.0, result.getImagPart(), DELTA);
    }

    @Test
    public void subt() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        ComplexNumber cn2 = new ComplexNumber(3.0, 3.0);
        cn1.subt(cn2);
        assertEquals( 3.0, cn1.getRealPart(), DELTA);
        assertEquals(1.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void sub() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        ComplexNumber cn2 = new ComplexNumber(3.0, 3.0);
        ComplexNumber result =  ComplexNumber.sub(cn1, cn2);
        assertEquals( 3.0, result.getRealPart(), DELTA);
        assertEquals(1.0, result.getImagPart(), DELTA);
    }

    @Test
    public void mult() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        ComplexNumber cn2 = new ComplexNumber(3.0, 3.0);
        cn1.mult(cn2);
        assertEquals( 18.0, cn1.getRealPart(), DELTA);
        assertEquals(12.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void mult1() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        ComplexNumber cn2 = new ComplexNumber(3.0, 3.0);
        ComplexNumber result =  ComplexNumber.mult(cn1, cn2);
        assertEquals( 18.0, cn1.getRealPart(), DELTA);
        assertEquals(12.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void div() throws FileNotFoundException {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        ComplexNumber cn2 = new ComplexNumber(3.0, 2.0);
        cn1.div(cn2);
        assertEquals( 2.0, cn1.getRealPart(), DELTA);
        assertEquals(2.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void div1() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        ComplexNumber cn2 = new ComplexNumber(3.0, 2.0);
        ComplexNumber result =  ComplexNumber.div(cn1, cn2);
        assertEquals( 2.0, cn1.getRealPart(), DELTA);
        assertEquals(2.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void conj() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        cn1.conj(cn1);
        assertEquals( 6.0, cn1.getRealPart(), DELTA);
        assertEquals(-4.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void conj1() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        ComplexNumber result =  ComplexNumber.conj(cn1, cn1);
        assertEquals( 6.0, cn1.getRealPart(), DELTA);
        assertEquals(-4.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void abs() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        cn1.abs(cn1);
        assertEquals( 6.0, cn1.getRealPart(), DELTA);
        assertEquals(4.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void abs1() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        ComplexNumber result =  ComplexNumber.conj(cn1, cn1);
        assertEquals( 6.0, cn1.getRealPart(), DELTA);
        assertEquals(4.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void complexNumber() {
    }

    @Test
    public void complexNumber1() {
    }

    @Test
    public void getRealPart1() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        cn1.getRealPart();
        assertEquals(6.0, cn1.getRealPart(), DELTA);
    }

    @Test
    public void getImagPart1() {
        ComplexNumber cn1 = new ComplexNumber(6.0, 4.0);
        cn1.getRealPart();
        assertEquals(4.0, cn1.getImagPart(), DELTA);
    }

    @Test
    public void setRealPart1() {
    }


    @Test
    public void setImagPart1() {
    }

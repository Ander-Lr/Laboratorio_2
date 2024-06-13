import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest{
    @Test
    public void TestDelete2Positions_1(){
        StringHelper helper = new StringHelper();
        assertEquals("CD", helper.Firts2Letters("CDAF"));
    }
    @Test
    public void TestDelete2Positions_2(){
        StringHelper helper = new StringHelper();
        assertEquals("CD", helper.Firts2Letters("ACDA"));
    }
    @Test
    public void TestDelete2Positions_3(){
        String current= new StringHelper().Firts2Letters("ACDA");
        assertEquals("DA",current);
    }
    @Test
    public void TestDelete2Positions_4(){
        String current= new StringHelper().Firts2Letters("ANDERSON");
        assertEquals("NDERSON",current);
    }

    @Test
    public void TestDelete2Positions_5(){
        String current= new StringHelper().Firts2Letters("LARA");
        String expected="SON";
        assertEquals(expected,current);
    }




    @Test
    public void TestFirstAndLastCaracters_EscenarioNeg_1() {
        StringHelper helper=new StringHelper();
        Boolean valueCurrent=helper.first2AndLast2Caracters("AB");
        assertFalse(valueCurrent);
    }
    @Test
    public void TestFirstAndLastCaracters_EscenarioNeg_2() {
        StringHelper helper=new StringHelper();
        Boolean valueCurrent=helper.first2AndLast2Caracters("A");
        assertFalse(valueCurrent);
    }
    @Test
    public void TestFirstAndLastCaracters_EscenarioNeg_3() {
        StringHelper helper=new StringHelper();
        Boolean valueCurrent=helper.first2AndLast2Caracters("Lara");
        assertFalse(valueCurrent);
    }
    @Test
    public void TestFirstAndLastCaracters_EscenarioNeg_4() {
        StringHelper helper=new StringHelper();
        Boolean valueCurrent=helper.first2AndLast2Caracters("xdxd");
        assertFalse(valueCurrent);
    }



    @Test
    public void TestFirstAndLastCaracters_EscenarioPosi_1() {
        StringHelper helper=new StringHelper();
        Boolean valueCurrent=helper.first2AndLast2Caracters("AB");
        assertTrue(valueCurrent);
    }
    @Test
    public void TestFirstAndLastCaracters_EscenarioPosi_2() {
        StringHelper helper=new StringHelper();
        Boolean valueCurrent=helper.first2AndLast2Caracters("A");
        assertTrue(valueCurrent);
    }
    @Test
    public void TestFirstAndLastCaracters_EscenarioPosi_3() {
        StringHelper helper=new StringHelper();
        Boolean valueCurrent=helper.first2AndLast2Caracters("Lara");
        assertTrue(valueCurrent);
    }
    @Test
    public void TestFirstAndLastCaracters_EscenarioPosi_4() {
        StringHelper helper=new StringHelper();
        Boolean valueCurrent=helper.first2AndLast2Caracters("xdxd");
        assertTrue(valueCurrent);
    }









}
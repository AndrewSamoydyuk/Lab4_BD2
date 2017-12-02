package testpackagelab4;

import mainpackagelab4.MainLab4;
import org.junit.Test;

import javax.xml.xquery.XQException;

import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void task3AisCorrect() throws  XQException {
        String expected = "[<title>Vehicula Foundation</title>, <title>Dolor Elit Consulting</title>, <title>Lobortis Nisi Nibh Consulting</title>, <title>Lacinia Vitae Sodales Company</title>, <title>Velit Sed LLC</title>, <title>Vitae Inc.</title>, <title>Proin Eget Odio Associates</title>, <title>Egestas Urna Institute</title>, <title>Libero Morbi Accumsan LLP</title>, <title>In Molestie Tortor Consulting</title>, <title>Pulvinar Arcu Consulting</title>, <title>Nunc LLP</title>, <title>Pretium Et Rutrum Corporation</title>, <title>Nisl Quisque Fringilla Corporation</title>, <title>Aptent Taciti Corporation</title>]";
        assertEquals(expected,MainLab4.task3a());
    }

    @Test
    public void task3BisCorrect() throws  XQException {
        String expected = "[Dalton X. Barton, Elton R. Walker, Gwendolyn O. Tyler, Jillian E. Webb, Lois A. Salas, Luke C. Bradley, Philip B. Porter, Rebekah C. Mcfarland, Trevor T. Pate]";
        assertEquals(expected,MainLab4.task3b());
    }

    @Test
    public void task3CisCorrect() throws  XQException {
        String expected = "[Action, Comedy, Drama, Poem, Sci-FI]";
        assertEquals(expected,MainLab4.task3c());
    }

    @Test
    public void task3DisCorrect() throws  XQException {
        String expected = "[Lugo, Luneburg, Metairie, Neunkirchen, Ogbomosho, Orleans, San Francisco, Santo Domingo, Siddi]";
        assertEquals(expected, MainLab4.task3d());
    }

    @Test
    public void task3EisCorrect() throws  XQException {
        String expected = "[<title>Proin Eget Odio Associates</title>, <title>Libero Morbi Accumsan LLP</title>, <title>In Molestie Tortor Consulting</title>, <title>Pulvinar Arcu Consulting</title>]";
        assertEquals(expected,MainLab4.task3e("Trevor T. Pate"));
    }

    @Test
    public void task3FisCorrect() throws  XQException {
        String expected = "[<title>Proin Eget Odio Associates</title>, <title>Egestas Urna Institute</title>, <title>In Molestie Tortor Consulting</title>]";
        assertEquals(expected,MainLab4.task3f("Pellentesque Habitant PC"));
    }

    @Test
    public void task3GisCorrect() throws  XQException {
        String expected = "[<title>Vitae Inc.</title>, <title>Egestas Urna Institute</title>, <title>Pulvinar Arcu Consulting</title>]";
        assertEquals(expected,MainLab4.task3g("Sci-FI"));
    }

    @Test
    public void task3HisCorrect() throws  XQException {
        String expected = "[<title>Pretium Et Rutrum Corporation</title>, <title>Vitae Inc.</title>]";
        assertEquals(expected,MainLab4.task3h(1920,1970));
    }

    @Test
    public void task3IisCorrect() throws  XQException {
        String expected = "[<title>Dolor Elit Consulting</title>, <title>Lacinia Vitae Sodales Company</title>]";
        assertEquals(expected,MainLab4.task3i(100,170));
    }

    @Test
    public void task3JisCorrect() throws  XQException {
        String expected = "[4]";
        assertEquals(expected,MainLab4.task3j("Trevor T. Pate"));
    }
    @Test
    public void task3KisCorrect() throws  XQException {
        String expected = "[8]";
        assertEquals(expected,MainLab4.task3k("solid"));
    }


}

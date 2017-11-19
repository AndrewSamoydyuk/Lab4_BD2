import org.junit.Test;

import javax.xml.xquery.XQException;

import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void task3AisCorrect() throws  XQException {
        String expected = "[<title>Vehicula Foundation</title>, <title>Dolor Elit Consulting</title>, <title>Lobortis Nisi Nibh Consulting</title>, <title>Lacinia Vitae Sodales Company</title>, <title>Velit Sed LLC</title>, <title>Vitae Inc.</title>, <title>Proin Eget Odio Associates</title>, <title>Egestas Urna Institute</title>, <title>Libero Morbi Accumsan LLP</title>, <title>In Molestie Tortor Consulting</title>, <title>Pulvinar Arcu Consulting</title>, <title>Nunc LLP</title>, <title>Pretium Et Rutrum Corporation</title>, <title>Nisl Quisque Fringilla Corporation</title>, <title>Aptent Taciti Corporation</title>]";
        assertEquals(expected,MainLab4.execute("for $x in doc(\"DB/books.xml\")/all_books/book return $x/title"));
    }

    @Test
    public void task3BisCorrect() throws  XQException {
        String expected = "[Dalton X. Barton, Elton R. Walker, Gwendolyn O. Tyler, Jillian E. Webb, Lois A. Salas, Luke C. Bradley, Philip B. Porter, Rebekah C. Mcfarland, Trevor T. Pate]";
        assertEquals(expected,MainLab4.execute("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/author) order by $x return $x"));
    }

    @Test
    public void task3CisCorrect() throws  XQException {
        String expected = "[Action, Comedy, Drama, Poem, Sci-FI]";
        assertEquals(expected,MainLab4.execute("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/genre) order by $x return $x"));
    }

    @Test
    public void task3DisCorrect() throws  XQException {
        String expected = "[Lugo, Luneburg, Metairie, Neunkirchen, Ogbomosho, Orleans, San Francisco, Santo Domingo, Siddi]";
        assertEquals(expected,MainLab4.execute("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/city) order by $x return $x"));
    }

    @Test
    public void task3EisCorrect() throws  XQException {
        String expected = "[<title>Proin Eget Odio Associates</title>, <title>Libero Morbi Accumsan LLP</title>, <title>In Molestie Tortor Consulting</title>, <title>Pulvinar Arcu Consulting</title>]";
        assertEquals(expected,MainLab4.execute("for $x in doc(\"DB/books.xml\")/all_books/book where $x/author = \"Trevor T. Pate\" return $x/title"));
    }

    @Test
    public void task3FisCorrect() throws  XQException {
        String expected = "[<title>Proin Eget Odio Associates</title>, <title>Egestas Urna Institute</title>, <title>In Molestie Tortor Consulting</title>]";
        assertEquals(expected,MainLab4.execute("for $x in doc(\"DB/books.xml\")/all_books/book where $x/publisher = \"Pellentesque Habitant PC\" return $x/title"));
    }

    @Test
    public void task3GisCorrect() throws  XQException {
        String expected = "[<title>Vitae Inc.</title>, <title>Egestas Urna Institute</title>, <title>Pulvinar Arcu Consulting</title>]";
        assertEquals(expected,MainLab4.execute("for $x in doc(\"DB/books.xml\")/all_books/book where $x/genre = \"Sci-FI\" return $x/title"));
    }

    @Test
    public void task3HisCorrect() throws  XQException {
        String expected = "[<title>Pretium Et Rutrum Corporation</title>, <title>Vitae Inc.</title>]";
        assertEquals(expected,MainLab4.execute("for $x in doc(\"DB/books.xml\")/all_books/book where $x/year > 1920 and $x/year < 1970 order by $x/year return $x/title"));
    }

    @Test
    public void task3IisCorrect() throws  XQException {
        String expected = "[<title>Dolor Elit Consulting</title>, <title>Lacinia Vitae Sodales Company</title>]";
        assertEquals(expected,MainLab4.execute("for $x in doc(\"DB/books.xml\")/all_books/book where $x/price > 100 and $x/price < 170 order by $x/price return $x/title"));
    }

    @Test
    public void task3JisCorrect() throws  XQException {
        String expected = "[940]";
        assertEquals(expected,MainLab4.execute("let $items := 0 return sum(for $x in doc(\"DB/books.xml\")/all_books/book where $x/author=\"Trevor T. Pate\" return $x/price)"));
    }

    @Test
    public void task3KisCorrect() throws  XQException {
        String expected = "[8]";
        assertEquals(expected,MainLab4.execute("let $items := 0 return count(for $x in doc(\"DB/books.xml\")/all_books/book where $x/cover=\"solid\" return $x/cover)"));
    }

}

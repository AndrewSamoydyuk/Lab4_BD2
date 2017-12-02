package mainpackagelab4;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import net.sf.saxon.xqj.SaxonXQDataSource;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.*;

public class MainLab4 {

    public static void main(String[] args) throws XQException, FileNotFoundException {

        System.out.println(task3a());
//        task3b();
//        task3c();
//        task3d();
//        //3_d_2
//        //System.out.printf(test.execute("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/publisher) order by $x return $x"));
//        task3e();
//        task3f();
//        task3g();
//        task3h();
//        task3i();
//        task3j();
//        //3_j_2
//        //System.out.println(test.execute("let $items := 0 return sum(for $x in doc(\"DB/books.xml\")/all_books/book where $x/author=\"Trevor T. Pate\" return $x/price)"));
//        task3k();
//        //3_k_2
//        //System.out.println(test.execute("let $items := 0 return count(for $x in doc(\"DB/books.xml\")/all_books/book where $x/cover=\"soft\" return $x/cover)"));

    }


    public static String getData(String query) throws XQException {
        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression(query);
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public static String task3a() throws XQException {
        String query = "for $x in doc(\"DB/books.xml\")/all_books/book return $x/title";
        return getData(query);
    }

    public static String task3b() throws XQException {
        String query = "for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/author) order by $x return $x";
        return getData(query);
    }

    public static String task3c() throws XQException {
        String query = "for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/genre) order by $x return $x";
        return getData(query);
    }

    public static String task3d() throws XQException {
        String query = "for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/city) order by $x return $x";
        return getData(query);
    }

    public static String task3e(String author) throws XQException {
        String query = "for $x in doc(\"DB/books.xml\")/all_books/book where $x/author = \""+author+"\" return $x/title";
        return getData(query);
    }

    public static String task3f(String publisher) throws XQException {
        String query = "for $x in doc(\"DB/books.xml\")/all_books/book where $x/publisher = \""+publisher+"\" return $x/title";
        return getData(query);
    }

    public static String task3g(String genre) throws XQException {
        String query = "for $x in doc(\"DB/books.xml\")/all_books/book where $x/genre = \""+genre+"\" return $x/title";
        return getData(query);
    }

    public static String task3h(int from, int to) throws XQException {
        String query = "for $x in doc(\"DB/books.xml\")/all_books/book where $x/year > "+from+" and $x/year < "+to+" order by $x/year return $x/title";
        return getData(query);
    }

    public static String task3i(int priceFrom, int priceTo) throws XQException {
        String query = "for $x in doc(\"DB/books.xml\")/all_books/book where $x/price > "+priceFrom+" and $x/price < "+priceTo+" order by $x/price return $x/title";
        return getData(query);
    }

    public static String task3j(String author) throws XQException {
        String query = "let $items := 0 return count(for $x in doc(\"DB/books.xml\")/all_books/book where $x/author=\""+author+"\" return $x/author)";
        return getData(query);
    }

    public static String task3k(String cover) throws XQException {
        String query = "let $items := 0 return count(for $x in doc(\"DB/books.xml\")/all_books/book where $x/cover=\""+cover+"\" return $x/cover)";
        return getData(query);
    }

}

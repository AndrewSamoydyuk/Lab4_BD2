package mainpackagelab4;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import net.sf.saxon.xqj.SaxonXQDataSource;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.*;

public class MainLab4 {

    private XQDataSource ds ;
    private XQConnection conn ;

    public MainLab4() throws XQException {
        ds = new SaxonXQDataSource();
        conn = ds.getConnection();
    }
    public static void main(String[] args) throws XQException, FileNotFoundException {

        mainpackagelab4.MainLab4 test = new mainpackagelab4.MainLab4();
        //3_a
        //System.out.printf(test.execute("for $x in doc(\"DB/books.xml\")/all_books/book return $x"));
        //3_b
        //System.out.printf(test.execute("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/author) order by $x return $x"));
        //3_c
        //System.out.printf(test.execute("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/genre) order by $x return $x"));
        //3_d_1
        //System.out.printf(test.execute("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/city) order by $x return $x"));
        //3_d_2
        //System.out.printf(test.task3d2());
        //3_e
        //System.out.printf(test.execute("for $x in doc(\"DB/books.xml\")/all_books/book where $x/author = \"Trevor T. Pate\" return $x"));
        //3_f
        //System.out.printf(test.execute("for $x in doc(\"DB/books.xml\")/all_books/book where $x/publisher = \"Pellentesque Habitant PC\" return $x"));
        //3_g
        //System.out.printf(test.execute("for $x in doc(\"DB/books.xml\")/all_books/book where $x/genre = \"Sci-FI\" return $x"));
        //3_h
        //System.out.println(test.execute("for $x in doc(\"DB/books.xml\")/all_books/book where $x/year > 1920 and $x/year < 1970 order by $x/year return $x"));
        //3_i
        //System.out.println(test.execute("for $x in doc(\"DB/books.xml\")/all_books/book where $x/price > 100 and $x/price < 170 order by $x/price return $x/title"));
        //3_j_1
        //System.out.println(test.execute("let $items := 0 return count(for $x in doc(\"DB/books.xml\")/all_books/book where $x/author=\"Trevor T. Pate\" return $x/author)"));
        //3_j_2
        //System.out.println(test.execute("let $items := 0 return sum(for $x in doc(\"DB/books.xml\")/all_books/book where $x/author=\"Trevor T. Pate\" return $x/price)"));
        //3_k_1
        System.out.println(test.task3k1());
        //3_k_2
        //System.out.println(test.execute("let $items := 0 return count(for $x in doc(\"DB/books.xml\")/all_books/book where $x/cover=\"soft\" return $x/cover)"));

    }

    public  String task3a() throws XQException {

            List<String> res = new ArrayList<>();
            XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book return $x/title");
            XQResultSequence result = exp.executeQuery();

            while (result.next()) {
                res.add(result.getItemAsString(null));
            }
            return res.toString();
    }

    public  String task3b() throws XQException {

        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/author) order by $x return $x");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public  String task3c() throws XQException {

        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/genre) order by $x return $x");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public  String task3d1() throws XQException {

        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/city) order by $x return $x");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public  String task3e() throws XQException {

        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book where $x/author = \"Trevor T. Pate\" return $x/title");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public  String task3f() throws XQException {

        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book where $x/publisher = \"Pellentesque Habitant PC\" return $x/title");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public  String task3g() throws XQException {

        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book where $x/genre = \"Sci-FI\" return $x/title");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public  String task3h() throws XQException {

        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book where $x/year > 1920 and $x/year < 1970 order by $x/year return $x/title");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public  String task3i() throws XQException {

        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book where $x/price > 100 and $x/price < 170 order by $x/price return $x/title");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public  String task3j1() throws XQException {

        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("let $items := 0 return sum(for $x in doc(\"DB/books.xml\")/all_books/book where $x/author=\"Trevor T. Pate\" return $x/price)");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public  String task3k1() throws XQException {

        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("let $items := 0 return count(for $x in doc(\"DB/books.xml\")/all_books/book where $x/cover=\"solid\" return $x/cover)");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }


 }

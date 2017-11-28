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

    public static String task3a() throws XQException {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book return $x/title");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public static String task3b() throws XQException {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/author) order by $x return $x");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public static String task3c() throws XQException {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/genre) order by $x return $x");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public static String task3d() throws XQException {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in distinct-values(doc(\"DB/books.xml\")/all_books/book/city) order by $x return $x");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public static String task3e() throws XQException {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book where $x/author = \"Trevor T. Pate\" return $x/title");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public static String task3f() throws XQException {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book where $x/publisher = \"Pellentesque Habitant PC\" return $x/title");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public static String task3g() throws XQException {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book where $x/genre = \"Sci-FI\" return $x/title");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public static String task3h() throws XQException {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book where $x/year > 1920 and $x/year < 1970 order by $x/year return $x/title");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public static String task3i() throws XQException {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("for $x in doc(\"DB/books.xml\")/all_books/book where $x/price > 100 and $x/price < 170 order by $x/price return $x/title");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public static String task3j() throws XQException {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("let $items := 0 return count(for $x in doc(\"DB/books.xml\")/all_books/book where $x/author=\"Trevor T. Pate\" return $x/author)");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

    public static String task3k() throws XQException {

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();
        List<String> res = new ArrayList<>();
        XQPreparedExpression exp = conn.prepareExpression("let $items := 0 return count(for $x in doc(\"DB/books.xml\")/all_books/book where $x/cover=\"solid\" return $x/cover)");
        XQResultSequence result = exp.executeQuery();

        while (result.next()) {
            res.add(result.getItemAsString(null));
        }
        return res.toString();
    }

 }

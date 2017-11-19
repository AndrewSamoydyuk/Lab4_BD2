import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import net.sf.saxon.xqj.SaxonXQDataSource;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.*;

public class MainLab4 {

    public static void main(String[] args) throws XQException, FileNotFoundException {
        
    }

    public static String execute(String query) throws XQException {

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
 }

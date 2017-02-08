package credit;

import credit.creditreport.CreditQuery;
import credit.creditreport.CreditReport;
import credit.creditreport.CreditReportPortType;
import credit.creditreport.Service1;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by pyoung on 2017-02-06.
 */
public class Client {
    public static void main(String[] args) {


        URL url = null;
        try {
            url = new URL("http://localhost:9999/CreditReport");

            //1st argument service URI, refer to wsdl document above
            //2nd argument is service name, refer to wsdl document above
            QName qname = new QName("http://credit/", "CreditReportTypeImplService");

            Service service = Service.create(url, qname);

            CreditReportPortType server = service.getPort(CreditReportPortType.class);

            CreditQuery q = new CreditQuery();
            q.setFirstName("Patrick");
            q.setLastName("Young");
            q.setSsn("123-45-1234");

            CreditReport r = server.creditReportOperation(q);

            System.out.println(r.getFirstName());
            System.out.println(r.getLastName());
            System.out.println(r.getCity());
            System.out.println(r.getCountry());
            System.out.println(r.getCurrency());
            System.out.println(r.getDob());
            System.out.println(r.getImmovableAssests());
            System.out.println(r.getLatestAddress1());
            System.out.println(r.getLatestAddress2());
            System.out.println(r.getLiability());
            System.out.println(r.getLiquidAssests());
            System.out.println(r.getPostalCode());
            System.out.println(r.getScore());
            System.out.println(r.getState());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

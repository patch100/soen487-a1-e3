package credit;

import javax.xml.ws.Endpoint;

/**
 * Created by pyoung on 2017-02-08.
 */
public class CreditReportEndpointPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/CreditReport", new CreditReportTypeImpl());
    }
}

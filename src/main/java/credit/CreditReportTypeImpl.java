package credit;

import credit.creditreport.CreditQuery;
import credit.creditreport.CreditReport;
import credit.creditreport.CreditReportPortType;

import javax.jws.WebService;
import java.math.BigInteger;

/**
 * Created by pyoung on 2017-02-07.
 */
@WebService(endpointInterface = "credit.creditreport.CreditReportPortType")
public class CreditReportTypeImpl implements CreditReportPortType {

    @Override
    public CreditReport creditReportOperation(CreditQuery someGuy) {
        CreditReport r = new CreditReport();
        r.setFirstName(someGuy.getFirstName());
        r.setLastName(someGuy.getLastName());
        r.setCity("Montreal");
        r.setCountry("Canada");
        r.setCurrency("CDN");
        r.setDob("1992/05/20");
        r.setImmovableAssests(BigInteger.valueOf(10000000));
        r.setLatestAddress1("300 Rue Desauts");
        r.setLatestAddress2("None");
        r.setLiability(BigInteger.valueOf(1000));
        r.setLiquidAssests(BigInteger.valueOf(10000000));
        r.setPostalCode("HHH 343");
        r.setScore("100");
        r.setState("QC");

        return r;
    }
}

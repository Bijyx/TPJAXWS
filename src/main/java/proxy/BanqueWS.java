
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "BanqueWS", targetNamespace = "http://JAXWS/", wsdlLocation = "http://localhost:9191/CompteService?wsdl")
public class BanqueWS
    extends Service
{

    private final static URL BANQUEWS_WSDL_LOCATION;
    private final static WebServiceException BANQUEWS_EXCEPTION;
    private final static QName BANQUEWS_QNAME = new QName("http://JAXWS/", "BanqueWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9191/CompteService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANQUEWS_WSDL_LOCATION = url;
        BANQUEWS_EXCEPTION = e;
    }

    public BanqueWS() {
        super(__getWsdlLocation(), BANQUEWS_QNAME);
    }

    public BanqueWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANQUEWS_QNAME, features);
    }

    public BanqueWS(URL wsdlLocation) {
        super(wsdlLocation, BANQUEWS_QNAME);
    }

    public BanqueWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANQUEWS_QNAME, features);
    }

    public BanqueWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BanqueWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CompteService
     */
    @WebEndpoint(name = "CompteServicePort")
    public CompteService getCompteServicePort() {
        return super.getPort(new QName("http://JAXWS/", "CompteServicePort"), CompteService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompteService
     */
    @WebEndpoint(name = "CompteServicePort")
    public CompteService getCompteServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://JAXWS/", "CompteServicePort"), CompteService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANQUEWS_EXCEPTION!= null) {
            throw BANQUEWS_EXCEPTION;
        }
        return BANQUEWS_WSDL_LOCATION;
    }

}

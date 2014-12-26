
package com.hascode.tutorial.ws.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BookService", targetNamespace = "http://www.hascode.com/bookService/1.0", wsdlLocation = "file:/Users/cmok/Documents/workspace_eclipse/ws/src/main/resources/wsdl/bookService.wsdl")
public class BookService
    extends Service
{

    private final static URL BOOKSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.hascode.tutorial.ws.service.BookService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.hascode.tutorial.ws.service.BookService.class.getResource(".");
            url = new URL(baseUrl, "file:/Users/cmok/Documents/workspace_eclipse/ws/src/main/resources/wsdl/bookService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/Users/cmok/Documents/workspace_eclipse/ws/src/main/resources/wsdl/bookService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BOOKSERVICE_WSDL_LOCATION = url;
    }

    public BookService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookService() {
        super(BOOKSERVICE_WSDL_LOCATION, new QName("http://www.hascode.com/bookService/1.0", "BookService"));
    }

    /**
     * 
     * @return
     *     returns BookServicePortType
     */
    @WebEndpoint(name = "BookServicePort")
    public BookServicePortType getBookServicePort() {
        return super.getPort(new QName("http://www.hascode.com/bookService/1.0", "BookServicePort"), BookServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BookServicePortType
     */
    @WebEndpoint(name = "BookServicePort")
    public BookServicePortType getBookServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.hascode.com/bookService/1.0", "BookServicePort"), BookServicePortType.class, features);
    }

}

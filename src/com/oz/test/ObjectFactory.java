
package com.oz.test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.zzzl.webservice.qidian package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OperationService_QNAME = new QName("http://service.ssh_cxf.com/", "operationService");
    private final static QName _OperationServiceResponse_QNAME = new QName("http://service.ssh_cxf.com/", "operationServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.zzzl.webservice.qidian
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OperationService }
     * 
     */
    public OperationService createOperationService() {
        return new OperationService();
    }

    /**
     * Create an instance of {@link OperationServiceResponse }
     * 
     */
    public OperationServiceResponse createOperationServiceResponse() {
        return new OperationServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ssh_cxf.com/", name = "operationService")
    public JAXBElement<OperationService> createOperationService(OperationService value) {
        return new JAXBElement<OperationService>(_OperationService_QNAME, OperationService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.ssh_cxf.com/", name = "operationServiceResponse")
    public JAXBElement<OperationServiceResponse> createOperationServiceResponse(OperationServiceResponse value) {
        return new JAXBElement<OperationServiceResponse>(_OperationServiceResponse_QNAME, OperationServiceResponse.class, null, value);
    }

}

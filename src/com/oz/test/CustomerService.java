package com.oz.test;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.0
 * 2015-05-21T12:54:17.375+08:00
 * Generated source version: 3.1.0
 * 
 */
@WebService(targetNamespace = "http://service.ssh_cxf.com/", name = "CustomerService")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerService {

    @WebMethod
    @RequestWrapper(localName = "operationService", targetNamespace = "http://service.ssh_cxf.com/", className = "com.oz.test.OperationService")
    @ResponseWrapper(localName = "operationServiceResponse", targetNamespace = "http://service.ssh_cxf.com/", className = "com.oz.test.OperationServiceResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String operationService(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}

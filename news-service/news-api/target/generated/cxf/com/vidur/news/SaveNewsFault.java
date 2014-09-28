
package com.vidur.news;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0.redhat-610379
 * 2014-09-13T09:56:08.116+01:00
 * Generated source version: 2.7.0.redhat-610379
 */

@WebFault(name = "faultDetail", targetNamespace = "http://vidur.com/news/model")
public class SaveNewsFault extends Exception {
    
    private com.vidur.news.model.FaultDetail faultDetail;

    public SaveNewsFault() {
        super();
    }
    
    public SaveNewsFault(String message) {
        super(message);
    }
    
    public SaveNewsFault(String message, Throwable cause) {
        super(message, cause);
    }

    public SaveNewsFault(String message, com.vidur.news.model.FaultDetail faultDetail) {
        super(message);
        this.faultDetail = faultDetail;
    }

    public SaveNewsFault(String message, com.vidur.news.model.FaultDetail faultDetail, Throwable cause) {
        super(message, cause);
        this.faultDetail = faultDetail;
    }

    public com.vidur.news.model.FaultDetail getFaultInfo() {
        return this.faultDetail;
    }
}

package com.microsoft.bingads.v13.campaignmanagement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImportJobs" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfImportJob" minOccurs="0"/>
 *         &lt;element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "importJobs",
    "partialErrors"
})
@XmlRootElement(name = "GetImportJobsByIdsResponse")
public class GetImportJobsByIdsResponse {

    @XmlElement(name = "ImportJobs", nillable = true)
    protected ArrayOfImportJob importJobs;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the importJobs property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfImportJob }
     *     
     */
    public ArrayOfImportJob getImportJobs() {
        return importJobs;
    }

    /**
     * Sets the value of the importJobs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfImportJob }
     *     
     */
    public void setImportJobs(ArrayOfImportJob value) {
        this.importJobs = value;
    }

    /**
     * Gets the value of the partialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public ArrayOfBatchError getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the value of the partialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public void setPartialErrors(ArrayOfBatchError value) {
        this.partialErrors = value;
    }

}

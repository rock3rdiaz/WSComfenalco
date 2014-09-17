
package com.wscomfenalco.ws_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getDetailStatisticsByFovis complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getDetailStatisticsByFovis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nitCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="section" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDetailStatisticsByFovis", propOrder = {
    "nitCompany",
    "year",
    "section"
})
public class GetDetailStatisticsByFovis {

    protected String nitCompany;
    protected String year;
    protected int section;

    /**
     * Obtiene el valor de la propiedad nitCompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNitCompany() {
        return nitCompany;
    }

    /**
     * Define el valor de la propiedad nitCompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNitCompany(String value) {
        this.nitCompany = value;
    }

    /**
     * Obtiene el valor de la propiedad year.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Define el valor de la propiedad year.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Obtiene el valor de la propiedad section.
     * 
     */
    public int getSection() {
        return section;
    }

    /**
     * Define el valor de la propiedad section.
     * 
     */
    public void setSection(int value) {
        this.section = value;
    }

}

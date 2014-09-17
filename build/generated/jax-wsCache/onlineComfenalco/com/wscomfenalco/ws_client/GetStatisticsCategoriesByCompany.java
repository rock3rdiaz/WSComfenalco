
package com.wscomfenalco.ws_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getStatisticsCategoriesByCompany complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getStatisticsCategoriesByCompany">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nitCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatisticsCategoriesByCompany", propOrder = {
    "nitCompany"
})
public class GetStatisticsCategoriesByCompany {

    protected String nitCompany;

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

}

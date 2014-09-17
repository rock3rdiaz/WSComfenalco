
package com.wscomfenalco.ws_client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para changePassword complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="changePassword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPass1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPass2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changePassword", propOrder = {
    "currentPass",
    "newPass1",
    "newPass2"
})
public class ChangePassword {

    protected String currentPass;
    protected String newPass1;
    protected String newPass2;

    /**
     * Obtiene el valor de la propiedad currentPass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPass() {
        return currentPass;
    }

    /**
     * Define el valor de la propiedad currentPass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPass(String value) {
        this.currentPass = value;
    }

    /**
     * Obtiene el valor de la propiedad newPass1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPass1() {
        return newPass1;
    }

    /**
     * Define el valor de la propiedad newPass1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPass1(String value) {
        this.newPass1 = value;
    }

    /**
     * Obtiene el valor de la propiedad newPass2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPass2() {
        return newPass2;
    }

    /**
     * Define el valor de la propiedad newPass2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPass2(String value) {
        this.newPass2 = value;
    }

}

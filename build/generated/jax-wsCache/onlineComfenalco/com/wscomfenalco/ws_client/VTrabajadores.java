
package com.wscomfenalco.ws_client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para vTrabajadores complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="vTrabajadores">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anoMesBloqueo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellido1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apellido2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="areasectortrb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consenovedtra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyTrbCtvo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nivelsectortrb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="s1trbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salarioNumerico" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sigloPrest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="strbr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sumaSalario" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TFret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tfactualcaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tfechafinfideli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tfechainifideli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tfechgrabanov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tfechingcaja" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tfechretiempre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trb1ape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trb2ape" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbAjusteCr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbAjusteDb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbBarrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbCuentaTra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbCuota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbCuotasDb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbDireNueva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbDireccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbDpto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbEdad" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="trbEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbEsCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbFechaGraba" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbFechaIerSub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbFechaIngresos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbFechaNac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbIdentSub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbImprimioCarnet" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="trbIndEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbIndPlanHosp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbIndRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbIndSubsidio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbLugarNac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbNombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbNovedTra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbNroCuotas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbSalario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbSaldo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbSecHabita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbSector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbServicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbSexo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbSubsidioEsp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbTeleNuevo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbTelefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trbValorPrest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vTrabajadores", propOrder = {
    "anoMesBloqueo",
    "apellido1",
    "apellido2",
    "areasectortrb",
    "categoria",
    "consenovedtra",
    "identificacion",
    "keyTrbCtvo",
    "nivelsectortrb",
    "nombre",
    "nombre1",
    "nombre2",
    "s1Trbr",
    "salarioNumerico",
    "sigloPrest",
    "strbr",
    "sumaSalario",
    "tFret",
    "tfactualcaja",
    "tfechafinfideli",
    "tfechainifideli",
    "tfechgrabanov",
    "tfechingcaja",
    "tfechretiempre",
    "trb1Ape",
    "trb2Ape",
    "trbAjusteCr",
    "trbAjusteDb",
    "trbBarrio",
    "trbCiudad",
    "trbCodigo",
    "trbCuentaTra",
    "trbCuota",
    "trbCuotasDb",
    "trbDireNueva",
    "trbDireccion",
    "trbDpto",
    "trbEdad",
    "trbEmpresa",
    "trbEsCivil",
    "trbEstado",
    "trbFechaGraba",
    "trbFechaIerSub",
    "trbFechaIngresos",
    "trbFechaNac",
    "trbIdentSub",
    "trbIdentificacion",
    "trbImprimioCarnet",
    "trbIndEstado",
    "trbIndPlanHosp",
    "trbIndRegistro",
    "trbIndSubsidio",
    "trbLugarNac",
    "trbNombre",
    "trbNombres",
    "trbNovedTra",
    "trbNroCuotas",
    "trbSalario",
    "trbSaldo",
    "trbSecHabita",
    "trbSector",
    "trbServicio",
    "trbSexo",
    "trbSubsidioEsp",
    "trbTeleNuevo",
    "trbTelefono",
    "trbValorPrest"
})
public class VTrabajadores {

    protected String anoMesBloqueo;
    protected String apellido1;
    protected String apellido2;
    protected String areasectortrb;
    protected String categoria;
    protected String consenovedtra;
    protected String identificacion;
    protected String keyTrbCtvo;
    protected String nivelsectortrb;
    protected String nombre;
    protected String nombre1;
    protected String nombre2;
    @XmlElement(name = "s1trbr")
    protected String s1Trbr;
    protected Long salarioNumerico;
    protected String sigloPrest;
    protected String strbr;
    protected BigDecimal sumaSalario;
    @XmlElement(name = "TFret")
    protected String tFret;
    protected String tfactualcaja;
    protected String tfechafinfideli;
    protected String tfechainifideli;
    protected String tfechgrabanov;
    protected String tfechingcaja;
    protected String tfechretiempre;
    @XmlElement(name = "trb1ape")
    protected String trb1Ape;
    @XmlElement(name = "trb2ape")
    protected String trb2Ape;
    protected String trbAjusteCr;
    protected String trbAjusteDb;
    protected String trbBarrio;
    protected String trbCiudad;
    protected String trbCodigo;
    protected String trbCuentaTra;
    protected String trbCuota;
    protected String trbCuotasDb;
    protected String trbDireNueva;
    protected String trbDireccion;
    protected String trbDpto;
    protected Double trbEdad;
    protected String trbEmpresa;
    protected String trbEsCivil;
    protected String trbEstado;
    protected String trbFechaGraba;
    protected String trbFechaIerSub;
    protected String trbFechaIngresos;
    protected String trbFechaNac;
    protected String trbIdentSub;
    protected String trbIdentificacion;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer trbImprimioCarnet;
    protected String trbIndEstado;
    protected String trbIndPlanHosp;
    protected String trbIndRegistro;
    protected String trbIndSubsidio;
    protected String trbLugarNac;
    protected String trbNombre;
    protected String trbNombres;
    protected String trbNovedTra;
    protected String trbNroCuotas;
    protected String trbSalario;
    protected String trbSaldo;
    protected String trbSecHabita;
    protected String trbSector;
    protected String trbServicio;
    protected String trbSexo;
    protected String trbSubsidioEsp;
    protected String trbTeleNuevo;
    protected String trbTelefono;
    protected String trbValorPrest;

    /**
     * Obtiene el valor de la propiedad anoMesBloqueo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoMesBloqueo() {
        return anoMesBloqueo;
    }

    /**
     * Define el valor de la propiedad anoMesBloqueo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoMesBloqueo(String value) {
        this.anoMesBloqueo = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Define el valor de la propiedad apellido1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido1(String value) {
        this.apellido1 = value;
    }

    /**
     * Obtiene el valor de la propiedad apellido2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Define el valor de la propiedad apellido2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido2(String value) {
        this.apellido2 = value;
    }

    /**
     * Obtiene el valor de la propiedad areasectortrb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreasectortrb() {
        return areasectortrb;
    }

    /**
     * Define el valor de la propiedad areasectortrb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreasectortrb(String value) {
        this.areasectortrb = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad consenovedtra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsenovedtra() {
        return consenovedtra;
    }

    /**
     * Define el valor de la propiedad consenovedtra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsenovedtra(String value) {
        this.consenovedtra = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Define el valor de la propiedad identificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad keyTrbCtvo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyTrbCtvo() {
        return keyTrbCtvo;
    }

    /**
     * Define el valor de la propiedad keyTrbCtvo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyTrbCtvo(String value) {
        this.keyTrbCtvo = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelsectortrb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelsectortrb() {
        return nivelsectortrb;
    }

    /**
     * Define el valor de la propiedad nivelsectortrb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelsectortrb(String value) {
        this.nivelsectortrb = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre1() {
        return nombre1;
    }

    /**
     * Define el valor de la propiedad nombre1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre1(String value) {
        this.nombre1 = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre2() {
        return nombre2;
    }

    /**
     * Define el valor de la propiedad nombre2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre2(String value) {
        this.nombre2 = value;
    }

    /**
     * Obtiene el valor de la propiedad s1Trbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getS1Trbr() {
        return s1Trbr;
    }

    /**
     * Define el valor de la propiedad s1Trbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setS1Trbr(String value) {
        this.s1Trbr = value;
    }

    /**
     * Obtiene el valor de la propiedad salarioNumerico.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSalarioNumerico() {
        return salarioNumerico;
    }

    /**
     * Define el valor de la propiedad salarioNumerico.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSalarioNumerico(Long value) {
        this.salarioNumerico = value;
    }

    /**
     * Obtiene el valor de la propiedad sigloPrest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigloPrest() {
        return sigloPrest;
    }

    /**
     * Define el valor de la propiedad sigloPrest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigloPrest(String value) {
        this.sigloPrest = value;
    }

    /**
     * Obtiene el valor de la propiedad strbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrbr() {
        return strbr;
    }

    /**
     * Define el valor de la propiedad strbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrbr(String value) {
        this.strbr = value;
    }

    /**
     * Obtiene el valor de la propiedad sumaSalario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSumaSalario() {
        return sumaSalario;
    }

    /**
     * Define el valor de la propiedad sumaSalario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSumaSalario(BigDecimal value) {
        this.sumaSalario = value;
    }

    /**
     * Obtiene el valor de la propiedad tFret.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTFret() {
        return tFret;
    }

    /**
     * Define el valor de la propiedad tFret.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTFret(String value) {
        this.tFret = value;
    }

    /**
     * Obtiene el valor de la propiedad tfactualcaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTfactualcaja() {
        return tfactualcaja;
    }

    /**
     * Define el valor de la propiedad tfactualcaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTfactualcaja(String value) {
        this.tfactualcaja = value;
    }

    /**
     * Obtiene el valor de la propiedad tfechafinfideli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTfechafinfideli() {
        return tfechafinfideli;
    }

    /**
     * Define el valor de la propiedad tfechafinfideli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTfechafinfideli(String value) {
        this.tfechafinfideli = value;
    }

    /**
     * Obtiene el valor de la propiedad tfechainifideli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTfechainifideli() {
        return tfechainifideli;
    }

    /**
     * Define el valor de la propiedad tfechainifideli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTfechainifideli(String value) {
        this.tfechainifideli = value;
    }

    /**
     * Obtiene el valor de la propiedad tfechgrabanov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTfechgrabanov() {
        return tfechgrabanov;
    }

    /**
     * Define el valor de la propiedad tfechgrabanov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTfechgrabanov(String value) {
        this.tfechgrabanov = value;
    }

    /**
     * Obtiene el valor de la propiedad tfechingcaja.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTfechingcaja() {
        return tfechingcaja;
    }

    /**
     * Define el valor de la propiedad tfechingcaja.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTfechingcaja(String value) {
        this.tfechingcaja = value;
    }

    /**
     * Obtiene el valor de la propiedad tfechretiempre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTfechretiempre() {
        return tfechretiempre;
    }

    /**
     * Define el valor de la propiedad tfechretiempre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTfechretiempre(String value) {
        this.tfechretiempre = value;
    }

    /**
     * Obtiene el valor de la propiedad trb1Ape.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrb1Ape() {
        return trb1Ape;
    }

    /**
     * Define el valor de la propiedad trb1Ape.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrb1Ape(String value) {
        this.trb1Ape = value;
    }

    /**
     * Obtiene el valor de la propiedad trb2Ape.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrb2Ape() {
        return trb2Ape;
    }

    /**
     * Define el valor de la propiedad trb2Ape.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrb2Ape(String value) {
        this.trb2Ape = value;
    }

    /**
     * Obtiene el valor de la propiedad trbAjusteCr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbAjusteCr() {
        return trbAjusteCr;
    }

    /**
     * Define el valor de la propiedad trbAjusteCr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbAjusteCr(String value) {
        this.trbAjusteCr = value;
    }

    /**
     * Obtiene el valor de la propiedad trbAjusteDb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbAjusteDb() {
        return trbAjusteDb;
    }

    /**
     * Define el valor de la propiedad trbAjusteDb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbAjusteDb(String value) {
        this.trbAjusteDb = value;
    }

    /**
     * Obtiene el valor de la propiedad trbBarrio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbBarrio() {
        return trbBarrio;
    }

    /**
     * Define el valor de la propiedad trbBarrio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbBarrio(String value) {
        this.trbBarrio = value;
    }

    /**
     * Obtiene el valor de la propiedad trbCiudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbCiudad() {
        return trbCiudad;
    }

    /**
     * Define el valor de la propiedad trbCiudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbCiudad(String value) {
        this.trbCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad trbCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbCodigo() {
        return trbCodigo;
    }

    /**
     * Define el valor de la propiedad trbCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbCodigo(String value) {
        this.trbCodigo = value;
    }

    /**
     * Obtiene el valor de la propiedad trbCuentaTra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbCuentaTra() {
        return trbCuentaTra;
    }

    /**
     * Define el valor de la propiedad trbCuentaTra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbCuentaTra(String value) {
        this.trbCuentaTra = value;
    }

    /**
     * Obtiene el valor de la propiedad trbCuota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbCuota() {
        return trbCuota;
    }

    /**
     * Define el valor de la propiedad trbCuota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbCuota(String value) {
        this.trbCuota = value;
    }

    /**
     * Obtiene el valor de la propiedad trbCuotasDb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbCuotasDb() {
        return trbCuotasDb;
    }

    /**
     * Define el valor de la propiedad trbCuotasDb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbCuotasDb(String value) {
        this.trbCuotasDb = value;
    }

    /**
     * Obtiene el valor de la propiedad trbDireNueva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbDireNueva() {
        return trbDireNueva;
    }

    /**
     * Define el valor de la propiedad trbDireNueva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbDireNueva(String value) {
        this.trbDireNueva = value;
    }

    /**
     * Obtiene el valor de la propiedad trbDireccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbDireccion() {
        return trbDireccion;
    }

    /**
     * Define el valor de la propiedad trbDireccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbDireccion(String value) {
        this.trbDireccion = value;
    }

    /**
     * Obtiene el valor de la propiedad trbDpto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbDpto() {
        return trbDpto;
    }

    /**
     * Define el valor de la propiedad trbDpto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbDpto(String value) {
        this.trbDpto = value;
    }

    /**
     * Obtiene el valor de la propiedad trbEdad.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTrbEdad() {
        return trbEdad;
    }

    /**
     * Define el valor de la propiedad trbEdad.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTrbEdad(Double value) {
        this.trbEdad = value;
    }

    /**
     * Obtiene el valor de la propiedad trbEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbEmpresa() {
        return trbEmpresa;
    }

    /**
     * Define el valor de la propiedad trbEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbEmpresa(String value) {
        this.trbEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad trbEsCivil.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbEsCivil() {
        return trbEsCivil;
    }

    /**
     * Define el valor de la propiedad trbEsCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbEsCivil(String value) {
        this.trbEsCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad trbEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbEstado() {
        return trbEstado;
    }

    /**
     * Define el valor de la propiedad trbEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbEstado(String value) {
        this.trbEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad trbFechaGraba.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbFechaGraba() {
        return trbFechaGraba;
    }

    /**
     * Define el valor de la propiedad trbFechaGraba.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbFechaGraba(String value) {
        this.trbFechaGraba = value;
    }

    /**
     * Obtiene el valor de la propiedad trbFechaIerSub.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbFechaIerSub() {
        return trbFechaIerSub;
    }

    /**
     * Define el valor de la propiedad trbFechaIerSub.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbFechaIerSub(String value) {
        this.trbFechaIerSub = value;
    }

    /**
     * Obtiene el valor de la propiedad trbFechaIngresos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbFechaIngresos() {
        return trbFechaIngresos;
    }

    /**
     * Define el valor de la propiedad trbFechaIngresos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbFechaIngresos(String value) {
        this.trbFechaIngresos = value;
    }

    /**
     * Obtiene el valor de la propiedad trbFechaNac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbFechaNac() {
        return trbFechaNac;
    }

    /**
     * Define el valor de la propiedad trbFechaNac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbFechaNac(String value) {
        this.trbFechaNac = value;
    }

    /**
     * Obtiene el valor de la propiedad trbIdentSub.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbIdentSub() {
        return trbIdentSub;
    }

    /**
     * Define el valor de la propiedad trbIdentSub.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbIdentSub(String value) {
        this.trbIdentSub = value;
    }

    /**
     * Obtiene el valor de la propiedad trbIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbIdentificacion() {
        return trbIdentificacion;
    }

    /**
     * Define el valor de la propiedad trbIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbIdentificacion(String value) {
        this.trbIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad trbImprimioCarnet.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrbImprimioCarnet() {
        return trbImprimioCarnet;
    }

    /**
     * Define el valor de la propiedad trbImprimioCarnet.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrbImprimioCarnet(Integer value) {
        this.trbImprimioCarnet = value;
    }

    /**
     * Obtiene el valor de la propiedad trbIndEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbIndEstado() {
        return trbIndEstado;
    }

    /**
     * Define el valor de la propiedad trbIndEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbIndEstado(String value) {
        this.trbIndEstado = value;
    }

    /**
     * Obtiene el valor de la propiedad trbIndPlanHosp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbIndPlanHosp() {
        return trbIndPlanHosp;
    }

    /**
     * Define el valor de la propiedad trbIndPlanHosp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbIndPlanHosp(String value) {
        this.trbIndPlanHosp = value;
    }

    /**
     * Obtiene el valor de la propiedad trbIndRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbIndRegistro() {
        return trbIndRegistro;
    }

    /**
     * Define el valor de la propiedad trbIndRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbIndRegistro(String value) {
        this.trbIndRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad trbIndSubsidio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbIndSubsidio() {
        return trbIndSubsidio;
    }

    /**
     * Define el valor de la propiedad trbIndSubsidio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbIndSubsidio(String value) {
        this.trbIndSubsidio = value;
    }

    /**
     * Obtiene el valor de la propiedad trbLugarNac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbLugarNac() {
        return trbLugarNac;
    }

    /**
     * Define el valor de la propiedad trbLugarNac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbLugarNac(String value) {
        this.trbLugarNac = value;
    }

    /**
     * Obtiene el valor de la propiedad trbNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbNombre() {
        return trbNombre;
    }

    /**
     * Define el valor de la propiedad trbNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbNombre(String value) {
        this.trbNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad trbNombres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbNombres() {
        return trbNombres;
    }

    /**
     * Define el valor de la propiedad trbNombres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbNombres(String value) {
        this.trbNombres = value;
    }

    /**
     * Obtiene el valor de la propiedad trbNovedTra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbNovedTra() {
        return trbNovedTra;
    }

    /**
     * Define el valor de la propiedad trbNovedTra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbNovedTra(String value) {
        this.trbNovedTra = value;
    }

    /**
     * Obtiene el valor de la propiedad trbNroCuotas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbNroCuotas() {
        return trbNroCuotas;
    }

    /**
     * Define el valor de la propiedad trbNroCuotas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbNroCuotas(String value) {
        this.trbNroCuotas = value;
    }

    /**
     * Obtiene el valor de la propiedad trbSalario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbSalario() {
        return trbSalario;
    }

    /**
     * Define el valor de la propiedad trbSalario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbSalario(String value) {
        this.trbSalario = value;
    }

    /**
     * Obtiene el valor de la propiedad trbSaldo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbSaldo() {
        return trbSaldo;
    }

    /**
     * Define el valor de la propiedad trbSaldo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbSaldo(String value) {
        this.trbSaldo = value;
    }

    /**
     * Obtiene el valor de la propiedad trbSecHabita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbSecHabita() {
        return trbSecHabita;
    }

    /**
     * Define el valor de la propiedad trbSecHabita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbSecHabita(String value) {
        this.trbSecHabita = value;
    }

    /**
     * Obtiene el valor de la propiedad trbSector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbSector() {
        return trbSector;
    }

    /**
     * Define el valor de la propiedad trbSector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbSector(String value) {
        this.trbSector = value;
    }

    /**
     * Obtiene el valor de la propiedad trbServicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbServicio() {
        return trbServicio;
    }

    /**
     * Define el valor de la propiedad trbServicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbServicio(String value) {
        this.trbServicio = value;
    }

    /**
     * Obtiene el valor de la propiedad trbSexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbSexo() {
        return trbSexo;
    }

    /**
     * Define el valor de la propiedad trbSexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbSexo(String value) {
        this.trbSexo = value;
    }

    /**
     * Obtiene el valor de la propiedad trbSubsidioEsp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbSubsidioEsp() {
        return trbSubsidioEsp;
    }

    /**
     * Define el valor de la propiedad trbSubsidioEsp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbSubsidioEsp(String value) {
        this.trbSubsidioEsp = value;
    }

    /**
     * Obtiene el valor de la propiedad trbTeleNuevo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbTeleNuevo() {
        return trbTeleNuevo;
    }

    /**
     * Define el valor de la propiedad trbTeleNuevo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbTeleNuevo(String value) {
        this.trbTeleNuevo = value;
    }

    /**
     * Obtiene el valor de la propiedad trbTelefono.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbTelefono() {
        return trbTelefono;
    }

    /**
     * Define el valor de la propiedad trbTelefono.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbTelefono(String value) {
        this.trbTelefono = value;
    }

    /**
     * Obtiene el valor de la propiedad trbValorPrest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrbValorPrest() {
        return trbValorPrest;
    }

    /**
     * Define el valor de la propiedad trbValorPrest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrbValorPrest(String value) {
        this.trbValorPrest = value;
    }

}

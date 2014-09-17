/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rockerW7
 */
@Entity
@Table(name = "V_Trabajadores")
@XmlRootElement
@NamedQueries({
    /*@NamedQuery(name = "VTrabajadores.findAll", query = "SELECT v FROM VTrabajadores v"),
    @NamedQuery(name = "VTrabajadores.findByTrbNombres", query = "SELECT v FROM VTrabajadores v WHERE v.trbNombres = :trbNombres"),
    @NamedQuery(name = "VTrabajadores.findByTrbEmpresa", query = "SELECT v FROM VTrabajadores v WHERE v.trbEmpresa = :trbEmpresa"),
    @NamedQuery(name = "VTrabajadores.findByTrb1ape", query = "SELECT v FROM VTrabajadores v WHERE v.trb1ape = :trb1ape"),
    @NamedQuery(name = "VTrabajadores.findByTrb2ape", query = "SELECT v FROM VTrabajadores v WHERE v.trb2ape = :trb2ape"),
    @NamedQuery(name = "VTrabajadores.findByTrbNombre", query = "SELECT v FROM VTrabajadores v WHERE v.trbNombre = :trbNombre"),
    @NamedQuery(name = "VTrabajadores.findByTrbCodigo", query = "SELECT v FROM VTrabajadores v WHERE v.trbCodigo = :trbCodigo"),
    @NamedQuery(name = "VTrabajadores.findByTrbServicio", query = "SELECT v FROM VTrabajadores v WHERE v.trbServicio = :trbServicio"),
    @NamedQuery(name = "VTrabajadores.findByTrbFechaNac", query = "SELECT v FROM VTrabajadores v WHERE v.trbFechaNac = :trbFechaNac"),
    @NamedQuery(name = "VTrabajadores.findByTrbLugarNac", query = "SELECT v FROM VTrabajadores v WHERE v.trbLugarNac = :trbLugarNac"),
    @NamedQuery(name = "VTrabajadores.findByTrbSexo", query = "SELECT v FROM VTrabajadores v WHERE v.trbSexo = :trbSexo"),
    @NamedQuery(name = "VTrabajadores.findByTrbEsCivil", query = "SELECT v FROM VTrabajadores v WHERE v.trbEsCivil = :trbEsCivil"),
    @NamedQuery(name = "VTrabajadores.findByTrbDireccion", query = "SELECT v FROM VTrabajadores v WHERE v.trbDireccion = :trbDireccion"),
    @NamedQuery(name = "VTrabajadores.findByTrbDpto", query = "SELECT v FROM VTrabajadores v WHERE v.trbDpto = :trbDpto"),
    @NamedQuery(name = "VTrabajadores.findByTrbCiudad", query = "SELECT v FROM VTrabajadores v WHERE v.trbCiudad = :trbCiudad"),
    @NamedQuery(name = "VTrabajadores.findByTrbSector", query = "SELECT v FROM VTrabajadores v WHERE v.trbSector = :trbSector"),
    @NamedQuery(name = "VTrabajadores.findByTrbBarrio", query = "SELECT v FROM VTrabajadores v WHERE v.trbBarrio = :trbBarrio"),
    @NamedQuery(name = "VTrabajadores.findByTrbTelefono", query = "SELECT v FROM VTrabajadores v WHERE v.trbTelefono = :trbTelefono"),
    @NamedQuery(name = "VTrabajadores.findByAnoMesBloqueo", query = "SELECT v FROM VTrabajadores v WHERE v.anoMesBloqueo = :anoMesBloqueo"),
    @NamedQuery(name = "VTrabajadores.findByTrbFechaIngresos", query = "SELECT v FROM VTrabajadores v WHERE v.trbFechaIngresos = :trbFechaIngresos"),
    @NamedQuery(name = "VTrabajadores.findByTrbFechaIerSub", query = "SELECT v FROM VTrabajadores v WHERE v.trbFechaIerSub = :trbFechaIerSub"),
    @NamedQuery(name = "VTrabajadores.findByTrbSalario", query = "SELECT v FROM VTrabajadores v WHERE v.trbSalario = :trbSalario"),
    @NamedQuery(name = "VTrabajadores.findByTrbSubsidioEsp", query = "SELECT v FROM VTrabajadores v WHERE v.trbSubsidioEsp = :trbSubsidioEsp"),
    @NamedQuery(name = "VTrabajadores.findByTrbNroCuotas", query = "SELECT v FROM VTrabajadores v WHERE v.trbNroCuotas = :trbNroCuotas"),
    @NamedQuery(name = "VTrabajadores.findByTrbIndSubsidio", query = "SELECT v FROM VTrabajadores v WHERE v.trbIndSubsidio = :trbIndSubsidio"),
    @NamedQuery(name = "VTrabajadores.findByTrbIndRegistro", query = "SELECT v FROM VTrabajadores v WHERE v.trbIndRegistro = :trbIndRegistro"),
    @NamedQuery(name = "VTrabajadores.findByTrbIndEstado", query = "SELECT v FROM VTrabajadores v WHERE v.trbIndEstado = :trbIndEstado"),
    @NamedQuery(name = "VTrabajadores.findByTrbIndPlanHosp", query = "SELECT v FROM VTrabajadores v WHERE v.trbIndPlanHosp = :trbIndPlanHosp"),
    @NamedQuery(name = "VTrabajadores.findByTrbValorPrest", query = "SELECT v FROM VTrabajadores v WHERE v.trbValorPrest = :trbValorPrest"),
    @NamedQuery(name = "VTrabajadores.findBySigloPrest", query = "SELECT v FROM VTrabajadores v WHERE v.sigloPrest = :sigloPrest"),
    @NamedQuery(name = "VTrabajadores.findByTrbCuota", query = "SELECT v FROM VTrabajadores v WHERE v.trbCuota = :trbCuota"),
    @NamedQuery(name = "VTrabajadores.findByTrbSaldo", query = "SELECT v FROM VTrabajadores v WHERE v.trbSaldo = :trbSaldo"),
    @NamedQuery(name = "VTrabajadores.findByTrbAjusteDb", query = "SELECT v FROM VTrabajadores v WHERE v.trbAjusteDb = :trbAjusteDb"),
    @NamedQuery(name = "VTrabajadores.findByTrbAjusteCr", query = "SELECT v FROM VTrabajadores v WHERE v.trbAjusteCr = :trbAjusteCr"),
    @NamedQuery(name = "VTrabajadores.findByTrbEstado", query = "SELECT v FROM VTrabajadores v WHERE v.trbEstado = :trbEstado"),
    @NamedQuery(name = "VTrabajadores.findByTrbEdad", query = "SELECT v FROM VTrabajadores v WHERE v.trbEdad = :trbEdad"),
    @NamedQuery(name = "VTrabajadores.findByTfechgrabanov", query = "SELECT v FROM VTrabajadores v WHERE v.tfechgrabanov = :tfechgrabanov"),
    @NamedQuery(name = "VTrabajadores.findByStrbr", query = "SELECT v FROM VTrabajadores v WHERE v.strbr = :strbr"),
    @NamedQuery(name = "VTrabajadores.findByS1trbr", query = "SELECT v FROM VTrabajadores v WHERE v.s1trbr = :s1trbr"),
    @NamedQuery(name = "VTrabajadores.findByTfechingcaja", query = "SELECT v FROM VTrabajadores v WHERE v.tfechingcaja = :tfechingcaja"),
    @NamedQuery(name = "VTrabajadores.findByTfechretiempre", query = "SELECT v FROM VTrabajadores v WHERE v.tfechretiempre = :tfechretiempre"),
    @NamedQuery(name = "VTrabajadores.findByNivelsectortrb", query = "SELECT v FROM VTrabajadores v WHERE v.nivelsectortrb = :nivelsectortrb"),
    @NamedQuery(name = "VTrabajadores.findByAreasectortrb", query = "SELECT v FROM VTrabajadores v WHERE v.areasectortrb = :areasectortrb"),
    @NamedQuery(name = "VTrabajadores.findByTfactualcaja", query = "SELECT v FROM VTrabajadores v WHERE v.tfactualcaja = :tfactualcaja"),
    @NamedQuery(name = "VTrabajadores.findByConsenovedtra", query = "SELECT v FROM VTrabajadores v WHERE v.consenovedtra = :consenovedtra"),
    @NamedQuery(name = "VTrabajadores.findByTfechainifideli", query = "SELECT v FROM VTrabajadores v WHERE v.tfechainifideli = :tfechainifideli"),
    @NamedQuery(name = "VTrabajadores.findByTfechafinfideli", query = "SELECT v FROM VTrabajadores v WHERE v.tfechafinfideli = :tfechafinfideli"),
    @NamedQuery(name = "VTrabajadores.findByTrbNovedTra", query = "SELECT v FROM VTrabajadores v WHERE v.trbNovedTra = :trbNovedTra"),
    @NamedQuery(name = "VTrabajadores.findByTrbCuotasDb", query = "SELECT v FROM VTrabajadores v WHERE v.trbCuotasDb = :trbCuotasDb"),
    @NamedQuery(name = "VTrabajadores.findByTrbDireNueva", query = "SELECT v FROM VTrabajadores v WHERE v.trbDireNueva = :trbDireNueva"),
    @NamedQuery(name = "VTrabajadores.findByTrbTeleNuevo", query = "SELECT v FROM VTrabajadores v WHERE v.trbTeleNuevo = :trbTeleNuevo"),
    @NamedQuery(name = "VTrabajadores.findByTrbSecHabita", query = "SELECT v FROM VTrabajadores v WHERE v.trbSecHabita = :trbSecHabita"),
    @NamedQuery(name = "VTrabajadores.findByNombre", query = "SELECT v FROM VTrabajadores v WHERE v.nombre = :nombre"),
    @NamedQuery(name = "VTrabajadores.findByTFret", query = "SELECT v FROM VTrabajadores v WHERE v.tFret = :tFret"),
    @NamedQuery(name = "VTrabajadores.findByKeyTrbCtvo", query = "SELECT v FROM VTrabajadores v WHERE v.keyTrbCtvo = :keyTrbCtvo"),
    @NamedQuery(name = "VTrabajadores.findByTrbCuentaTra", query = "SELECT v FROM VTrabajadores v WHERE v.trbCuentaTra = :trbCuentaTra"),
    @NamedQuery(name = "VTrabajadores.findByTrbIdentSub", query = "SELECT v FROM VTrabajadores v WHERE v.trbIdentSub = :trbIdentSub"),
    @NamedQuery(name = "VTrabajadores.findByTrbFechaGraba", query = "SELECT v FROM VTrabajadores v WHERE v.trbFechaGraba = :trbFechaGraba"),
    @NamedQuery(name = "VTrabajadores.findByTrbImprimioCarnet", query = "SELECT v FROM VTrabajadores v WHERE v.trbImprimioCarnet = :trbImprimioCarnet"),
    @NamedQuery(name = "VTrabajadores.findByTrbIdentificacion", query = "SELECT v FROM VTrabajadores v WHERE v.trbIdentificacion = :trbIdentificacion"),
    @NamedQuery(name = "VTrabajadores.findByNombre1", query = "SELECT v FROM VTrabajadores v WHERE v.nombre1 = :nombre1"),
    @NamedQuery(name = "VTrabajadores.findByNombre2", query = "SELECT v FROM VTrabajadores v WHERE v.nombre2 = :nombre2"),
    @NamedQuery(name = "VTrabajadores.findByApellido1", query = "SELECT v FROM VTrabajadores v WHERE v.apellido1 = :apellido1"),
    @NamedQuery(name = "VTrabajadores.findByApellido2", query = "SELECT v FROM VTrabajadores v WHERE v.apellido2 = :apellido2"),
    @NamedQuery(name = "VTrabajadores.findBySalarioNumerico", query = "SELECT v FROM VTrabajadores v WHERE v.salarioNumerico = :salarioNumerico"),
    @NamedQuery(name = "VTrabajadores.findByCategoria", query = "SELECT v FROM VTrabajadores v WHERE v.categoria = :categoria"),
    @NamedQuery(name = "VTrabajadores.findBySumaSalario", query = "SELECT v FROM VTrabajadores v WHERE v.sumaSalario = :sumaSalario"),
    @NamedQuery(name = "VTrabajadores.findByIdentificacion", query = "SELECT v FROM VTrabajadores v WHERE v.identificacion = :identificacion"),*/
    @NamedQuery(name = "VTrabajadores.findAllByNITCompany", query = "SELECT v FROM VTrabajadores v " +
                                "WHERE v.trbEmpresa IN ( SELECT e.empcodigo FROM Empresas e WHERE e.empnit = :nit )"),
    @NamedQuery(name = "VTrabajadores.getCountAllByNITCompany", query = "SELECT count(v) FROM VTrabajadores v " +
                                "WHERE v.trbEmpresa IN ( SELECT e.empcodigo FROM Empresas e WHERE e.empnit = :nit )")})
public class VTrabajadores implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Size(max = 82)
    @Column(name = "Trb_Nombres")
    private String trbNombres;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "TRB_EMPRESA")
    private String trbEmpresa;
    
    @Size(max = 15)
    @Column(name = "TRB_1APE")
    private String trb1ape;
    
    @Size(max = 15)
    @Column(name = "TRB_2APE")
    private String trb2ape;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TRB_NOMBRE")
    private String trbNombre;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "TRB_CODIGO")
    private String trbCodigo;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "TRB_SERVICIO")
    private String trbServicio;
    
    @Size(max = 8)
    @Column(name = "TRB_FECHA_NAC")
    private String trbFechaNac;
    
    @Size(max = 10)
    @Column(name = "TRB_LUGAR_NAC")
    private String trbLugarNac;
    
    @Size(max = 1)
    @Column(name = "TRB_SEXO")
    private String trbSexo;
    
    @Size(max = 1)
    @Column(name = "TRB_ES_CIVIL")
    private String trbEsCivil;
    
    @Size(max = 255)
    @Column(name = "TRB_DIRECCION")
    private String trbDireccion;
    
    @Size(max = 2)
    @Column(name = "TRB_DPTO")
    private String trbDpto;
    
    @Size(max = 5)
    @Column(name = "TRB_CIUDAD")
    private String trbCiudad;
    
    @Size(max = 2)
    @Column(name = "TRB_SECTOR")
    private String trbSector;
    
    @Size(max = 4)
    @Column(name = "TRB_BARRIO")
    private String trbBarrio;
    
    @Size(max = 7)
    @Column(name = "TRB_TELEFONO")
    private String trbTelefono;
    
    @Size(max = 6)
    @Column(name = "ANO_MES_BLOQUEO")
    private String anoMesBloqueo;
    
    @Size(max = 8)
    @Column(name = "TRB_FECHA_INGRESOS")
    private String trbFechaIngresos;
    
    @Size(max = 8)
    @Column(name = "TRB_FECHA_IER_SUB")
    private String trbFechaIerSub;
    
    @Size(max = 11)
    @Column(name = "TRB_SALARIO")
    private String trbSalario;
    
    @Size(max = 7)
    @Column(name = "TRB_SUBSIDIO_ESP")
    private String trbSubsidioEsp;
    
    @Size(max = 11)
    @Column(name = "TRB_NRO_CUOTAS")
    private String trbNroCuotas;
    
    @Size(max = 11)
    @Column(name = "TRB_IND_SUBSIDIO")
    private String trbIndSubsidio;
    
    @Size(max = 11)
    @Column(name = "TRB_IND_REGISTRO")
    private String trbIndRegistro;
    
    @Size(max = 1)
    @Column(name = "TRB_IND_ESTADO")
    private String trbIndEstado;
    
    @Size(max = 1)
    @Column(name = "TRB_IND_PLAN_HOSP")
    private String trbIndPlanHosp;
    
    @Size(max = 11)
    @Column(name = "TRB_VALOR_PREST")
    private String trbValorPrest;
    
    @Size(max = 8)
    @Column(name = "SIGLO_PREST")
    private String sigloPrest;
    
    @Size(max = 11)
    @Column(name = "TRB_CUOTA")
    private String trbCuota;
    
    @Size(max = 11)
    @Column(name = "TRB_SALDO")
    private String trbSaldo;
    
    @Size(max = 11)
    @Column(name = "TRB_AJUSTE_DB")
    private String trbAjusteDb;
    
    @Size(max = 11)
    @Column(name = "TRB_AJUSTE_CR")
    private String trbAjusteCr;
    
    @Size(max = 2)
    @Column(name = "TRB_ESTADO")
    private String trbEstado;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TRB_EDAD")
    private Double trbEdad;
    
    @Size(max = 8)
    @Column(name = "TFECHGRABANOV")
    private String tfechgrabanov;
    
    @Size(max = 1)
    @Column(name = "STRBR")
    private String strbr;
    
    @Size(max = 1)
    @Column(name = "S1TRBR")
    private String s1trbr;
    
    @Size(max = 8)
    @Column(name = "TFECHINGCAJA")
    private String tfechingcaja;
    
    @Size(max = 8)
    @Column(name = "TFECHRETIEMPRE")
    private String tfechretiempre;
    
    @Size(max = 1)
    @Column(name = "NIVELSECTORTRB")
    private String nivelsectortrb;
    
    @Size(max = 1)
    @Column(name = "AREASECTORTRB")
    private String areasectortrb;
    
    @Size(max = 8)
    @Column(name = "TFACTUALCAJA")
    private String tfactualcaja;
    
    @Size(max = 1)
    @Column(name = "CONSENOVEDTRA")
    private String consenovedtra;
    
    @Size(max = 8)
    @Column(name = "TFECHAINIFIDELI")
    private String tfechainifideli;
    
    @Size(max = 8)
    @Column(name = "TFECHAFINFIDELI")
    private String tfechafinfideli;
    
    @Size(max = 2)
    @Column(name = "TRB_NOVED_TRA")
    private String trbNovedTra;
    
    @Size(max = 2)
    @Column(name = "TRB_CUOTAS_DB")
    private String trbCuotasDb;
    
    @Size(max = 50)
    @Column(name = "TRB_DIRE_NUEVA")
    private String trbDireNueva;
    
    @Size(max = 11)
    @Column(name = "TRB_TELE_NUEVO")
    private String trbTeleNuevo;
    
    @Size(max = 1)
    @Column(name = "TRB_SEC_HABITA")
    private String trbSecHabita;
    
    @Size(max = 82)
    @Column(name = "Nombre")
    private String nombre;
    
    @Size(max = 8)
    @Column(name = "T_FRET")
    private String tFret;
    
    @Size(max = 3)
    @Column(name = "KEY_TRB_CTVO")
    private String keyTrbCtvo;
    
    @Size(max = 12)
    @Column(name = "TRB_CUENTA_TRA")
    private String trbCuentaTra;
    
    @Size(max = 9)
    @Column(name = "TRB_IDENT_SUB")
    private String trbIdentSub;
    
    @Size(max = 8)
    @Column(name = "TRB_FECHA_GRABA")
    private String trbFechaGraba;
    
    @Column(name = "TRB_IMPRIMIO_CARNET")
    private Character trbImprimioCarnet;
    
    @Size(max = 2)
    @Column(name = "TRB_IDENTIFICACION")
    private String trbIdentificacion;
    
    @Size(max = 20)
    @Column(name = "nombre1")
    private String nombre1;
    
    @Size(max = 30)
    @Column(name = "nombre2")
    private String nombre2;
    
    @Size(max = 20)
    @Column(name = "apellido1")
    private String apellido1;
    
    @Size(max = 30)
    @Column(name = "apellido2")
    private String apellido2;
    
    @Column(name = "SalarioNumerico")
    private Long salarioNumerico;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Categoria")
    private String categoria;
    
    @Column(name = "SumaSalario")
    private BigDecimal sumaSalario;
    
    @Size(max = 20)
    @Column(name = "Identificacion")
    private String identificacion;

    public VTrabajadores() {
    }

    public String getTrbNombres() {
        return trbNombres;
    }

    public void setTrbNombres(String trbNombres) {
        this.trbNombres = trbNombres;
    }

    public String getTrbEmpresa() {
        return trbEmpresa;
    }

    public void setTrbEmpresa(String trbEmpresa) {
        this.trbEmpresa = trbEmpresa;
    }

    public String getTrb1ape() {
        return trb1ape;
    }

    public void setTrb1ape(String trb1ape) {
        this.trb1ape = trb1ape;
    }

    public String getTrb2ape() {
        return trb2ape;
    }

    public void setTrb2ape(String trb2ape) {
        this.trb2ape = trb2ape;
    }

    public String getTrbNombre() {
        return trbNombre;
    }

    public void setTrbNombre(String trbNombre) {
        this.trbNombre = trbNombre;
    }

    public String getTrbCodigo() {
        return trbCodigo;
    }

    public void setTrbCodigo(String trbCodigo) {
        this.trbCodigo = trbCodigo;
    }

    public String getTrbServicio() {
        return trbServicio;
    }

    public void setTrbServicio(String trbServicio) {
        this.trbServicio = trbServicio;
    }

    public String getTrbFechaNac() {
        return trbFechaNac;
    }

    public void setTrbFechaNac(String trbFechaNac) {
        this.trbFechaNac = trbFechaNac;
    }

    public String getTrbLugarNac() {
        return trbLugarNac;
    }

    public void setTrbLugarNac(String trbLugarNac) {
        this.trbLugarNac = trbLugarNac;
    }

    public String getTrbSexo() {
        return trbSexo;
    }

    public void setTrbSexo(String trbSexo) {
        this.trbSexo = trbSexo;
    }

    public String getTrbEsCivil() {
        return trbEsCivil;
    }

    public void setTrbEsCivil(String trbEsCivil) {
        this.trbEsCivil = trbEsCivil;
    }

    public String getTrbDireccion() {
        return trbDireccion;
    }

    public void setTrbDireccion(String trbDireccion) {
        this.trbDireccion = trbDireccion;
    }

    public String getTrbDpto() {
        return trbDpto;
    }

    public void setTrbDpto(String trbDpto) {
        this.trbDpto = trbDpto;
    }

    public String getTrbCiudad() {
        return trbCiudad;
    }

    public void setTrbCiudad(String trbCiudad) {
        this.trbCiudad = trbCiudad;
    }

    public String getTrbSector() {
        return trbSector;
    }

    public void setTrbSector(String trbSector) {
        this.trbSector = trbSector;
    }

    public String getTrbBarrio() {
        return trbBarrio;
    }

    public void setTrbBarrio(String trbBarrio) {
        this.trbBarrio = trbBarrio;
    }

    public String getTrbTelefono() {
        return trbTelefono;
    }

    public void setTrbTelefono(String trbTelefono) {
        this.trbTelefono = trbTelefono;
    }

    public String getAnoMesBloqueo() {
        return anoMesBloqueo;
    }

    public void setAnoMesBloqueo(String anoMesBloqueo) {
        this.anoMesBloqueo = anoMesBloqueo;
    }

    public String getTrbFechaIngresos() {
        return trbFechaIngresos;
    }

    public void setTrbFechaIngresos(String trbFechaIngresos) {
        this.trbFechaIngresos = trbFechaIngresos;
    }

    public String getTrbFechaIerSub() {
        return trbFechaIerSub;
    }

    public void setTrbFechaIerSub(String trbFechaIerSub) {
        this.trbFechaIerSub = trbFechaIerSub;
    }

    public String getTrbSalario() {
        return trbSalario;
    }

    public void setTrbSalario(String trbSalario) {
        this.trbSalario = trbSalario;
    }

    public String getTrbSubsidioEsp() {
        return trbSubsidioEsp;
    }

    public void setTrbSubsidioEsp(String trbSubsidioEsp) {
        this.trbSubsidioEsp = trbSubsidioEsp;
    }

    public String getTrbNroCuotas() {
        return trbNroCuotas;
    }

    public void setTrbNroCuotas(String trbNroCuotas) {
        this.trbNroCuotas = trbNroCuotas;
    }

    public String getTrbIndSubsidio() {
        return trbIndSubsidio;
    }

    public void setTrbIndSubsidio(String trbIndSubsidio) {
        this.trbIndSubsidio = trbIndSubsidio;
    }

    public String getTrbIndRegistro() {
        return trbIndRegistro;
    }

    public void setTrbIndRegistro(String trbIndRegistro) {
        this.trbIndRegistro = trbIndRegistro;
    }

    public String getTrbIndEstado() {
        return trbIndEstado;
    }

    public void setTrbIndEstado(String trbIndEstado) {
        this.trbIndEstado = trbIndEstado;
    }

    public String getTrbIndPlanHosp() {
        return trbIndPlanHosp;
    }

    public void setTrbIndPlanHosp(String trbIndPlanHosp) {
        this.trbIndPlanHosp = trbIndPlanHosp;
    }

    public String getTrbValorPrest() {
        return trbValorPrest;
    }

    public void setTrbValorPrest(String trbValorPrest) {
        this.trbValorPrest = trbValorPrest;
    }

    public String getSigloPrest() {
        return sigloPrest;
    }

    public void setSigloPrest(String sigloPrest) {
        this.sigloPrest = sigloPrest;
    }

    public String getTrbCuota() {
        return trbCuota;
    }

    public void setTrbCuota(String trbCuota) {
        this.trbCuota = trbCuota;
    }

    public String getTrbSaldo() {
        return trbSaldo;
    }

    public void setTrbSaldo(String trbSaldo) {
        this.trbSaldo = trbSaldo;
    }

    public String getTrbAjusteDb() {
        return trbAjusteDb;
    }

    public void setTrbAjusteDb(String trbAjusteDb) {
        this.trbAjusteDb = trbAjusteDb;
    }

    public String getTrbAjusteCr() {
        return trbAjusteCr;
    }

    public void setTrbAjusteCr(String trbAjusteCr) {
        this.trbAjusteCr = trbAjusteCr;
    }

    public String getTrbEstado() {
        return trbEstado;
    }

    public void setTrbEstado(String trbEstado) {
        this.trbEstado = trbEstado;
    }

    public Double getTrbEdad() {
        return trbEdad;
    }

    public void setTrbEdad(Double trbEdad) {
        this.trbEdad = trbEdad;
    }

    public String getTfechgrabanov() {
        return tfechgrabanov;
    }

    public void setTfechgrabanov(String tfechgrabanov) {
        this.tfechgrabanov = tfechgrabanov;
    }

    public String getStrbr() {
        return strbr;
    }

    public void setStrbr(String strbr) {
        this.strbr = strbr;
    }

    public String getS1trbr() {
        return s1trbr;
    }

    public void setS1trbr(String s1trbr) {
        this.s1trbr = s1trbr;
    }

    public String getTfechingcaja() {
        return tfechingcaja;
    }

    public void setTfechingcaja(String tfechingcaja) {
        this.tfechingcaja = tfechingcaja;
    }

    public String getTfechretiempre() {
        return tfechretiempre;
    }

    public void setTfechretiempre(String tfechretiempre) {
        this.tfechretiempre = tfechretiempre;
    }

    public String getNivelsectortrb() {
        return nivelsectortrb;
    }

    public void setNivelsectortrb(String nivelsectortrb) {
        this.nivelsectortrb = nivelsectortrb;
    }

    public String getAreasectortrb() {
        return areasectortrb;
    }

    public void setAreasectortrb(String areasectortrb) {
        this.areasectortrb = areasectortrb;
    }

    public String getTfactualcaja() {
        return tfactualcaja;
    }

    public void setTfactualcaja(String tfactualcaja) {
        this.tfactualcaja = tfactualcaja;
    }

    public String getConsenovedtra() {
        return consenovedtra;
    }

    public void setConsenovedtra(String consenovedtra) {
        this.consenovedtra = consenovedtra;
    }

    public String getTfechainifideli() {
        return tfechainifideli;
    }

    public void setTfechainifideli(String tfechainifideli) {
        this.tfechainifideli = tfechainifideli;
    }

    public String getTfechafinfideli() {
        return tfechafinfideli;
    }

    public void setTfechafinfideli(String tfechafinfideli) {
        this.tfechafinfideli = tfechafinfideli;
    }

    public String getTrbNovedTra() {
        return trbNovedTra;
    }

    public void setTrbNovedTra(String trbNovedTra) {
        this.trbNovedTra = trbNovedTra;
    }

    public String getTrbCuotasDb() {
        return trbCuotasDb;
    }

    public void setTrbCuotasDb(String trbCuotasDb) {
        this.trbCuotasDb = trbCuotasDb;
    }

    public String getTrbDireNueva() {
        return trbDireNueva;
    }

    public void setTrbDireNueva(String trbDireNueva) {
        this.trbDireNueva = trbDireNueva;
    }

    public String getTrbTeleNuevo() {
        return trbTeleNuevo;
    }

    public void setTrbTeleNuevo(String trbTeleNuevo) {
        this.trbTeleNuevo = trbTeleNuevo;
    }

    public String getTrbSecHabita() {
        return trbSecHabita;
    }

    public void setTrbSecHabita(String trbSecHabita) {
        this.trbSecHabita = trbSecHabita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTFret() {
        return tFret;
    }

    public void setTFret(String tFret) {
        this.tFret = tFret;
    }

    public String getKeyTrbCtvo() {
        return keyTrbCtvo;
    }

    public void setKeyTrbCtvo(String keyTrbCtvo) {
        this.keyTrbCtvo = keyTrbCtvo;
    }

    public String getTrbCuentaTra() {
        return trbCuentaTra;
    }

    public void setTrbCuentaTra(String trbCuentaTra) {
        this.trbCuentaTra = trbCuentaTra;
    }

    public String getTrbIdentSub() {
        return trbIdentSub;
    }

    public void setTrbIdentSub(String trbIdentSub) {
        this.trbIdentSub = trbIdentSub;
    }

    public String getTrbFechaGraba() {
        return trbFechaGraba;
    }

    public void setTrbFechaGraba(String trbFechaGraba) {
        this.trbFechaGraba = trbFechaGraba;
    }

    public Character getTrbImprimioCarnet() {
        return trbImprimioCarnet;
    }

    public void setTrbImprimioCarnet(Character trbImprimioCarnet) {
        this.trbImprimioCarnet = trbImprimioCarnet;
    }

    public String getTrbIdentificacion() {
        return trbIdentificacion;
    }

    public void setTrbIdentificacion(String trbIdentificacion) {
        this.trbIdentificacion = trbIdentificacion;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Long getSalarioNumerico() {
        return salarioNumerico;
    }

    public void setSalarioNumerico(Long salarioNumerico) {
        this.salarioNumerico = salarioNumerico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getSumaSalario() {
        return sumaSalario;
    }

    public void setSumaSalario(BigDecimal sumaSalario) {
        this.sumaSalario = sumaSalario;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
}

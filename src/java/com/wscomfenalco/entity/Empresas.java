/*
 * and open the template in the editor.
 */
package com.wscomfenalco.entity;

import java.io.Serializable;
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
@Table(name = "Empresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e"),
    @NamedQuery(name = "Empresas.findByEmpcodigo", query = "SELECT e FROM Empresas e WHERE e.empcodigo = :empcodigo"),
    @NamedQuery(name = "Empresas.findByW1cod", query = "SELECT e FROM Empresas e WHERE e.w1cod = :w1cod"),
    @NamedQuery(name = "Empresas.findByEmpactividad", query = "SELECT e FROM Empresas e WHERE e.empactividad = :empactividad"),
    @NamedQuery(name = "Empresas.findByEmpnombre", query = "SELECT e FROM Empresas e WHERE e.empnombre = :empnombre"),
    @NamedQuery(name = "Empresas.findByEmpdv", query = "SELECT e FROM Empresas e WHERE e.empdv = :empdv"),
    @NamedQuery(name = "Empresas.findByEmpc", query = "SELECT e FROM Empresas e WHERE e.empc = :empc"),
    @NamedQuery(name = "Empresas.findByEmpnit", query = "SELECT e FROM Empresas e WHERE e.empnit = :empnit"),
    @NamedQuery(name = "Empresas.findByEmpdireccion", query = "SELECT e FROM Empresas e WHERE e.empdireccion = :empdireccion"),
    @NamedQuery(name = "Empresas.findByEmpciudad", query = "SELECT e FROM Empresas e WHERE e.empciudad = :empciudad"),
    @NamedQuery(name = "Empresas.findByEmpsector", query = "SELECT e FROM Empresas e WHERE e.empsector = :empsector"),
    @NamedQuery(name = "Empresas.findByEmpbarrio", query = "SELECT e FROM Empresas e WHERE e.empbarrio = :empbarrio"),
    @NamedQuery(name = "Empresas.findByEmpaareo", query = "SELECT e FROM Empresas e WHERE e.empaareo = :empaareo"),
    @NamedQuery(name = "Empresas.findByEmptelefono", query = "SELECT e FROM Empresas e WHERE e.emptelefono = :emptelefono"),
    @NamedQuery(name = "Empresas.findByEmpingreso", query = "SELECT e FROM Empresas e WHERE e.empingreso = :empingreso"),
    @NamedQuery(name = "Empresas.findByEmpultimopago", query = "SELECT e FROM Empresas e WHERE e.empultimopago = :empultimopago"),
    @NamedQuery(name = "Empresas.findByEmpindaporte", query = "SELECT e FROM Empresas e WHERE e.empindaporte = :empindaporte"),
    @NamedQuery(name = "Empresas.findByEmpindactividad", query = "SELECT e FROM Empresas e WHERE e.empindactividad = :empindactividad"),
    @NamedQuery(name = "Empresas.findByEmpindaportante", query = "SELECT e FROM Empresas e WHERE e.empindaportante = :empindaportante"),
    @NamedQuery(name = "Empresas.findByEmpinpplanhospitalizacion", query = "SELECT e FROM Empresas e WHERE e.empinpplanhospitalizacion = :empinpplanhospitalizacion"),
    @NamedQuery(name = "Empresas.findByOfiprivada", query = "SELECT e FROM Empresas e WHERE e.ofiprivada = :ofiprivada"),
    @NamedQuery(name = "Empresas.findByEmpdireccion1", query = "SELECT e FROM Empresas e WHERE e.empdireccion1 = :empdireccion1"),
    @NamedQuery(name = "Empresas.findByEmptasaapor1", query = "SELECT e FROM Empresas e WHERE e.emptasaapor1 = :emptasaapor1"),
    @NamedQuery(name = "Empresas.findByEmptasaapor2", query = "SELECT e FROM Empresas e WHERE e.emptasaapor2 = :emptasaapor2"),
    @NamedQuery(name = "Empresas.findByEmptasaapor3", query = "SELECT e FROM Empresas e WHERE e.emptasaapor3 = :emptasaapor3"),
    @NamedQuery(name = "Empresas.findByEmptasaapor4", query = "SELECT e FROM Empresas e WHERE e.emptasaapor4 = :emptasaapor4"),
    @NamedQuery(name = "Empresas.findByEmptasaapor5", query = "SELECT e FROM Empresas e WHERE e.emptasaapor5 = :emptasaapor5"),
    @NamedQuery(name = "Empresas.findByEmpestado", query = "SELECT e FROM Empresas e WHERE e.empestado = :empestado"),
    @NamedQuery(name = "Empresas.findByEmpActieco", query = "SELECT e FROM Empresas e WHERE e.empActieco = :empActieco"),
    @NamedQuery(name = "Empresas.findByEmpNuevas", query = "SELECT e FROM Empresas e WHERE e.empNuevas = :empNuevas"),
    @NamedQuery(name = "Empresas.findByEmpFechaRetiro", query = "SELECT e FROM Empresas e WHERE e.empFechaRetiro = :empFechaRetiro"),
    @NamedQuery(name = "Empresas.findByEmpFechaIngresoActual", query = "SELECT e FROM Empresas e WHERE e.empFechaIngresoActual = :empFechaIngresoActual"),
    @NamedQuery(name = "Empresas.findByEmpTipoEntLey21", query = "SELECT e FROM Empresas e WHERE e.empTipoEntLey21 = :empTipoEntLey21"),
    @NamedQuery(name = "Empresas.findByEmpPeriodoAportes", query = "SELECT e FROM Empresas e WHERE e.empPeriodoAportes = :empPeriodoAportes"),
    @NamedQuery(name = "Empresas.findByEmpFinAportes", query = "SELECT e FROM Empresas e WHERE e.empFinAportes = :empFinAportes"),
    @NamedQuery(name = "Empresas.findByEmpCorreoElectronico", query = "SELECT e FROM Empresas e WHERE e.empCorreoElectronico = :empCorreoElectronico"),
    @NamedQuery(name = "Empresas.findByEmpTelefonoCelular", query = "SELECT e FROM Empresas e WHERE e.empTelefonoCelular = :empTelefonoCelular"),
    @NamedQuery(name = "Empresas.findByEmpCorreoMail", query = "SELECT e FROM Empresas e WHERE e.empCorreoMail = :empCorreoMail"),
    @NamedQuery(name = "Empresas.findByEmpFechaGraba", query = "SELECT e FROM Empresas e WHERE e.empFechaGraba = :empFechaGraba"),
    @NamedQuery(name = "Empresas.findByEmpCodigoRutas", query = "SELECT e FROM Empresas e WHERE e.empCodigoRutas = :empCodigoRutas"),
    @NamedQuery(name = "Empresas.findByEmpCodigoDireccion", query = "SELECT e FROM Empresas e WHERE e.empCodigoDireccion = :empCodigoDireccion"),
    @NamedQuery(name = "Empresas.findByEmpFechaCarnet", query = "SELECT e FROM Empresas e WHERE e.empFechaCarnet = :empFechaCarnet"),
    @NamedQuery(name = "Empresas.findByEmpFechaCarnetP", query = "SELECT e FROM Empresas e WHERE e.empFechaCarnetP = :empFechaCarnetP"),
    @NamedQuery(name = "Empresas.findByEmpImprimeCarnet", query = "SELECT e FROM Empresas e WHERE e.empImprimeCarnet = :empImprimeCarnet"),
    @NamedQuery(name = "Empresas.findByEmpEstablecimiento", query = "SELECT e FROM Empresas e WHERE e.empEstablecimiento = :empEstablecimiento"),
    @NamedQuery(name = "Empresas.findByEmpIdentificacion", query = "SELECT e FROM Empresas e WHERE e.empIdentificacion = :empIdentificacion"),
    @NamedQuery(name = "Empresas.findByActividadPila", query = "SELECT e FROM Empresas e WHERE e.actividadPila = :actividadPila"),
    @NamedQuery(name = "Empresas.findByNominaInicial", query = "SELECT e FROM Empresas e WHERE e.nominaInicial = :nominaInicial"),
    @NamedQuery(name = "Empresas.findByCedRepresentante", query = "SELECT e FROM Empresas e WHERE e.cedRepresentante = :cedRepresentante"),
    @NamedQuery(name = "Empresas.findBySinTrabajadores", query = "SELECT e FROM Empresas e WHERE e.sinTrabajadores = :sinTrabajadores"),
    @NamedQuery(name = "Empresas.findByEmpLey1429", query = "SELECT e FROM Empresas e WHERE e.empLey1429 = :empLey1429"),
    @NamedQuery(name = "Empresas.findByEmpFechaCamara", query = "SELECT e FROM Empresas e WHERE e.empFechaCamara = :empFechaCamara")})
public class Empresas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "empcodigo")
    private String empcodigo;
    @Size(max = 6)
    @Column(name = "w1cod")
    private String w1cod;
    @Size(max = 3)
    @Column(name = "empactividad")
    private String empactividad;
    @Size(max = 42)
    @Column(name = "empnombre")
    private String empnombre;
    @Size(max = 2)
    @Column(name = "empdv")
    private String empdv;
    @Size(max = 1)
    @Column(name = "empc")
    private String empc;
    @Size(max = 16)
    @Column(name = "empnit")
    private String empnit;
    @Size(max = 20)
    @Column(name = "empdireccion")
    private String empdireccion;
    @Size(max = 12)
    @Column(name = "empciudad")
    private String empciudad;
    @Size(max = 2)
    @Column(name = "empsector")
    private String empsector;
    @Size(max = 4)
    @Column(name = "empbarrio")
    private String empbarrio;
    @Size(max = 6)
    @Column(name = "empaareo")
    private String empaareo;
    @Size(max = 7)
    @Column(name = "emptelefono")
    private String emptelefono;
    @Size(max = 8)
    @Column(name = "empingreso")
    private String empingreso;
    @Size(max = 8)
    @Column(name = "empultimopago")
    private String empultimopago;
    @Size(max = 1)
    @Column(name = "empindaporte")
    private String empindaporte;
    @Size(max = 1)
    @Column(name = "empindactividad")
    private String empindactividad;
    @Size(max = 1)
    @Column(name = "empindaportante")
    private String empindaportante;
    @Size(max = 1)
    @Column(name = "empinpplanhospitalizacion")
    private String empinpplanhospitalizacion;
    @Size(max = 1)
    @Column(name = "ofiprivada")
    private String ofiprivada;
    @Size(max = 29)
    @Column(name = "empdireccion1")
    private String empdireccion1;
    @Size(max = 50)
    @Column(name = "emptasaapor1")
    private String emptasaapor1;
    @Size(max = 50)
    @Column(name = "emptasaapor2")
    private String emptasaapor2;
    @Size(max = 50)
    @Column(name = "emptasaapor3")
    private String emptasaapor3;
    @Size(max = 50)
    @Column(name = "emptasaapor4")
    private String emptasaapor4;
    @Size(max = 50)
    @Column(name = "emptasaapor5")
    private String emptasaapor5;
    @Size(max = 1)
    @Column(name = "empestado")
    private String empestado;
    @Size(max = 2)
    @Column(name = "emp_actieco")
    private String empActieco;
    @Size(max = 1)
    @Column(name = "emp_nuevas")
    private String empNuevas;
    @Size(max = 8)
    @Column(name = "emp_fecha_retiro")
    private String empFechaRetiro;
    @Size(max = 8)
    @Column(name = "emp_fecha_ingreso_actual")
    private String empFechaIngresoActual;
    @Size(max = 3)
    @Column(name = "emp_tipo_ent_ley21")
    private String empTipoEntLey21;
    @Size(max = 6)
    @Column(name = "emp_periodo_aportes")
    private String empPeriodoAportes;
    @Size(max = 6)
    @Column(name = "emp_fin_aportes")
    private String empFinAportes;
    @Size(max = 35)
    @Column(name = "emp_correo_electronico")
    private String empCorreoElectronico;
    @Size(max = 10)
    @Column(name = "emp_telefono_celular")
    private String empTelefonoCelular;
    @Size(max = 60)
    @Column(name = "emp_correo_mail")
    private String empCorreoMail;
    @Size(max = 8)
    @Column(name = "emp_fecha_graba")
    private String empFechaGraba;
    @Size(max = 4)
    @Column(name = "emp_codigo_rutas")
    private String empCodigoRutas;
    @Size(max = 4)
    @Column(name = "emp_codigo_direccion")
    private String empCodigoDireccion;
    @Size(max = 8)
    @Column(name = "emp_fecha_carnet")
    private String empFechaCarnet;
    @Size(max = 8)
    @Column(name = "emp_fecha_carnet_p")
    private String empFechaCarnetP;
    @Size(max = 1)
    @Column(name = "emp_imprime_carnet")
    private String empImprimeCarnet;
    @Size(max = 40)
    @Column(name = "emp_establecimiento")
    private String empEstablecimiento;
    @Size(max = 2)
    @Column(name = "emp_identificacion")
    private String empIdentificacion;
    @Size(max = 4)
    @Column(name = "actividad_pila")
    private String actividadPila;
    @Size(max = 9)
    @Column(name = "nomina_inicial")
    private String nominaInicial;
    @Size(max = 11)
    @Column(name = "ced_representante")
    private String cedRepresentante;
    @Size(max = 1)
    @Column(name = "sin_trabajadores")
    private String sinTrabajadores;
    @Size(max = 1)
    @Column(name = "emp_ley_1429")
    private String empLey1429;
    @Size(max = 8)
    @Column(name = "emp_fecha_camara")
    private String empFechaCamara;

    public Empresas() {
    }

    public Empresas(String empcodigo) {
        this.empcodigo = empcodigo;
    }

    public String getEmpcodigo() {
        return empcodigo;
    }

    public void setEmpcodigo(String empcodigo) {
        this.empcodigo = empcodigo;
    }

    public String getW1cod() {
        return w1cod;
    }

    public void setW1cod(String w1cod) {
        this.w1cod = w1cod;
    }

    public String getEmpactividad() {
        return empactividad;
    }

    public void setEmpactividad(String empactividad) {
        this.empactividad = empactividad;
    }

    public String getEmpnombre() {
        return empnombre;
    }

    public void setEmpnombre(String empnombre) {
        this.empnombre = empnombre;
    }

    public String getEmpdv() {
        return empdv;
    }

    public void setEmpdv(String empdv) {
        this.empdv = empdv;
    }

    public String getEmpc() {
        return empc;
    }

    public void setEmpc(String empc) {
        this.empc = empc;
    }

    public String getEmpnit() {
        return empnit;
    }

    public void setEmpnit(String empnit) {
        this.empnit = empnit;
    }

    public String getEmpdireccion() {
        return empdireccion;
    }

    public void setEmpdireccion(String empdireccion) {
        this.empdireccion = empdireccion;
    }

    public String getEmpciudad() {
        return empciudad;
    }

    public void setEmpciudad(String empciudad) {
        this.empciudad = empciudad;
    }

    public String getEmpsector() {
        return empsector;
    }

    public void setEmpsector(String empsector) {
        this.empsector = empsector;
    }

    public String getEmpbarrio() {
        return empbarrio;
    }

    public void setEmpbarrio(String empbarrio) {
        this.empbarrio = empbarrio;
    }

    public String getEmpaareo() {
        return empaareo;
    }

    public void setEmpaareo(String empaareo) {
        this.empaareo = empaareo;
    }

    public String getEmptelefono() {
        return emptelefono;
    }

    public void setEmptelefono(String emptelefono) {
        this.emptelefono = emptelefono;
    }

    public String getEmpingreso() {
        return empingreso;
    }

    public void setEmpingreso(String empingreso) {
        this.empingreso = empingreso;
    }

    public String getEmpultimopago() {
        return empultimopago;
    }

    public void setEmpultimopago(String empultimopago) {
        this.empultimopago = empultimopago;
    }

    public String getEmpindaporte() {
        return empindaporte;
    }

    public void setEmpindaporte(String empindaporte) {
        this.empindaporte = empindaporte;
    }

    public String getEmpindactividad() {
        return empindactividad;
    }

    public void setEmpindactividad(String empindactividad) {
        this.empindactividad = empindactividad;
    }

    public String getEmpindaportante() {
        return empindaportante;
    }

    public void setEmpindaportante(String empindaportante) {
        this.empindaportante = empindaportante;
    }

    public String getEmpinpplanhospitalizacion() {
        return empinpplanhospitalizacion;
    }

    public void setEmpinpplanhospitalizacion(String empinpplanhospitalizacion) {
        this.empinpplanhospitalizacion = empinpplanhospitalizacion;
    }

    public String getOfiprivada() {
        return ofiprivada;
    }

    public void setOfiprivada(String ofiprivada) {
        this.ofiprivada = ofiprivada;
    }

    public String getEmpdireccion1() {
        return empdireccion1;
    }

    public void setEmpdireccion1(String empdireccion1) {
        this.empdireccion1 = empdireccion1;
    }

    public String getEmptasaapor1() {
        return emptasaapor1;
    }

    public void setEmptasaapor1(String emptasaapor1) {
        this.emptasaapor1 = emptasaapor1;
    }

    public String getEmptasaapor2() {
        return emptasaapor2;
    }

    public void setEmptasaapor2(String emptasaapor2) {
        this.emptasaapor2 = emptasaapor2;
    }

    public String getEmptasaapor3() {
        return emptasaapor3;
    }

    public void setEmptasaapor3(String emptasaapor3) {
        this.emptasaapor3 = emptasaapor3;
    }

    public String getEmptasaapor4() {
        return emptasaapor4;
    }

    public void setEmptasaapor4(String emptasaapor4) {
        this.emptasaapor4 = emptasaapor4;
    }

    public String getEmptasaapor5() {
        return emptasaapor5;
    }

    public void setEmptasaapor5(String emptasaapor5) {
        this.emptasaapor5 = emptasaapor5;
    }

    public String getEmpestado() {
        return empestado;
    }

    public void setEmpestado(String empestado) {
        this.empestado = empestado;
    }

    public String getEmpActieco() {
        return empActieco;
    }

    public void setEmpActieco(String empActieco) {
        this.empActieco = empActieco;
    }

    public String getEmpNuevas() {
        return empNuevas;
    }

    public void setEmpNuevas(String empNuevas) {
        this.empNuevas = empNuevas;
    }

    public String getEmpFechaRetiro() {
        return empFechaRetiro;
    }

    public void setEmpFechaRetiro(String empFechaRetiro) {
        this.empFechaRetiro = empFechaRetiro;
    }

    public String getEmpFechaIngresoActual() {
        return empFechaIngresoActual;
    }

    public void setEmpFechaIngresoActual(String empFechaIngresoActual) {
        this.empFechaIngresoActual = empFechaIngresoActual;
    }

    public String getEmpTipoEntLey21() {
        return empTipoEntLey21;
    }

    public void setEmpTipoEntLey21(String empTipoEntLey21) {
        this.empTipoEntLey21 = empTipoEntLey21;
    }

    public String getEmpPeriodoAportes() {
        return empPeriodoAportes;
    }

    public void setEmpPeriodoAportes(String empPeriodoAportes) {
        this.empPeriodoAportes = empPeriodoAportes;
    }

    public String getEmpFinAportes() {
        return empFinAportes;
    }

    public void setEmpFinAportes(String empFinAportes) {
        this.empFinAportes = empFinAportes;
    }

    public String getEmpCorreoElectronico() {
        return empCorreoElectronico;
    }

    public void setEmpCorreoElectronico(String empCorreoElectronico) {
        this.empCorreoElectronico = empCorreoElectronico;
    }

    public String getEmpTelefonoCelular() {
        return empTelefonoCelular;
    }

    public void setEmpTelefonoCelular(String empTelefonoCelular) {
        this.empTelefonoCelular = empTelefonoCelular;
    }

    public String getEmpCorreoMail() {
        return empCorreoMail;
    }

    public void setEmpCorreoMail(String empCorreoMail) {
        this.empCorreoMail = empCorreoMail;
    }

    public String getEmpFechaGraba() {
        return empFechaGraba;
    }

    public void setEmpFechaGraba(String empFechaGraba) {
        this.empFechaGraba = empFechaGraba;
    }

    public String getEmpCodigoRutas() {
        return empCodigoRutas;
    }

    public void setEmpCodigoRutas(String empCodigoRutas) {
        this.empCodigoRutas = empCodigoRutas;
    }

    public String getEmpCodigoDireccion() {
        return empCodigoDireccion;
    }

    public void setEmpCodigoDireccion(String empCodigoDireccion) {
        this.empCodigoDireccion = empCodigoDireccion;
    }

    public String getEmpFechaCarnet() {
        return empFechaCarnet;
    }

    public void setEmpFechaCarnet(String empFechaCarnet) {
        this.empFechaCarnet = empFechaCarnet;
    }

    public String getEmpFechaCarnetP() {
        return empFechaCarnetP;
    }

    public void setEmpFechaCarnetP(String empFechaCarnetP) {
        this.empFechaCarnetP = empFechaCarnetP;
    }

    public String getEmpImprimeCarnet() {
        return empImprimeCarnet;
    }

    public void setEmpImprimeCarnet(String empImprimeCarnet) {
        this.empImprimeCarnet = empImprimeCarnet;
    }

    public String getEmpEstablecimiento() {
        return empEstablecimiento;
    }

    public void setEmpEstablecimiento(String empEstablecimiento) {
        this.empEstablecimiento = empEstablecimiento;
    }

    public String getEmpIdentificacion() {
        return empIdentificacion;
    }

    public void setEmpIdentificacion(String empIdentificacion) {
        this.empIdentificacion = empIdentificacion;
    }

    public String getActividadPila() {
        return actividadPila;
    }

    public void setActividadPila(String actividadPila) {
        this.actividadPila = actividadPila;
    }

    public String getNominaInicial() {
        return nominaInicial;
    }

    public void setNominaInicial(String nominaInicial) {
        this.nominaInicial = nominaInicial;
    }

    public String getCedRepresentante() {
        return cedRepresentante;
    }

    public void setCedRepresentante(String cedRepresentante) {
        this.cedRepresentante = cedRepresentante;
    }

    public String getSinTrabajadores() {
        return sinTrabajadores;
    }

    public void setSinTrabajadores(String sinTrabajadores) {
        this.sinTrabajadores = sinTrabajadores;
    }

    public String getEmpLey1429() {
        return empLey1429;
    }

    public void setEmpLey1429(String empLey1429) {
        this.empLey1429 = empLey1429;
    }

    public String getEmpFechaCamara() {
        return empFechaCamara;
    }

    public void setEmpFechaCamara(String empFechaCamara) {
        this.empFechaCamara = empFechaCamara;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empcodigo != null ? empcodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.empcodigo == null && other.empcodigo != null) || (this.empcodigo != null && !this.empcodigo.equals(other.empcodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wscomfenalco.entity.Empresas[ empcodigo=" + empcodigo + " ]";
    }
    
}

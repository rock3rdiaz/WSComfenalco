/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rockerW7
 */
@Entity
@Table(name = "history_web")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoryWeb.findAll", query = "SELECT h FROM HistoryWeb h"),
    @NamedQuery(name = "HistoryWeb.findById", query = "SELECT h FROM HistoryWeb h WHERE h.id = :id"),
    @NamedQuery(name = "HistoryWeb.findByAdmissionDate", query = "SELECT h FROM HistoryWeb h WHERE h.admissionDate = :admissionDate")})
public class HistoryWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "admission_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date admissionDate;
    
    @JoinColumn(name = "user_web_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private UserWeb userWebId;

    public HistoryWeb() {
    }

    public HistoryWeb(Integer id) {
        this.id = id;
    }

    public HistoryWeb(Integer id, Date admissionDate) {
        this.id = id;
        this.admissionDate = admissionDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public UserWeb getUserWebId() {
        return userWebId;
    }

    public void setUserWebId(UserWeb userWebId) {
        this.userWebId = userWebId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoryWeb)) {
            return false;
        }
        HistoryWeb other = (HistoryWeb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wscomfenalco.entity.HistoryWeb[ id=" + id + " ]";
    }
    
}

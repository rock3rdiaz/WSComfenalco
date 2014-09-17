/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wscomfenalco.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rockerW7
 */
@Entity
@Table(name = "user_web")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserWeb.findAll", query = "SELECT u FROM UserWeb u"),
    @NamedQuery(name = "UserWeb.findById", query = "SELECT u FROM UserWeb u WHERE u.id = :id"),
    @NamedQuery(name = "UserWeb.findByUsername", query = "SELECT u FROM UserWeb u WHERE u.username = :username"),
    @NamedQuery(name = "UserWeb.findByPass", query = "SELECT u FROM UserWeb u WHERE u.pass = :pass"),
    @NamedQuery(name = "UserWeb.findByProfile", query = "SELECT u FROM UserWeb u WHERE u.profile = :profile"),
    @NamedQuery(name = "UserWeb.findByNitCompany", query = "SELECT u FROM UserWeb u WHERE u.nitCompany = :nitCompany"),
    @NamedQuery(name = "UserWeb.findByIdentification", query = "SELECT u FROM UserWeb u WHERE u.identification = :identification"),
    @NamedQuery(name = "UserWeb.findByCredentials", query = "SELECT u FROM UserWeb u WHERE u.username = :username AND u.pass = :pass")})
public class UserWeb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "pass")
    private String pass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "profile")
    private String profile;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "nit_company")
    private String nitCompany;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "identification")
    private String identification;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userWebId")
    private Collection<HistoryWeb> historyWebCollection;

    public UserWeb() {
    }

    public UserWeb(Integer id) {
        this.id = id;
    }

    public UserWeb(Integer id, String username, String pass, String profile, String nitCompany, String identification) {
        this.id = id;
        this.username = username;
        this.pass = pass;
        this.profile = profile;
        this.nitCompany = nitCompany;
        this.identification = identification;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getNitCompany() {
        return nitCompany;
    }

    public void setNitCompany(String nitCompany) {
        this.nitCompany = nitCompany;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @XmlTransient
    public Collection<HistoryWeb> getHistoryWebCollection() {
        return historyWebCollection;
    }

    public void setHistoryWebCollection(Collection<HistoryWeb> historyWebCollection) {
        this.historyWebCollection = historyWebCollection;
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
        if (!(object instanceof UserWeb)) {
            return false;
        }
        UserWeb other = (UserWeb) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wscomfenalco.entity.UserWeb[ id=" + id + " ]";
    }
    
}

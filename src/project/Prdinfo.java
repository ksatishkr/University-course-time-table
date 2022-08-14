/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author NEW
 */
@Entity
@Table(name = "prdinfo", catalog = "pro", schema = "")
@NamedQueries({
    @NamedQuery(name = "Prdinfo.findAll", query = "SELECT p FROM Prdinfo p")
    , @NamedQuery(name = "Prdinfo.findByPid", query = "SELECT p FROM Prdinfo p WHERE p.pid = :pid")
    , @NamedQuery(name = "Prdinfo.findByStTime", query = "SELECT p FROM Prdinfo p WHERE p.stTime = :stTime")
    , @NamedQuery(name = "Prdinfo.findByEndTime", query = "SELECT p FROM Prdinfo p WHERE p.endTime = :endTime")})
public class Prdinfo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pid")
    private String pid;
    @Column(name = "st_time")
    @Temporal(TemporalType.TIME)
    private Date stTime;
    @Column(name = "end_time")
    @Temporal(TemporalType.TIME)
    private Date endTime;

    public Prdinfo() {
    }

    public Prdinfo(String pid) {
        this.pid = pid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        String oldPid = this.pid;
        this.pid = pid;
        changeSupport.firePropertyChange("pid", oldPid, pid);
    }

    public Date getStTime() {
        return stTime;
    }

    public void setStTime(Date stTime) {
        Date oldStTime = this.stTime;
        this.stTime = stTime;
        changeSupport.firePropertyChange("stTime", oldStTime, stTime);
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        Date oldEndTime = this.endTime;
        this.endTime = endTime;
        changeSupport.firePropertyChange("endTime", oldEndTime, endTime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prdinfo)) {
            return false;
        }
        Prdinfo other = (Prdinfo) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "project.Prdinfo[ pid=" + pid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name = "tb1", catalog = "pro", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tb1.findAll", query = "SELECT t FROM Tb1 t")
    , @NamedQuery(name = "Tb1.findByRid", query = "SELECT t FROM Tb1 t WHERE t.rid = :rid")
    , @NamedQuery(name = "Tb1.findByFid", query = "SELECT t FROM Tb1 t WHERE t.fid = :fid")
    , @NamedQuery(name = "Tb1.findBySub", query = "SELECT t FROM Tb1 t WHERE t.sub = :sub")
    , @NamedQuery(name = "Tb1.findBySid", query = "SELECT t FROM Tb1 t WHERE t.sid = :sid")})
public class Tb1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport;

    private static final long serialVersionUID = 1L;
    @Column(name = "rid")
    private String rid;
    @Column(name = "fid")
    private Integer fid;
    @Id
    @Basic(optional = false)
    @Column(name = "sub")
    private String sub;
    @Column(name = "sid")
    private String sid;
    public Tb1() {
        this.changeSupport = new PropertyChangeSupport(this);
    }
    public Tb1(String sub) {
        this.changeSupport = new PropertyChangeSupport(this);
        this.sub = sub;
    }
    public String getRid() {
        return rid;
    }
    public void setRid(String rid) {
        String oldRid = this.rid;
        this.rid = rid;
        changeSupport.firePropertyChange("rid", oldRid, rid);
    }
    public Integer getFid() {
        return fid;
    }
    public void setFid(Integer fid) {
        Integer oldFid = this.fid;
        this.fid = fid;
        changeSupport.firePropertyChange("fid", oldFid, fid);
    }
    public String getSub() {
        return sub;
    }
    public void setSub(String sub) {
        String oldSub = this.sub;
        this.sub = sub;
        changeSupport.firePropertyChange("sub", oldSub, sub);
    }
    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        String oldSid = this.sid;
        this.sid = sid;
        changeSupport.firePropertyChange("sid", oldSid, sid);
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sub != null ? sub.hashCode() : 0);
        return hash;
    }
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tb1)) {
            return false;
        }
        Tb1 other = (Tb1) object;
        return !((this.sub == null && other.sub != null) || (this.sub != null && !this.sub.equals(other.sub)));
    }
    @Override
    public String toString() {
        return "project.Tb1[ sub=" + sub + " ]";
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    } 
}

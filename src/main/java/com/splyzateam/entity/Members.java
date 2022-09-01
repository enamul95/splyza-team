
package com.splyzateam.entity;
import javax.persistence.*;

@Entity
@Table(name = "member")
public class Members {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long administrators;
    private Long editors;
    private Long managers;
    private Long members;
    private Long supporters;
    private Long total;

    public Long getAdministrators() {
        return administrators;
    }

    public void setAdministrators(Long administrators) {
        this.administrators = administrators;
    }

    public Long getEditors() {
        return editors;
    }

    public void setEditors(Long editors) {
        this.editors = editors;
    }

    public Long getManagers() {
        return managers;
    }

    public void setManagers(Long managers) {
        this.managers = managers;
    }

    public Long getMembers() {
        return members;
    }

    public void setMembers(Long members) {
        this.members = members;
    }

    public Long getSupporters() {
        return supporters;
    }

    public void setSupporters(Long supporters) {
        this.supporters = supporters;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}

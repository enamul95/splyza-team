
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

        if(administrators == null){
            administrators = 0l;
        }
        return administrators;
    }

    public void setAdministrators(Long administrators) {
        this.administrators = administrators;
    }

    public Long getEditors() {
        if(editors == null){
            editors = 0l;
        }
        return editors;
    }

    public void setEditors(Long editors) {
        this.editors = editors;
    }

    public Long getManagers() {
        if(managers == null){
            managers = 0l;
        }
        return managers;
    }

    public void setManagers(Long managers) {
        this.managers = managers;
    }

    public Long getMembers() {
        if(members == null){
            members = 0l;
        }
        return members;
    }

    public void setMembers(Long members) {
        this.members = members;
    }

    public Long getSupporters() {
        if(supporters == null){
            supporters = 0l;
        }
        return supporters;
    }

    public void setSupporters(Long supporters) {
        this.supporters = supporters;
    }

    public Long getTotal() {
        if(total == null){
            total = 0l;
        }
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

}

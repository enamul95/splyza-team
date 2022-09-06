
package com.splyzateam.entity;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class TeamsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long team_id;

    @Column(unique = true)
    private String id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id", referencedColumnName = "id")
    private Members members;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "plan_id", referencedColumnName = "id")
    private Plan plan;

    public String getId() {
        if(id == null){
            id = "";
        }
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Members getMembers() {
        if(members == null){
            members = new Members();
        }
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }

    public Plan getPlan() {
        if(plan == null){
            plan = new Plan();
        }
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

}

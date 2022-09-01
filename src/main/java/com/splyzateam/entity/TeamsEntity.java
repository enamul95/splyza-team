
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
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Members getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

}

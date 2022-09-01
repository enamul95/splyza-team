
package com.splyzateam.entity;

import javax.persistence.*;

@Entity
@Table(name = "plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long memberLimit;
    private Long supporterLimit;

    public Long getMemberLimit() {
        return memberLimit;
    }

    public void setMemberLimit(Long memberLimit) {
        this.memberLimit = memberLimit;
    }

    public Long getSupporterLimit() {
        return supporterLimit;
    }

    public void setSupporterLimit(Long supporterLimit) {
        this.supporterLimit = supporterLimit;
    }

}

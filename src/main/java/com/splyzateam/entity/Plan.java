
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
        if(memberLimit == null){
            memberLimit = 0l;
        }
        return memberLimit;
    }

    public void setMemberLimit(Long memberLimit) {
        this.memberLimit = memberLimit;
    }

    public Long getSupporterLimit() {
        if(supporterLimit == null){
            supporterLimit = 0l;
        }
        return supporterLimit;
    }

    public void setSupporterLimit(Long supporterLimit) {
        this.supporterLimit = supporterLimit;
    }

}

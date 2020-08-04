package com.skcc.nxm.core.domain.entity.agree;

import lombok.Cleanup;
import lombok.CustomLog;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter @Setter
public class AgreeVersionInfoAuthority {

    @Id
    @GeneratedValue
    @Column(name="agr_auth_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "agr_ver_cd")
    private AgreeVersion agreeVersion;

    private String itemCode;

}

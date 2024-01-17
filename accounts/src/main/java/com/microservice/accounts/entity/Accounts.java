package com.microservice.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter @Setter@ToString @AllArgsConstructor @NoArgsConstructor
public class Accounts extends BaseEntity{

    private Long customerId;

    @Id
    @Column(name="account_number")
    private Long accountNumber;

    private String accountType;

    private String branchAddress;

    @Column(name="mobile_number")
    private String mobileNumber;
}

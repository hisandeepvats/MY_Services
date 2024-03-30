package com.sandeep.cards.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name="cards")
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class Cards extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @Column(name="card_id")
    private Long cardId;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="card_number")
    private String cardNumber;

    @Column(name="card_type")
    private String cardType;

    @Column(name="total_limit")
    private int totalLimit;

    @Column(name="amount_used")
    private int amountUsed;

    @Column(name="available_amount")
    private int availableAmount;


}

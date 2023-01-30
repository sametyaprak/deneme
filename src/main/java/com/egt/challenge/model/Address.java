package com.egt.challenge.model;

import lombok.*;
import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name="person_id", nullable=false)
    private Person person;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipCode;
}

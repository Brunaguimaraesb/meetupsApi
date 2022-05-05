package com.womakerscode.microservicemeetup.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Meetup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String event;

    @JoinColumn(name = "id_registration")
    @ManyToOne
    private Registration registration; // MUITOS MEETUPS PARA 1 REGISTRO - REGISTRO SÓ ODE IR EM UM MEETUP

    @Column
    private String meetupDate;

    @Column
    private Boolean registered;
}

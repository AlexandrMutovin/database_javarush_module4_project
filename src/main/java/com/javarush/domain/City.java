package com.javarush.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "city")
public class City {
    @Id
    private Long id;
    private String name;

    @Column(name = "country_id")
    private Integer countryId;

    private String district;
    private Integer population;
}


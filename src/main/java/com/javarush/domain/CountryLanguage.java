package com.javarush.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "country_language")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountryLanguage {
    @Id
    private Integer id;
    @Column(name = "country_id")
    private Integer countryId;
    private String language;
    @Column(name = "is_official")
    private byte isOfficial;
    private Double percentage;

}

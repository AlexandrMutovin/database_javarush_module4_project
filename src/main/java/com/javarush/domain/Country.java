package com.javarush.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.print.attribute.standard.MediaSize;
import java.util.Set;

@Entity
@Table(name = "country")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Country {
    @Id
    private Long id;

    private String code;

    @Column(name = "code_2")
    private String code2;

    private String name;
    @Enumerated(EnumType.ORDINAL)
    private Integer continent;

    private String region;

    @Column(name = "surface_area")
    private Double surfaceArea;

    @Column(name = "indep_year")
    private Short indepYear;

    private Integer population;

    @Column(name = "life_expectancy")
    private Double lifeExpectancy;

    private Double gnp;

    @Column(name = "gnpo_id")
    private Double gnpoId;

    @Column(name = "local_name")
    private String localName;

    @Column(name = "government_from")
    private String governmentFrom;

    @Column(name = "head_of_state")
    private String headOfState;

    private Integer capital;

    @OneToOne
    @JoinColumn(name = "capital")
    private City city;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Set<CountryLanguage> languages;
}

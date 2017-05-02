package com.epam.petclinic.clinic.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Animal entity.
 *
 * Date: 4/12/2017
 *
 * @author Stanislau Halauniou
 */
@Entity
@Table(name = "animal")
@EqualsAndHashCode
@ToString
public class Animal implements Serializable {

    @Id
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

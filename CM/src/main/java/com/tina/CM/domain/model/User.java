package com.tina.CM.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_user")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User extends BaseEntity {
    @Column(name = "c_name", length = 50)
    private String name;
}

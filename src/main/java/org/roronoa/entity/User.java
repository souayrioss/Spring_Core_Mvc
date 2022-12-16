package org.roronoa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id ;
    @Column(name = "uuid_user",length = 60,nullable = false,unique = true)
    private String uuid;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false , unique = true)
    private String email;
    @Column( nullable = false )
    private String password;
    @Column( nullable = false , unique = true)
    private String phone;
    @Enumerated(EnumType.STRING)
    private  RoleEnum role;


    public enum RoleEnum{
        SUPPLIER ,
        CLIENT
    }

}

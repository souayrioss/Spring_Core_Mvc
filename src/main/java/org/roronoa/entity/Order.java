package org.roronoa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id ;
    @Column(name = "reference",length = 60,nullable = false,unique = true)
    private String reference;
    @Column(name = "client")
    @ManyToOne
    private Client client;
}

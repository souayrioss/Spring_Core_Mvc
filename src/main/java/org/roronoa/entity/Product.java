package org.roronoa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "reference",length = 20,nullable = false,unique = true)
    private String reference;
    @Column(name = "title",nullable = false,unique = true)
    private String title;
    @Column(name = "description" , nullable = false)
    private String description;
    @Column(name = "initial_price" , nullable = false)
    private float initialPrice ;
    @Column(name = "quantity" , nullable = false)
    private int quantity;
    @ManyToOne(cascade = CascadeType.ALL)
    private Stock stock;

    public Product(String reference, String title, String description, float initialPrice, int quantity, Stock stock) {
        this.reference = reference;
        this.title = title;
        this.description = description;
        this.initialPrice = initialPrice;
        this.quantity = quantity;
        this.stock = stock;
    }

}

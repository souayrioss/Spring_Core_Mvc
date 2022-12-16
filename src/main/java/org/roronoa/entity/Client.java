package org.roronoa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Table(name = "client")
public class Client extends User{

    @OneToMany(mappedBy = "client")
    private List<Order> orders;

    public Client() {
        setRole(RoleEnum.CLIENT);
    }
}

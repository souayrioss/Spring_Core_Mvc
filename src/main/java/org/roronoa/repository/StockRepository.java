package org.roronoa.repository;

import lombok.RequiredArgsConstructor;
import org.roronoa.entity.Stock;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository @RequiredArgsConstructor
public class StockRepository {
    private final HibernateTemplate hibernateTemplate ;

    @Transactional
    public void saveStock(Stock stock){
        hibernateTemplate.save(stock);
        System.out.println("Stock persisted successfuly");
    }

}

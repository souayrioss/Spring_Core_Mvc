package org.roronoa;

import lombok.RequiredArgsConstructor;
import org.roronoa.entity.Product;
import org.roronoa.entity.Stock;
import org.roronoa.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Configuration @Transactional @RequiredArgsConstructor
public class Config {
    private final ProductRepository productRepository ;

    @Bean
    void persistingProducts(){
        System.out.println("Test");
        Stock stock1 = new Stock("Stock1","Youssoufia","0643456637","stock1@gmail.ma","azerty");
        Stock stock2 = new Stock("Stock2","CasaBlanca","0532323434","stock2@gmail.com","azerty");

        Product product1 = new Product("MX 101 Z","Atlas Keyboard","Black Mechanical Keyboard ...",80.5f,30,stock1);
        Product product2 = new Product("AP X ","Iphone X Max","Black Iphone X Max 128 Gb storage and 4 Rom ...",55.8f,325,stock2);
        Product product3 = new Product("GB Y-3","GBL YouMusic Headphones","Brand new series of headphones comes with 4 colors ...",40f,950,stock1);

        productRepository.saveProduct(product1);
        productRepository.saveProduct(product2);
        productRepository.saveProduct(product3);



    }
}

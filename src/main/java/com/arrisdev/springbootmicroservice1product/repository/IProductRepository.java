package com.arrisdev.springbootmicroservice1product.repository;

import com.arrisdev.springbootmicroservice1product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author arrisDev
 * @date 09.01.2021
 * @time 18:16
 */
public interface IProductRepository extends JpaRepository<Product, Long>
{
}

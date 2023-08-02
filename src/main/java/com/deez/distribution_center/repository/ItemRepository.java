package com.deez.distribution_center.repository;

import com.deez.distribution_center.model.Item;
import com.deez.distribution_center.model.Item.Brand;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {
    List<Item> findByFashionableBrands(Brand brandFrom);
    List<Item> findByName(String name);
    List<Item> findByNameContainingAndBrand(String name, Brand brandFrom);

}
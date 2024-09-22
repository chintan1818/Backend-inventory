//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.inventory.backendinventory.Services;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.inventory.backendinventory.Models.InventoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface InventoryEntityService {
    InventoryEntity save( InventoryEntity inventoryentity);

    Optional<InventoryEntity> find(Long id);

    List<InventoryEntity> findAll();

    List<InventoryEntity> findByTitle(String inputstring);

    List<InventoryEntity> findByAuthor(String inputstring);

    List<InventoryEntity> findByGenre(String inputstring);

    Page<InventoryEntity> findAll(Pageable pageable);

    long count();

    List<InventoryEntity> findByDate(LocalDate date);

    Integer deleteByEntryId(int id);
}

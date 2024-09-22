//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.inventory.backendinventory.Repositories;

import com.inventory.backendinventory.Models.InventoryEntity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface InventoryEntityRepository extends JpaRepository<InventoryEntity, Long> {
    List<InventoryEntity> findByTitle( String inputstring);

    List<InventoryEntity> findByAuthor(String inputstring);

    List<InventoryEntity> findByGenre(String inputstring);

    List<InventoryEntity> findByPublicationDate(LocalDate date);

    Integer deleteByEntryId(int entryId);
}

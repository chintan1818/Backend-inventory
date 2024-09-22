//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.inventory.backendinventory.Services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.inventory.backendinventory.Models.InventoryEntity;
import com.inventory.backendinventory.Repositories.InventoryEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class InventoryEntityServiceImpl implements InventoryEntityService {
    @Autowired
    private InventoryEntityRepository inventoryentityRepository;

    public InventoryEntityServiceImpl() {
    }

    public InventoryEntity save( InventoryEntity inventoryentity) {
        return (InventoryEntity)this.inventoryentityRepository.save(inventoryentity);
    }

    public Optional<InventoryEntity> find(Long id) {
        return this.inventoryentityRepository.findById(id);
    }

    public List<InventoryEntity> findAll() {
        return this.inventoryentityRepository.findAll();
    }

    public List<InventoryEntity> findByTitle(String inputstring) {
        return this.inventoryentityRepository.findByTitle(inputstring);
    }

    public List<InventoryEntity> findByAuthor(String inputstring) {
        return this.inventoryentityRepository.findByAuthor(inputstring);
    }

    public List<InventoryEntity> findByGenre(String inputstring) {
        return this.inventoryentityRepository.findByGenre(inputstring);
    }

    public Page<InventoryEntity> findAll(Pageable pageable) {
        return this.inventoryentityRepository.findAll(pageable);
    }

    public long count() {
        return this.inventoryentityRepository.count();
    }

    public List<InventoryEntity> findByDate(LocalDate input) {
        return this.inventoryentityRepository.findByPublicationDate(input);
    }

    public Integer deleteByEntryId(int id) {
        return this.inventoryentityRepository.deleteByEntryId(id);
    }
}

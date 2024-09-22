//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.inventory.backendinventory.Controller;

import com.inventory.backendinventory.Models.InventoryEntity;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.inventory.backendinventory.Services.InventoryEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/"})
public class InventoryEntityController {
    @Autowired
    private InventoryEntityService inventoryentityService;

    public InventoryEntityController() {
    }

    @PostMapping(
            value = {"/inventoryentity"},
            consumes = {"application/json"}
    )
    public InventoryEntity save(@RequestBody InventoryEntity inventoryentity) {
        return this.inventoryentityService.save(inventoryentity);
    }

    @GetMapping({"/inventoryentity/{id}"})
    public Optional<InventoryEntity> getById(@PathVariable("id") Long id) {
        return this.inventoryentityService.find(id);
    }

    @GetMapping({"/findByTitle/{input}"})
    public List<InventoryEntity> getByTitle(@PathVariable("input") String input) {
        return this.inventoryentityService.findByTitle(input);
    }

    @GetMapping({"/findByAuthor/{input}"})
    public List<InventoryEntity> getByAuthor(@PathVariable("input") String input) {
        System.out.println(input);
        return this.inventoryentityService.findByAuthor(input);
    }

    @GetMapping({"/findByGenre/{input}"})
    public List<InventoryEntity> getByGenre(@PathVariable("input") String input) {
        return this.inventoryentityService.findByGenre(input);
    }

    @GetMapping({"/findByDate/{input}"})
    public List<InventoryEntity> getByDate(@PathVariable("input") LocalDate date) {
        return this.inventoryentityService.findByDate(date);
    }

    @GetMapping({"/inventoryentity"})
    public List<InventoryEntity> getAll() {
        return this.inventoryentityService.findAll();
    }

    @GetMapping({"/inventoryentity/count"})
    public long count() {
        return this.inventoryentityService.count();
    }

    @Transactional
    @DeleteMapping({"/inventoryentity/{id}"})
    public String deleteById(@PathVariable("id") int id) {
        this.inventoryentityService.deleteByEntryId(id);
        return "InventoryEntity with ID: " + id + " was deleted successfully.";
    }
}

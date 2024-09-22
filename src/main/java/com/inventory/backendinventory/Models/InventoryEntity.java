//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.inventory.backendinventory.Models;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(
        name = "inventory",
        schema = "Internship_Project"
)
public class InventoryEntity {
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Id
    @Column(
            name = "EntryID"
    )
    private int entryId;
    @Basic
    @Column(
            name = "Title"
    )
    private String title;
    @Basic
    @Column(
            name = "Author"
    )
    private String author;
    @Basic
    @Column(
            name = "Genre"
    )
    private String genre;
    @Basic
    @Column(
            name = "publication_date"
    )
    private Date publicationDate;
    @Basic
    @Column(
            name = "ISBN"
    )
    private String isbn;

    public InventoryEntity() {
    }

    public int getEntryId() {
        return this.entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            InventoryEntity that = (InventoryEntity)o;
            return this.entryId == that.entryId && Objects.equals(this.title, that.title) && Objects.equals(this.author, that.author) && Objects.equals(this.genre, that.genre) && Objects.equals(this.publicationDate, that.publicationDate) && Objects.equals(this.isbn, that.isbn);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.entryId, this.title, this.author, this.genre, this.publicationDate, this.isbn});
    }
}

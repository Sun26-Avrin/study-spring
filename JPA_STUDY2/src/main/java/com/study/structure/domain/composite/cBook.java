package com.study.structure.domain.composite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Index;
import javax.persistence.Table;

import com.study.structure.domain.composite.cBook.cBookPk;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(cBookPk.class)
@Table(indexes = @Index(name="c_book_idx", columnList = "idx"))
public class cBook {
    @Id private String author;
    @Id private String name;
    private String detail;
    private Integer idx;

    public cBook(cBookPk pk){
        this.author = pk.getAuthor();
        this.name= pk.getName();
    }


    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Getter
    public static class cBookPk implements Serializable{
        private String name;
        private String author;
         
    }
}

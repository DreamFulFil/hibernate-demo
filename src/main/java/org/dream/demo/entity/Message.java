package org.dream.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "MESSAGE")
public class Message {
    @Id
    @GeneratedValue
    private Long id;

    private String text;

}

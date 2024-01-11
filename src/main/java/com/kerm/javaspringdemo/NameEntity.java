package com.kerm.javaspringdemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity class for storing names using Java Persistence API (JPA).
 */
@Entity
@Table(name = "names")
public class NameEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "name")
  private String name;

  // Default constructor required by JPA
  protected NameEntity() {}

  /**
   * Constructs a new NameEntity with the given name.
   * @param name The name to be stored.
   */
  public NameEntity(String name) {
    this.name = name;
  }

  /**
   * Gets the ID of the NameEntity.
   * @return The ID.
   */
  public Integer getId() {
    return id;
  }

  /**
   * Gets the name stored in the NameEntity.
   * @return The name.
   */
  public String getName() {
    return name;
  }

  /**
   * Returns a string representation of the NameEntity.
   * @return A formatted string containing the id and name.
   */
  @Override
  public String toString() {
    return String.format("Name[id=%d, name='%s']", id, name);
  }
}
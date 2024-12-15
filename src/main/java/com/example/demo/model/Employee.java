package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name="employees")
public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 @Setter
 @Getter
 @Column(name = "first_name", nullable = false)
 private String firstName;
 @Setter
 @Getter
 @Column(name = "last_name",nullable = false)
 private String lastName;
 @Setter
 @Getter
 @Column(name = "email_id",nullable = false)
 private String email;

 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

}

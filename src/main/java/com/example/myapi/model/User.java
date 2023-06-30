package com.example.myapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    private long id;
    private String username;
    private String password;
 
    public User() {
    }
 
    public User(String username, String password, String isbn) {
         this.username = username;
         this.password = password;
    }
 
    @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
            return id;
        }
        public void setId(long id) {
            this.id = id;
        }
 
    @Column(name = "username", nullable = false)
        public String getUsername() {
            return username;
        }
        public void setUsername(String username) {
            this.username = username;
        }
 
    @Column(name = "password", nullable = false)
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
 
}
package org.example.studentmanagement;

public record User(int id,
                   String name,
                   String email,
                   boolean active) {
}

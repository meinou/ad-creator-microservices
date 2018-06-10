package com.example.usersapi;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="USER_NAME")
    public String userName;

    @Column(name = "EMAIL")
    public String email;

    @Column(name = "PASSWORD")
    public String password;

    @Column(name = "IS_ADMIN")
    public boolean isAdmin;
}

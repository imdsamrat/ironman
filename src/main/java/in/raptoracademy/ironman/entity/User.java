package in.raptoracademy.ironman.entity;

import lombok.Data;

import javax.persistence.*;

@Entity()
@Table(name = "userDetails")
@Data
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;
}

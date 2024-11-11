package project.allmuniz.relationshipapp.entities;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project.allmuniz.relationshipapp.dtos.ProfileRequestDto;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private Date birthday;
    @Column(nullable = false)
    private String address;

    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;


    public ProfileEntity(ProfileRequestDto profile) {
        this.name= profile.name();
        this.phone= profile.phone();
        this.birthday= profile.birthday();
        this.address= profile.address();
        this.email= profile.email();
        this.password= profile.password();
    }
}

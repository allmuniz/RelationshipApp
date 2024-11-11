package project.allmuniz.relationshipapp.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.allmuniz.relationshipapp.dtos.ProfileRequestDto;
import project.allmuniz.relationshipapp.dtos.ProfileResponseDto;
import project.allmuniz.relationshipapp.entities.ProfileEntity;
import project.allmuniz.relationshipapp.repositories.ProfileRepository;

import java.time.LocalDate;
import java.time.Period;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public ResponseEntity<ProfileResponseDto> createProfile(ProfileRequestDto profile) {
        checkAge(profile.birthday());
        ProfileEntity saveProfile = new ProfileEntity(profile);
        profileRepository.save(saveProfile);
        return new ResponseEntity<>(new ProfileResponseDto(saveProfile.getName()), HttpStatus.CREATED);
    }

    public void checkAge(LocalDate birthDate) {
        int age = Period.between(birthDate, LocalDate.now()).getYears();
        if (age < 18) {
            throw new IllegalArgumentException("A idade mínima é 18 anos.");
        }
    }
}

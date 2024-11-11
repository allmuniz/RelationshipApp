package project.allmuniz.relationshipapp.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import project.allmuniz.relationshipapp.dtos.ProfileRequestDto;
import project.allmuniz.relationshipapp.dtos.ProfileResponseDto;
import project.allmuniz.relationshipapp.entities.ProfileEntity;
import project.allmuniz.relationshipapp.repositories.ProfileRepository;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public ResponseEntity<ProfileResponseDto> createProfile(ProfileRequestDto profile) {
        ProfileEntity saveProfile = new ProfileEntity(profile);
        profileRepository.save(saveProfile);
        return new ResponseEntity<>(new ProfileResponseDto(saveProfile.getName()), HttpStatus.CREATED);
    }
}

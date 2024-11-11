package project.allmuniz.relationshipapp.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.allmuniz.relationshipapp.dtos.ProfileRequestDto;
import project.allmuniz.relationshipapp.dtos.ProfileResponseDto;
import project.allmuniz.relationshipapp.service.ProfileService;

@RestController
@RequestMapping("/profile")
@Tag(name = "Profiles", description = "Gerenciamento dos profiles")
public class ProfileController {

    private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @PostMapping("/")
    @Operation(description = "Insira os dados para criar um perfil",
            summary = "Criação de Perfil")
    public ResponseEntity<ProfileResponseDto> createProfile(@RequestBody ProfileRequestDto profile) {
        return profileService.createProfile(profile);
    }
}

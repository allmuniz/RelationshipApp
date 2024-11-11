package project.allmuniz.relationshipapp.dtos;

import java.time.LocalDate;

public record ProfileRequestDto(
        String name,
        String phone,
        LocalDate birthday,
        String address,
        String email,
        String password
) {
}

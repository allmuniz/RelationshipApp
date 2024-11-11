package project.allmuniz.relationshipapp.dtos;

import java.util.Date;

public record ProfileRequestDto(
        String name,
        String phone,
        Date birthday,
        String address,
        String email,
        String password
) {
}

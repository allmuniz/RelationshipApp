package project.allmuniz.relationshipapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.allmuniz.relationshipapp.entities.ProfileEntity;

public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {
}

package za.ac.nwu.za.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.nwu.domain.persistence.Miles;

@Repository
public interface MemberMilesRepository extends JpaRepository<Miles,Integer> {
}

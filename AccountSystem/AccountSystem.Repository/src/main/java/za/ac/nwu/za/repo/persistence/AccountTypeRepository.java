package za.ac.nwu.za.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import za.ac.nwu.domain.persistence.AccountType;

@Repository
@Transactional
@EnableJpaRepositories
public interface AccountTypeRepository extends JpaRepository<AccountType, Integer> {

}

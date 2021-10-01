package za.ac.nwu.za.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.nwu.ac.domain.persistence.AccountTransactionDetails;

public interface AccountTransactionDetailsRepository extends JpaRepository<AccountTransactionDetails, Long> {
}

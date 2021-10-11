package za.ac.nwu.ac.translator.logic.flow;

import org.springframework.stereotype.Component;
import za.ac.nwu.domain.dto.AccountTypeDto;
import za.ac.nwu.domain.persistence.AccountType;

import java.util.List;

@Component
public interface FetchAccountTypeFlow {

    List<AccountTypeDto> getAllAccountTypes();

    AccountTypeDto getAccountTypeByMnemonic(String mnemonic);

    AccountType getAccountTypeDbEntityByMnemonic(String accountTypeMnemonic);

}

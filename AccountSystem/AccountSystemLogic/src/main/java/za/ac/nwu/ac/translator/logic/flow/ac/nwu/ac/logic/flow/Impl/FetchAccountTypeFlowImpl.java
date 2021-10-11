package za.ac.nwu.ac.translator.logic.flow.ac.nwu.ac.logic.flow.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.translator.impl.AccountTypeTranslatorImpl;
import za.ac.nwu.ac.translator.logic.flow.FetchAccountTypeFlow;
import za.ac.nwu.domain.dto.AccountTypeDto;
import za.ac.nwu.domain.persistence.AccountType;

import java.util.List;


@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {

    @Autowired
    AccountTypeTranslatorImpl accountTypeTranslator;


    @Override
    public List<AccountTypeDto> getAllAccountTypes(){
        return accountTypeTranslator.getAllAccountTypes();
    }

    @Override
    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic) {
        return null;
    }

    @Override
    public AccountType getAccountTypeDbEntityByMnemonic(String accountTypeMnemonic) {
        return null;
    }

}

package za.ac.nwu.ac.logic.flow.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
//import za.ac.nwu.ac.translator.AccountTypeTranslator;
import za.ac.nwu.ac.logic.flow.FetchAccountTypeFlow;
import za.ac.nwu.ac.translator.impl.AccountTypeTranslatorImpl;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {

    private final AccountTypeTranslatorImpl accountTypeTranslator;

    @Autowired
    public FetchAccountTypeFlowImpl(AccountTypeTranslatorImpl accountTypeTranslator){
        this.accountTypeTranslator = accountTypeTranslator;
    }
    @Override
    public List<AccountTypeDto> getAllAccountTypes(){
        return accountTypeTranslator.getAllAccountTypes();
    }


    @Override
    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic){
        return accountTypeTranslator.getAccountTypeByMnemonicNativeQuery(mnemonic);
    }

    public boolean methodToTest(){
        return true;
    }
}

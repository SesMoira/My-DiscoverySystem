package za.ac.nwu.ac.translator.impl;

import za.ac.nwu.ac.domain.persistence.AccountTransactionDetails;
import za.ac.nwu.ac.translator.AccountTransactionDetailsTranslator;
import za.ac.nwu.ac.translator.AccountTransactionTranslator;
import za.ac.nwu.za.repo.persistence.AccountTransactionDetailsRepository;

public class AccountTransactionDetailsTranslatorImpl implements AccountTransactionDetailsTranslator {
    private AccountTransactionDetailsRepository repo;

    public AccountTransactionDetailsTranslatorImpl(AccountTransactionDetailsRepository accountTransactionDetailsRepository) {
        this.repo  = accountTransactionDetailsRepository;
    }

    @Override
    public AccountTransactionDetails save(AccountTransactionDetails accountTransactionDetails) {
        try{
            return repo.save(accountTransactionDetails);
        }catch (Exception e){
            throw new RuntimeException("Unable to Save to the DB", e);
        }
    }
}

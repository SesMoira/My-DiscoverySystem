package za.ac.nwu.ac.translator.logic.flow.ac.nwu.ac.logic.flow.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.nwu.ac.translator.impl.MemberMilesTranslatorImpl;
import za.ac.nwu.ac.translator.logic.flow.CreateMemberMiles;
import za.ac.nwu.domain.dto.MilesDto;

public class CreateMemberMilesImpl implements CreateMemberMiles {

    @Autowired
    MemberMilesTranslatorImpl memberMilesTranslator;

    @Override
    public MilesDto create(MilesDto milesDto) {
        return memberMilesTranslator.createMiles(milesDto);
    }
}

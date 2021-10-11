package za.ac.nwu.ac.translator.logic.flow.ac.nwu.ac.logic.flow.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import za.ac.nwu.ac.translator.impl.MemberMilesTranslatorImpl;
import za.ac.nwu.ac.translator.logic.flow.ModifyMemberMiles;
import za.ac.nwu.domain.dto.MilesDto;

public class ModifyMemberMilesImpl implements ModifyMemberMiles {
    @Autowired
    MemberMilesTranslatorImpl memberMilesTranslator;

    @Override
    public MilesDto deleteMiles(int memberId) {
        return memberMilesTranslator.deleteMiles(memberId);
    }
}

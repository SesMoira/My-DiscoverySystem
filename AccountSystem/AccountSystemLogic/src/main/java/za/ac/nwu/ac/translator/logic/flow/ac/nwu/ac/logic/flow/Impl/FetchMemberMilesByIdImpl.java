package za.ac.nwu.ac.translator.logic.flow.ac.nwu.ac.logic.flow.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.nwu.ac.translator.impl.MemberMilesTranslatorImpl;
import za.ac.nwu.ac.translator.logic.flow.FetchMemberMilesById;
import za.ac.nwu.domain.dto.MilesDto;

public class FetchMemberMilesByIdImpl implements FetchMemberMilesById {

    private final Logger LOGGER = LoggerFactory.getLogger(FetchMemberMilesByIdImpl.class);

    @Autowired
    MemberMilesTranslatorImpl memberMilesTranslator;

    public MilesDto getMilesById(int memberId) {
        LOGGER.info("inside FetchMemberMilesByIdImpl to call translator");
        return memberMilesTranslator.getMilesById(memberId);
    }
}

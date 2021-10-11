package za.ac.nwu.ac.translator.logic.flow;

import za.ac.nwu.domain.dto.MilesDto;

public interface FetchMemberMilesById {

    MilesDto getMilesById(int memberId);

}

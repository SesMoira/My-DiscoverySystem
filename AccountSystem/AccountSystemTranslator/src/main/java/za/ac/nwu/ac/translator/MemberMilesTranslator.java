package za.ac.nwu.ac.translator;

import za.ac.nwu.domain.dto.MilesDto;

public interface MemberMilesTranslator {

   MilesDto getMilesById(int memberId);

   MilesDto createMiles(MilesDto milesDto);

   MilesDto deleteMiles(int memberId);

}

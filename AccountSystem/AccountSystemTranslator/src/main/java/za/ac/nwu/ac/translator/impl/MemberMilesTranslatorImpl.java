package za.ac.nwu.ac.translator.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.nwu.ac.translator.MemberMilesTranslator;

import za.ac.nwu.domain.dto.MilesDto;
import za.ac.nwu.domain.persistence.Miles;
import za.ac.nwu.za.repo.persistence.MemberMilesRepository;

import java.util.Optional;

public class MemberMilesTranslatorImpl implements MemberMilesTranslator {

    private final Logger LOGGER = LoggerFactory.getLogger(MemberMilesTranslatorImpl.class);

    @Autowired
    MemberMilesRepository memberMilesRepository;

    @Override
    public MilesDto getMilesById(int memberId) {

        LOGGER.info("contacting database to get Miles");

        try {

            Optional<Miles> miles = memberMilesRepository.findById(memberId);
            return new MilesDto(miles);

        } catch (Exception e) {
            throw new RuntimeException("Unable to read from DB", e);
        }
    }

    @Override
    public MilesDto createMiles(MilesDto milesDto) {
        try {
            //  Miles miles = memberMilesRepository.save(milesDto.getMiles());
            //   return new MilesDto(Optional.of(miles));
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Unable to save to DB", e);
        }
    }

    @Override
    public MilesDto deleteMiles(int memberId) {
        try {
            //    Miles miles = memberMilesRepository.deleteById(memberId);
            return null;
        } catch (Exception e) {
            throw new RuntimeException("Unable to save to DB", e);
        }
    }
}




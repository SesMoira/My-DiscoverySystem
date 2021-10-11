package za.ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.ac.translator.logic.flow.CreateMemberMiles;
import za.ac.nwu.ac.translator.logic.flow.ModifyMemberMiles;
import za.ac.nwu.ac.translator.logic.flow.ac.nwu.ac.logic.flow.Impl.CreateMemberMilesImpl;
import za.ac.nwu.ac.translator.logic.flow.ac.nwu.ac.logic.flow.Impl.FetchMemberMilesByIdImpl;
import za.ac.nwu.ac.translator.logic.flow.ac.nwu.ac.logic.flow.Impl.ModifyMemberMilesImpl;
import za.ac.nwu.domain.dto.MilesDto;
import za.ac.nwu.domain.persistence.Miles;
import za.ac.nwu.domain.service.GeneralResponse;

import java.util.List;

@RestController
@RequestMapping("MemberController")
public class MemberTypeController {

    private final Logger LOGGER = LoggerFactory.getLogger(MemberTypeController.class);

    FetchMemberMilesByIdImpl fetchMemberMilesById = new FetchMemberMilesByIdImpl();

    CreateMemberMilesImpl createMemberMiles = new CreateMemberMilesImpl();

    ModifyMemberMilesImpl modifyMemberMiles = new ModifyMemberMilesImpl();





    @GetMapping("GetMilesById{memberId}")
    @ApiOperation(value = "Return all", notes = "Return list")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account Types Returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class)})

    public ResponseEntity<GeneralResponse<List<Miles>>> getMemberById(@PathVariable int memberId)
    {
        LOGGER.info("inside getMemberById method of MemberTypeController");
        List<Miles> miles = (List<Miles>) fetchMemberMilesById.getMilesById(memberId);

        return (ResponseEntity<GeneralResponse<List<Miles>>>) miles;
    }

    @PostMapping("")
    @ApiOperation(value = "add new miles", notes = "Creates accountType In DB")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Created Successfully", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class)})

    public ResponseEntity<GeneralResponse<MilesDto>> create(
            @ApiParam(value = "Request Body to create new AccountType",
                    required = true)
            @RequestBody MilesDto milesDto) {
        MilesDto Response = createMemberMiles.create(milesDto);
        GeneralResponse<MilesDto> response = new GeneralResponse<>(true, Response);

        LOGGER.info("inside create method of MemberTypeController");
        return new ResponseEntity<>(response, HttpStatus.CREATED);

    }
    @DeleteMapping("{MemberId}")
    @ApiOperation(value = "Member should delete miles from Account", notes = "Fetches corresponding Miles to given MemberId")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "AccountTypeDeleted"),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Resource Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class),
    })
    public ResponseEntity<GeneralResponse<MilesDto>> deleteAccountType(
            @ApiParam(value = "TransactionId that identifies TransactionId Uniquely",
                    example = "MILES",
                    name = "TransactionId",
                    required = true)
            @PathVariable("memberId") final int memberId){

        LOGGER.info("inside deleteAccountType method of MemberTypeController");
        MilesDto miles = modifyMemberMiles.deleteMiles(memberId);
        GeneralResponse<MilesDto> response = new GeneralResponse<>(true, miles);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }



}

package za.ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.translator.logic.flow.ac.nwu.ac.logic.flow.Impl.FetchAccountTypeFlowImpl;
import za.ac.nwu.domain.dto.AccountTypeDto;

import za.ac.nwu.domain.service.GeneralResponse;

import java.util.List;

@RestController
@RequestMapping("account-type")
public class AccountTypeController {

    private final Logger LOGGER = LoggerFactory.getLogger(AccountTypeController.class);

    FetchAccountTypeFlowImpl  fetchAccountTypeFlow = new FetchAccountTypeFlowImpl();

    @GetMapping("Controller Test")
    public String helloWorld()
    {
        return "Controller is Working";
    }

    @GetMapping("All")
    @ApiOperation(value = "Gets all the account", notes = "Return list")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Account Types Returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class)})

    public ResponseEntity<GeneralResponse<List<AccountTypeDto>>> getAll()
    {
        List<AccountTypeDto> accountTypes = fetchAccountTypeFlow.getAllAccountTypes();

        LOGGER.info("inside getAll method of AccountTypeController");

        GeneralResponse<List<AccountTypeDto>> response = new GeneralResponse<>(true, accountTypes);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}

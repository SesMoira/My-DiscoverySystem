package za.ac.nwu.ac.web.sb.controller;
/*
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import za.ac.nwu.ac.translator.logic.flow.ac.nwu.ac.logic.flow.Impl.FetchMemberMilesByIdImpl;
import za.ac.nwu.domain.persistence.Miles;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(MemberTypeController.class)
class MemberTypeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FetchMemberMilesByIdImpl fetchMemberMilesById;

    private Miles miles;

    @BeforeEach
    void setUp(){

        miles = Miles.builder()
                 .idMiles(100)
                 .date("2021/06/18")
                 .idMember(001)
                 .reward(1000)
                 .build();
    }

    @Test
    void getMemberById() {
  Mockito.when(fetchMemberMilesById.getMilesById(001)).
                 thenReturn(miles);

MockMvc.perform(get(urlTemplate:"/account-system/mvc/MemberController/001")
.contentType(MediaType.Application_JSON))
.adExpect(jsonPath(expression"$.idMiles")).Value(department.getDepartmentName()));
    }

 */
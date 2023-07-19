package com.autoever.mycar.server.car.adapter.in.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.autoever.mycar.server.car.domain.code.CarCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getCarList() throws Exception {
        mockMvc.perform(get("/cars"))
                .andExpect(status().isOk());
    }

    @Test
    void getToolTips200() throws Exception {
        mockMvc.perform(get("/cars/model-filter?carCode=TC01"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void getToolTips400() throws Exception {
        mockMvc.perform(get("/cars/model-filter"))
                .andExpect(status().isBadRequest());
    }

    @Test
    void getTrims() throws Exception {
        mockMvc.perform(get("/cars/trims?carCode=TC01&engineId=4"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void getTrims400() throws Exception {
        mockMvc.perform(get("/cars/trims?carCode=TC01&engineId=5"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    @Test
    void getModelDetails() throws Exception {
        Long modelId = 1L;
        String url = "/cars/models/" + modelId + "/details";
        mockMvc.perform(get(url))
                .andExpect(status().isOk());
    }

    @Test
    void getModelList() throws Exception {
        CarCode carCode = CarCode.AT01;
        String url = "/cars/" + carCode + "/models";
        mockMvc.perform(get(url))
                .andExpect(status().isOk());
    }

    @Test
    void getTrimListByModelName() throws Exception {
        CarCode carCode = CarCode.AT01;
        /**
         * 자가용 가솔린 1.6 A/T
         * 자가용 LPG 1.6 A/T
         * 디젤 2WD A/T
         * 디젤 4WD A/T
         * 1.6 가솔린 터보 2WD DCT
         * 1.6 가솔린 터보 4WD DCT
         */
        String modelBasicName = "자가용 가솔린 1.6 A/T";
        String url = "/cars/" + carCode + "/trims?modelBasicName=" + modelBasicName;
        mockMvc.perform(get(url))
                .andExpect(status().isOk());
    }
}
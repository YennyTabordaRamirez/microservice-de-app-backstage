package com.appoiments.service.interfaces;

import com.appoiments.dto.AppoimentDto;
import com.appoiments.dto.TestDto;
import java.util.List;

public interface IAppoimentService {

    AppoimentDto newAppoiment(AppoimentDto appoimentDto);
    AppoimentDto getAppoimentById(int id);
    List<AppoimentDto> getAppoiment();
    AppoimentDto updateAppoiment(AppoimentDto appoimentDto);
    boolean deleteAppoiment(int id);
}

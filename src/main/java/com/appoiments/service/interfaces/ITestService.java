package com.appoiments.service.interfaces;

import com.appoiments.dto.TestDto;
import com.appoiments.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ITestService{

    TestDto newTest(TestDto testDto);
    TestDto getTestById(int id);
    List<TestDto> getTest();
    TestDto updateTest(TestDto testDto);
    boolean deleteTest(int id);
}

package com.appoiments.service;

import com.appoiments.dto.TestDto;
import com.appoiments.entity.TestEntity;
import com.appoiments.repository.ITestRepository;
import com.appoiments.service.interfaces.ITestService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TestServiceImpl implements ITestService {


    private ITestRepository iTestRepository;

    @Autowired
    public TestServiceImpl(ITestRepository iTestRepository) {
        this.iTestRepository = iTestRepository;
    }

    //Este método serà refactorizado
    @Override
    public TestDto newTest(TestDto testDto) {

        TestEntity testEntity = new TestEntity();

        testEntity.setTestName(testDto.getTestName());
        testEntity.setComments(testDto.getComments());
        testEntity = iTestRepository.save(testEntity);
        //testEntity.getTestName().toLowerCase() != testDto.getTestName().toLowerCase()
        //testEntity.getTestName().equalsIgnoreCase(testDto.getTestName()

        if (null != testEntity && testEntity.getId() > 0){
            ModelMapper modelMapper = new ModelMapper();

            testDto = modelMapper.map(testEntity, TestDto.class);

            return testDto;
        }
        return null;
    }

    @Override
    public TestDto getTestById(int id) {
        Optional<TestEntity> testEntity = iTestRepository.findById(id);

        return new TestDto(testEntity.get().getId(), testEntity.get().getTestName(),
                testEntity.get().getComments());

    }

    @Override
    public List<TestDto> getTest() {
        List<TestEntity> testEntity = (List<TestEntity>) iTestRepository.findAll();

        if(null !=  testEntity && !testEntity.isEmpty()){

            ModelMapper modelMapper = new ModelMapper();

            List<TestDto> testDto = (List<TestDto>) testEntity.stream()
                    .map(test -> modelMapper.map(test, TestDto.class))
                    .collect(Collectors.toList());

            return testDto;
        }
        return null;
    }

    @Override
    public TestDto updateTest(TestDto testDto) {
        if(null != testDto && testDto.getId() > 0){

            TestEntity  testEntity = iTestRepository.findById(testDto.getId()).get();
            testEntity.setTestName(testDto.getTestName());
            testEntity.setComments(testDto.getComments());

            if(null !=  testEntity){

                ModelMapper modelMapper = new ModelMapper();
                testEntity = iTestRepository.save(testEntity);
                testDto = modelMapper.map(testEntity, TestDto.class);
                return testDto;
            }
        }
        return null;
    }

    @Override
    public boolean deleteTest(int id) {
        if(iTestRepository.existsById(id)){
            Optional<TestEntity> testEntity = iTestRepository.findById(id);
            if(testEntity.isPresent()) {
                iTestRepository.deleteById(id);
                return true;
            }
        }
        return false;
    }
}

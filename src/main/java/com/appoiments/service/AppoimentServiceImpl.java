package com.appoiments.service;

import com.appoiments.dto.AppoimentDto;
import com.appoiments.entity.AppoimentEntity;
import com.appoiments.repository.IAppoimentRepository;
import com.appoiments.service.interfaces.IAppoimentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AppoimentServiceImpl implements IAppoimentService {

    private IAppoimentRepository IappoimentRepository;

    @Autowired
    public AppoimentServiceImpl(IAppoimentRepository IappoimentRepository) {
        this.IappoimentRepository = IappoimentRepository;
    }

    @Override
    public AppoimentDto newAppoiment(AppoimentDto appoimentDto) {

        AppoimentEntity appoimentEntity = new AppoimentEntity();

        appoimentEntity.setDateAppoiment(appoimentDto.getDateAppoiment());
        appoimentEntity.setHourAppoiment(appoimentDto.getHourAppoiment());
        appoimentEntity.setIdAffiliate(appoimentDto.getIdAffiliate());
        appoimentEntity.setIdTest(appoimentDto.getIdTest());

        appoimentEntity = IappoimentRepository.save(appoimentEntity);

        if (null != appoimentEntity && appoimentEntity.getId() > 0){
            ModelMapper modelMapper = new ModelMapper();

            appoimentDto = modelMapper.map(appoimentEntity, AppoimentDto.class);

            return appoimentDto;
        }
        return null;
    }

    @Override
    public AppoimentDto getAppoimentById(int id) {
        Optional<AppoimentEntity> appoimentEntity = IappoimentRepository.findById(id);

        return new AppoimentDto(appoimentEntity.get().getId(), appoimentEntity.get().getDateAppoiment(),
                appoimentEntity.get().getHourAppoiment(), appoimentEntity.get().getIdTest()
                ,appoimentEntity.get().getIdAffiliate());

    }

    @Override
    public List<AppoimentDto> getAppoiment() {
        List<AppoimentEntity> appoimentEntity = (List<AppoimentEntity>) IappoimentRepository.findAll();

        if(null !=  appoimentEntity && !appoimentEntity.isEmpty()){

            ModelMapper modelMapper = new ModelMapper();

            List<AppoimentDto> appoimentDto = (List<AppoimentDto>) appoimentEntity.stream()
                    .map(appoiment -> modelMapper.map(appoiment, AppoimentDto.class))
                    .collect(Collectors.toList());

            return appoimentDto;
        }
        return null;
    }

    @Override
    public AppoimentDto updateAppoiment(AppoimentDto appoimentDto) {
        if(null != appoimentDto && appoimentDto.getId() > 0){

            AppoimentEntity  appoimentEntity = IappoimentRepository.findById(appoimentDto.getId()).get();
            appoimentEntity.setDateAppoiment(appoimentDto.getDateAppoiment());
            appoimentEntity.setHourAppoiment(appoimentDto.getHourAppoiment());
            appoimentEntity.setIdAffiliate(appoimentDto.getIdAffiliate());
            appoimentEntity.setIdTest(appoimentDto.getIdTest());

            if(null !=  appoimentEntity){

                ModelMapper modelMapper = new ModelMapper();
                appoimentEntity = IappoimentRepository.save(appoimentEntity);
                appoimentDto = modelMapper.map(appoimentEntity, AppoimentDto.class);
                return appoimentDto;
            }
        }
        return null;
    }

    @Override
    public boolean deleteAppoiment(int id) {
        if(IappoimentRepository.existsById(id)){
            Optional<AppoimentEntity> appoimentEntity = IappoimentRepository.findById(id);
            if(appoimentEntity.isPresent()) {
                IappoimentRepository.deleteById(id);
                return true;
            }
        }
        return false;
    }
}

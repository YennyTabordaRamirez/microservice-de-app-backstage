package com.appoiments.service;

import com.appoiments.dto.AffiliateDto;
import com.appoiments.entity.AffiliateEntity;
import com.appoiments.repository.IAffiliateRepository;
import com.appoiments.service.interfaces.IAffiliateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AffiliateServiceImpl implements IAffiliateService {

    private IAffiliateRepository iAffiliateRepository;

    @Autowired
    public AffiliateServiceImpl(IAffiliateRepository affiliateRepository) {
        this.iAffiliateRepository = affiliateRepository;
    }

    @Override
    public AffiliateDto newAffiliate(AffiliateDto affiliateDto) {
        AffiliateEntity affiliateEntity = new AffiliateEntity();
        try {


            affiliateEntity.setFullName(affiliateDto.getFullName());
            affiliateEntity.setAge(affiliateDto.getAge());
            affiliateEntity.setEmail(affiliateDto.getEmail());

            affiliateEntity = iAffiliateRepository.save(affiliateEntity);

            if (null != affiliateEntity && affiliateEntity.getId() > 0){
                ModelMapper modelMapper = new ModelMapper();

                affiliateDto = modelMapper.map(affiliateEntity, AffiliateDto.class);

                return affiliateDto;
            }
        }
        catch (Exception e){
            return null;
        }
        return null;
    }

    @Override
    public AffiliateDto getAffiliateById(int id) {
        Optional<AffiliateEntity> affiliateEntity = iAffiliateRepository.findById(id);

        return new AffiliateDto(affiliateEntity.get().getId(), affiliateEntity.get().getFullName(),
                affiliateEntity.get().getAge(), affiliateEntity.get().getEmail());

    }

    @Override
    public List<AffiliateDto> getAllAffiliate() {
        List<AffiliateEntity> affiliateEntity = (List<AffiliateEntity>) iAffiliateRepository.findAll();

        if(null !=  affiliateEntity && !affiliateEntity.isEmpty()){

            ModelMapper modelMapper = new ModelMapper();

            List<AffiliateDto> affiliateDto = (List<AffiliateDto>) affiliateEntity.stream()
                    .map(affiliate -> modelMapper.map(affiliate, AffiliateDto.class))
                    .collect(Collectors.toList());

            return affiliateDto;
        }
        return null;
    }

    @Override
    public AffiliateDto updateAffiliate(AffiliateDto affiliateDto) {
        if(null != affiliateDto && affiliateDto.getId() > 0){

            AffiliateEntity  affiliateEntity = iAffiliateRepository.findById(affiliateDto.getId()).get();
            affiliateEntity.setFullName(affiliateDto.getFullName());
            affiliateEntity.setAge(affiliateDto.getAge());
            affiliateEntity.setEmail(affiliateDto.getEmail());

            if(null !=  affiliateEntity){

                ModelMapper modelMapper = new ModelMapper();
                affiliateEntity = iAffiliateRepository.save(affiliateEntity);
                affiliateDto = modelMapper.map(affiliateEntity, AffiliateDto.class);
                return affiliateDto;
            }
        }
        return null;
    }

    @Override
    public boolean deleteAffiliate(int id) {
        if(iAffiliateRepository.existsById(id)){
            Optional<AffiliateEntity> affiliateEntity = iAffiliateRepository.findById(id);
            if(affiliateEntity.isPresent()) {
                iAffiliateRepository.deleteById(id);
                return true;
            }
        }
        return false;
    }
}

package com.appoiments.service;

import com.appoiments.dto.MasterDto;
import com.appoiments.entity.AffiliateEntity;
import com.appoiments.repository.IAffiliateRepository;
import com.appoiments.repository.ITestRepository;
import com.appoiments.service.interfaces.IMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MasterServiceImpl implements IMasterService {

    private ITestRepository iTestRepository;
    private IAffiliateRepository iAffiliateRepository;

    @Autowired
    public MasterServiceImpl(ITestRepository iTestRepository, IAffiliateRepository iAffiliateRepository) {
        this.iTestRepository = iTestRepository;
        this.iAffiliateRepository = iAffiliateRepository;
    }

    @Override
    public List<MasterDto> getByDate(Date date) {
        return null;
    }

    @Override
    public MasterDto getByAffiliates(int idAffiliate) {
        return null;
    }

    private MasterDto findAppoimentByAffiliate(int idAffiliate){

        Optional<AffiliateEntity> affiliateEntity = iAffiliateRepository.findById(idAffiliate);

        if(null == affiliateEntity)
        return null;

        //MasterDto masterDto = createAppointmentMaster(affiliateEntity);
        //Query query = new Query();
        //query.(Criteria.where("idAffiliate").is(affiliate.getId()));

        return null;
    }

    private MasterDto createAppointmentMaster(Optional<AffiliateEntity> affiliateEntity) {

        MasterDto masterDto = new MasterDto();

        masterDto.setIdAffiliate(affiliateEntity.get().getId());
        masterDto.setAge(affiliateEntity.get().getAge());
        masterDto.setName(affiliateEntity.get().getFullName());
        masterDto.setEmail(affiliateEntity.get().getEmail());
        return masterDto;
    }
}

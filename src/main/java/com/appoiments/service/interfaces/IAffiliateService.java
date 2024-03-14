package com.appoiments.service.interfaces;

import com.appoiments.dto.AffiliateDto;
import java.util.List;

public interface IAffiliateService {

    AffiliateDto newAffiliate(AffiliateDto affiliateDto);
    AffiliateDto getAffiliateById(int id);
    List<AffiliateDto> getAllAffiliate();
    AffiliateDto updateAffiliate(AffiliateDto affiliateDto);
    boolean deleteAffiliate(int id);

}

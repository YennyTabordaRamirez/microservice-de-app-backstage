package com.appoiments.service.interfaces;

import com.appoiments.dto.MasterDto;
import java.util.Date;
import java.util.List;

public interface IMasterService {

    List<MasterDto> getByDate(Date date);
    MasterDto  getByAffiliates(int idAffiliate);
}

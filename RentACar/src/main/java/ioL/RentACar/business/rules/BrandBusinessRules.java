package ioL.RentACar.business.rules;

import ioL.RentACar.core.utilities.expections.BusinessException;
import ioL.RentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {

    private BrandRepository brandRepository;
    public void checkIfBrandNameExists(String name){
        if (this.brandRepository.existsByName(name)){
            throw new BusinessException("Brand is Already Exists");
        }
    }

}

package ioL.RentACar.business.concretes;

import ioL.RentACar.business.abstracts.BrandService;
import ioL.RentACar.business.requests.CreateBrandRequest;
import ioL.RentACar.business.requests.UpdateBrandRequest;
import ioL.RentACar.business.responses.GetAllBrandsResponse;
import ioL.RentACar.business.responses.GetByIdBrandResponse;
import ioL.RentACar.business.rules.BrandBusinessRules;
import ioL.RentACar.core.utilities.mapper.ModelMapperService;
import ioL.RentACar.dataAccess.abstracts.BrandRepository;
import ioL.RentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BrandManager implements BrandService {


    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    private BrandBusinessRules brandBusinessRules;

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands=brandRepository.findAll();

        List<GetAllBrandsResponse> brandsResponses=brands.stream()
                .map(brand -> this.modelMapperService.forResponse()
                .map(brands,GetAllBrandsResponse.class))
                .collect(Collectors.toList());


        return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        //Brand brand = new Brand();
        //brand.setName(createBrandRequest.getName());

        this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());

        Brand brand =this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);

        this.brandRepository.save(brand);

    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand=this.brandRepository.findById(id).orElseThrow();

        GetByIdBrandResponse response = this.modelMapperService.forResponse()
                .map(brand,GetByIdBrandResponse.class);

        return response;
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {

        Brand brand =this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);

        this.brandRepository.save(brand);
    }
}

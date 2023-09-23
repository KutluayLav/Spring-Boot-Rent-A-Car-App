package ioL.RentACar.business.abstracts;

import ioL.RentACar.business.requests.CreateBrandRequest;
import ioL.RentACar.business.requests.UpdateBrandRequest;
import ioL.RentACar.business.responses.GetAllBrandsResponse;
import ioL.RentACar.business.responses.GetByIdBrandResponse;
import ioL.RentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {

    List<GetAllBrandsResponse> getAll();

    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);

    void delete(int id);
    void update(UpdateBrandRequest updateBrandRequest);


}

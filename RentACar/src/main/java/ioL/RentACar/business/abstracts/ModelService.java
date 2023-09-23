package ioL.RentACar.business.abstracts;

import ioL.RentACar.business.requests.CreateBrandRequest;
import ioL.RentACar.business.requests.CreateModelRequest;
import ioL.RentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelsResponse> getAll();

    void add(CreateModelRequest createModelRequest);
}

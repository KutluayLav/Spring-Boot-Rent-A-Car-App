package ioL.RentACar.business.concretes;

import ioL.RentACar.business.abstracts.ModelService;
import ioL.RentACar.business.requests.CreateModelRequest;
import ioL.RentACar.business.responses.GetAllBrandsResponse;
import ioL.RentACar.business.responses.GetAllModelsResponse;
import ioL.RentACar.core.utilities.mapper.ModelMapperService;
import ioL.RentACar.dataAccess.abstracts.ModelRepository;
import ioL.RentACar.entities.concretes.Brand;
import ioL.RentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;
    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models=modelRepository.findAll();

        List<GetAllModelsResponse> modelsResponses=models.stream()
                .map(brand -> this.modelMapperService.forResponse()
                        .map(models,GetAllModelsResponse.class))
                .collect(Collectors.toList());


        return modelsResponses;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model =this.modelMapperService.forRequest().map(createModelRequest,Model.class);

        this.modelRepository.save(model);
    }

}

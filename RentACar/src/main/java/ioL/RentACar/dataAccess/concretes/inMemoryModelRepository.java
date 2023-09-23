package ioL.RentACar.dataAccess.concretes;

import ioL.RentACar.dataAccess.abstracts.ModelRepository;
import ioL.RentACar.entities.concretes.Model;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Repository
@NoArgsConstructor
public class inMemoryModelRepository implements ModelRepository {

    List<Model> models;

    @Override
    public List<Model> findAll() {
        return null;
    }

    @Override
    public List<Model> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Model> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Model> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Model entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Model> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Model> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Model> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Model> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Model> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Model> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Model> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Model getOne(Integer integer) {
        return null;
    }

    @Override
    public Model getById(Integer integer) {
        return null;
    }

    @Override
    public Model getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Model> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Model> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Model> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Model> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Model> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Model> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Model, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}

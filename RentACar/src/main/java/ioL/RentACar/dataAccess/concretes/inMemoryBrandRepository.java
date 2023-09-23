package ioL.RentACar.dataAccess.concretes;

import ioL.RentACar.dataAccess.abstracts.BrandRepository;
import ioL.RentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
@NoArgsConstructor
public class inMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    @Override
    public List<Brand> findAll() {
        return brands;
    }

    @Override
    public List<Brand> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Brand> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Brand> findAllById(Iterable<Integer> integers) {
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
    public void delete(Brand entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Brand> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Brand> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Brand> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Brand> findById(Integer integer) {
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
    public <S extends Brand> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Brand> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Brand> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Brand getOne(Integer integer) {
        return null;
    }

    @Override
    public Brand getById(Integer integer) {
        return null;
    }

    @Override
    public Brand getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Brand> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Brand> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Brand> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Brand> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Brand> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Brand> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Brand, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public  boolean existsByName(String name) {
        return false;
    }
}

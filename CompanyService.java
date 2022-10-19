package com.example.fullstackdeveloperchallenge.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class CompanyService implements CrudListener<Company> {

    private final CompanyRepository repository;

    @Override
    public Collection<Company> findAll() {
        return repository.findAll();
    }

    @Override
    public Company add(Company company) {
        return repository.save(company);
    }

    @Override
    public Company update(Company company) {
        return repository.save(company);
    }

    @Override
    public void delete(Company company) {
        repository.delete(company);
    }
}

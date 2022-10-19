package com.example.fullstackdeveloperchallenge.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class EmployeeService implements CrudListener<Employee> {

    private final EmployeeRepository repository;

    @Override
    public Collection<Employee> findAll() {
        return repository.findAll();
    }

    @Override
    public Employee add(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        repository.delete(employee);
    }
}

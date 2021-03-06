package io.lishman.springdata.jpa.repository;

import org.springframework.data.repository.RepositoryDefinition;

import io.lishman.springdata.jpa.domain.City;

@RepositoryDefinition(domainClass=City.class, idClass=Integer.class)
public interface CityRepository {

    public City findByName(String name);
    
}

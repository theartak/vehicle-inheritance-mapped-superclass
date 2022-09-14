package com.jambit.vehicleinheritancemappedsuperclass.repository;

import com.jambit.vehicleinheritancemappedsuperclass.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
}
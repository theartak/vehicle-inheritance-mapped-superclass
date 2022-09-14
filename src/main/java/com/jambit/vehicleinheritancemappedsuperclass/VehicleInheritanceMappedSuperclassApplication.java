package com.jambit.vehicleinheritancemappedsuperclass;

import com.jambit.vehicleinheritancemappedsuperclass.model.Tank;
import com.jambit.vehicleinheritancemappedsuperclass.model.Truck;
import com.jambit.vehicleinheritancemappedsuperclass.repository.TankRepository;
import com.jambit.vehicleinheritancemappedsuperclass.repository.TruckRepository;
import com.jambit.vehicleinheritancemappedsuperclass.repository.VehicleRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VehicleInheritanceMappedSuperclassApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(VehicleInheritanceMappedSuperclassApplication.class, args);
        VehicleRepository tankRepository = configurableApplicationContext.getBean(TankRepository.class);
        VehicleRepository truckRepository = configurableApplicationContext.getBean(TruckRepository.class);

        Tank myTank = new Tank("T-150", 5, 500);
        Truck myTruck = new Truck("200M", 2, 36, true);

        tankRepository.save(myTank);
        truckRepository.save(myTruck);

//        tankRepository.delete(myTank);
//        truckRepository.delete(myTruck);
    }

}

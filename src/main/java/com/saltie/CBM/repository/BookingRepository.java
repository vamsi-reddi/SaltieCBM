package com.saltie.CBM.repository;

import com.saltie.CBM.model.Booking;
import com.saltie.CBM.model.Cruise;
import com.saltie.CBM.model.Customer;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends Neo4jRepository<Booking, Long> {
//    List<Booking> findByCruiseName(String cruiseName);
//
//    List<Booking> findByCruiseId(Long id);

    //List<Booking> findAllByCustomer(Customer customer);

    List<Booking> findAllByCruise(Cruise temp);

    List<List<Booking>> findAllByCruiseCruiseName(String cruiseName);

    List<Booking> findAllByCustomerId(Long customerId);

    List<Booking> findAllByCruiseCruiseId(Long cruiseId);

}

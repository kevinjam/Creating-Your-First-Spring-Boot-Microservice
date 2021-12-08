package com.thinkdevs.ec.repo;

import com.thinkdevs.ec.domain.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Integer> {
}

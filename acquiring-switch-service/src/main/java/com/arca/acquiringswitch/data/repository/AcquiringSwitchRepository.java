package com.arca.acquiringswitch.data.repository;

import com.arca.framework.data.repository.DSLJpaRepository;
import com.arca.acquiringswitch.data.entities.AcquiringSwitch;
import org.springframework.stereotype.Repository;


@Repository
public interface AcquiringSwitchRepository extends DSLJpaRepository<AcquiringSwitch, String> {

}
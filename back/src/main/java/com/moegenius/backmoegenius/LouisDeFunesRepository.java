package com.moegenius.backmoegenius;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LouisDeFunesRepository extends JpaRepository<LouisDeFunes, Long> {
    
}

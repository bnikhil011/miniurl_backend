package com.repo;

import com.model.UrlData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlDataRepository extends JpaRepository<UrlData, String> {
     UrlData findOneByCode(String code);

}

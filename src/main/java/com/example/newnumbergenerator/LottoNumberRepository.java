package com.example.newnumbergenerator;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.newnumbergenerator.LottoNumber;

@Repository
public interface LottoNumberRepository extends CrudRepository<LottoNumber, Long> {

}

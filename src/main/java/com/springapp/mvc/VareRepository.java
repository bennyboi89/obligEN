package com.springapp.mvc;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


/**
 * Created by benny on 13.09.15.
 */
public interface VareRepository extends MongoRepository<Vare, String> {

    public Vare findByName(String navn);
    public List<Vare> findByPris(double pris);




}

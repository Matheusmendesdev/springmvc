package com.example.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.AbstractDao;
import com.example.demo.dao.CargoDao;
import com.example.demo.domain.Cargo;

@Repository
public class CargoImpl extends AbstractDao<Cargo, Long> implements CargoDao{

}

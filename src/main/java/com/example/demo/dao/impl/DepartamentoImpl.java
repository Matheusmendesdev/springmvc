package com.example.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.AbstractDao;
import com.example.demo.dao.DepartamentoDao;
import com.example.demo.domain.Departamento;

@Repository
public class DepartamentoImpl extends AbstractDao<Departamento, Long> implements DepartamentoDao{

}

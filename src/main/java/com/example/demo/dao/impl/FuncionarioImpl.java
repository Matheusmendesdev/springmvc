package com.example.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.AbstractDao;
import com.example.demo.dao.FuncionarioDao;
import com.example.demo.domain.Funcionario;

@Repository
public class FuncionarioImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao{

}

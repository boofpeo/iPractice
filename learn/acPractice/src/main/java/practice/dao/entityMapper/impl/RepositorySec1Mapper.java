package practice.dao.entityMapper.impl;

import org.springframework.stereotype.Component;
import practice.dao.entity.SecEntity;
import practice.dao.entityMapper.EntitySec1Mapper;

import java.util.Map;

@Component
public class RepositorySec1Mapper implements EntitySec1Mapper {


    @Override
    public SecEntity getEntity(Map<String, Object> param) {
        return new SecEntity("name1");
    }
}

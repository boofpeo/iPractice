package practice.dao.entityMapper.impl;

import org.springframework.stereotype.Component;
import practice.dao.entity.SecEntity;
import practice.dao.entityMapper.EntitySec2Mapper;

import java.util.Map;

@Component
public class RepositorySec2Mapper implements EntitySec2Mapper {


    @Override
    public SecEntity getEntity(Map<String, Object> param) {
        return new SecEntity("name2");
    }
}

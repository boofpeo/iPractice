package practice.dao.entityMapper.impl;

import org.springframework.stereotype.Component;
import practice.dao.entity.TheEntity;
import practice.dao.entityMapper.EntityThe1Mapper;

import java.util.Map;


@Component
public class RepositoryThe1Mapper implements EntityThe1Mapper {
    @Override
    public TheEntity getEntity(Map<String, Object> param) {
        return new TheEntity("18");
    }
}

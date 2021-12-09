package com.ssm.simple.convert;

import com.ssm.simple.dto.UserDTO;
import com.ssm.simple.po.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * @author peanutnowing
 */
@Mapper
public interface UserConvert {
    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    /**
     * 转换
     * @param user
     * @return
     */
    @Mappings({
            @Mapping(source = "name", target = "userName"),
    })
    UserDTO convert(User user);
}

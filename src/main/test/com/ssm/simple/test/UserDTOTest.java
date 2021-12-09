package com.ssm.simple.test;

import com.ssm.simple.convert.UserConvert;
import com.ssm.simple.dto.UserDTO;
import com.ssm.simple.po.User;
import lombok.SneakyThrows;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author : peanutnowing
 * create at:  2021/11/8
 * @description: dto test
 */
public class UserDTOTest {

    @SneakyThrows
    public static void main(String[] args) {
        System.out.println("开始处理...");
        User user =  new User(1L,"小王",15800001111L,25,1,"中国北京朝阳");
        long timeTaken;
        long time1 = System.currentTimeMillis();
        UserDTO userDTO;
        for (int i = 0;i<500000;i++){
            userDTO = new UserDTO();
            org.apache.commons.beanutils.BeanUtils.copyProperties(userDTO,user);
        }
        long time2 = System.currentTimeMillis();
        timeTaken =time2-time1;

        System.out.println("Apache Commons BeanUtils:"+timeTaken+"(ms)");

        long time3 = System.currentTimeMillis();

        for (int i = 0;i<500000;i++){
            userDTO = new UserDTO();
            BeanUtils.copyProperties(user,userDTO);
        }
        long time4 = System.currentTimeMillis();

        timeTaken =time4-time3;
        System.out.println("Spring BeanUtils:"+timeTaken+"(ms)");

        long time5 = System.currentTimeMillis();
        for (int i = 0;i<500000;i++){
            UserDTO userDTO1 = UserConvert.INSTANCE.convert(user);
        }
        long time6 = System.currentTimeMillis();
        timeTaken =time6-time5;

        System.out.println("MapStruct:"+timeTaken+"(ms)");

        long time7 = System.currentTimeMillis();
        for (int i = 0;i<500000;i++){
            UserDTO userDTO1 =copyField(user);
        }
        long time8 = System.currentTimeMillis();
        timeTaken =time8-time7;

        System.out.println("Getter/Setter:"+timeTaken+"(ms)");

    }

    private static UserDTO copyField(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName(user.getName());
        userDTO.setId(user.getId());
        userDTO.setMobile(user.getMobile());
        userDTO.setAge(user.getAge());
        return userDTO;
    }

}

package com.dk.Service;

import com.dk.dto.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author dun.kun
 * @version 1.0
 * @description: TODO
 * @date 2023/10/31 11:39
 */
@Service
public class UserService {
//    @Autowired
    //spring ioc容器会自动通过反射技术将属性private修饰符自动改为public，直接进行赋值
    //不在执行set方法
    @Resource
    //1.@Resource设置name属性，则按name在ioc容器中将bean注入
    //2.@Resource未设置name属性
    //2.1以属性名作为bean name在ioc容器中匹配bean，如有匹配则注入
    //2.2按属性名未匹配，则按类型进行匹配，同@AUtowwired，需加入@primary解决类型冲突
    //使用建议：在使用@Resource对象时推荐设置name或保证属性名与bean名称一致
    private UserDao udao;

    public UserService() {
        System.out.println("正在创建"+this);
    }

    public UserDao getUdao() {
        return udao;
    }
    //@Autowired
    //如果装配注解放在set方法上，则自动按类型/名称对set方法参数进行注入
    public void setUdao(UserDao udao) {
        System.out.println("setudao"+this);
        this.udao = udao;
    }
}

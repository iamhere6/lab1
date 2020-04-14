package com.lyn;

import org.junit.Assert;
import org.junit.Test;

/**
 *  在该工程的基础上编写一个简单的登录程序，该程序能够接收用户在控制台输入账号与密码，
 *  并能够将接收到的账号与密码与密码文件中存储的账号与密码进行比对，
 *  密码文件中的账号以明文的形式给出，而密码采用SHA-256算法保护。
 */
public class AppTest 
{

    private String Name = "17206135李亚男";

    private String PassWord = "123456";

    @Test
    public void testLength() {
        Assert.assertEquals(64, App.sha256hex(PassWord).length());
    }

    // 判断密文是否正确，正确则输出
    @Test
    public void testHex() {
        String expected = "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92";
        Assert.assertEquals(expected, App.sha256hex(PassWord));
    }
}


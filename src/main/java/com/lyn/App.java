package com.lyn;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Hello world!
 *
 */

public class App 
{

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }

       /* int flag = 1;
        while(flag == 0){*/
        // System.out.println(args[0]);
        if (args[0].equals("17206135李亚男")) {
            System.out.println("用户名：" + args[0]);
            System.out.println("密文密码:" + sha256hex(args[1]));
            // flag = 1;
        }else{
            System.out.println("用户名输入错误，请重新输入");
        }

    }
    /*    }
    }*/



    // 明文密码转密文密码
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }


}

package test.com;

import java.io.UnsupportedEncodingException;

/**
 * Created by yangjunming on 2017/4/23.
 */
public class EncodingTest {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "鑻规灉鎵嬫満-GBK";
        System.out.println(new String(s.getBytes("GBK"), "UTF-8"));
    }
}

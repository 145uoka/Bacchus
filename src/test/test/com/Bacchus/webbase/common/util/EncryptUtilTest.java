package test.com.Bacchus.webbase.common.util;

import org.junit.Test;

import com.Bacchus.app.util.EncryptUtil;

public class EncryptUtilTest {

    private static final class TestData {
        private static final String VALUE = "admin";
        private static final String DEFFAULT_SALT = "63b3cab38c364ef6bdbd120a52652189";
    }



    @Test
    public void testSaltHashStringString_MD5() {

        String encryptType = EncryptUtil.EncryptType.MD5;

        String result = EncryptUtil.saltHash(TestData.VALUE, encryptType);

        System.out.println(result);
    }

    @Test
    public void testSaltHashStringString_SHA256() {

        String encryptType = EncryptUtil.EncryptType.SHA256;

        String result = EncryptUtil.saltHash(TestData.VALUE, encryptType);

        System.out.println(result);
    }

    @Test
    public void testSaltHashStringStringString_MD5() {
        String encryptType = EncryptUtil.EncryptType.MD5;

        String result = EncryptUtil.saltHash(TestData.VALUE, TestData.DEFFAULT_SALT, encryptType);

        System.out.println(result);
    }

    @Test
    public void testSaltHashStringStringString_SHA256() {
        String encryptType = EncryptUtil.EncryptType.SHA256;

        String result = EncryptUtil.saltHash(TestData.VALUE, TestData.DEFFAULT_SALT, encryptType);

        System.out.println(result);
    }


}

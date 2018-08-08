package com.google.newgsonlib;

import com.google.gson.internal.bind.util.EncryptionDecryption;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
        try {
            EncryptionDecryption encryptionDecryption=new EncryptionDecryption("com.real.money.easy");
            String qwer = encryptionDecryption.encrypt("qwer");
            EncryptionDecryption encryptionDecryption1=new EncryptionDecryption("321");
            String qwer1 = encryptionDecryption1.encrypt("qwer");
            String s = encryptionDecryption.decrypt("cb2e2b83a37d7686e8e039afdd6b97a7");
            String s1 = encryptionDecryption.decrypt("b559ef3b3a605a04");
            if (qwer.equals(qwer1)) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
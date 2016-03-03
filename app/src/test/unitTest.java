package com.example.sw804f16.jukebox;

import org.junit.Test;

import java.lang.Exception;
import java.lang.String;

import static org.junit.Assert.*;

import com.example.sw804f16.jukebox.MainActivity;
import com.wrapper.spotify.Api;
import com.wrapper.spotify.models.AuthorizationCodeCredentials;

import junit.framework.Assert;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}

public class ConnectionTest {
    @Test
    public void is_Connected() throws Exception {

        //String clientId = "8d04022ead4444d0b005d171e5941922";
        //String clientSecret = "d9c1e3b5743b435e967c80e2784a528e";

        MainActivity main = new MainActivity();

        Assert.assertTrue(main.connectionFlag);

    }

    protected void SetupTest(){
        AuthenticationRequest result = new AuthenticationRequest();

    }
}
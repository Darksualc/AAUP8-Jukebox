package com.example.sw804f16.jukebox;

import android.os.Bundle;

import org.junit.Test;

import java.lang.Exception;
import java.lang.String;

import static org.junit.Assert.*;

import com.example.sw804f16.jukebox.MainActivity;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
//import com.wrapper.spotify.Api;
//import com.wrapper.spotify.models.AuthorizationCodeCredentials;

import junit.framework.Assert;

public class MainActivityTest {
    @Test
    public void is_Connected() throws Exception {

        //String clientId = "8d04022ead4444d0b005d171e5941922";
        //String clientSecret = "d9c1e3b5743b435e967c80e2784a528e";

        MainActivity main = new MainActivity();

        Assert.assertTrue(main.isConnectionFlag());

    }

    protected void SetupTest(){
        //AuthenticationRequest result = new AuthenticationRequest();

    }
}
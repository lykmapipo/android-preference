package com.github.lykmapipo.preference;

import android.content.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowApplication;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Preferences Tests
 *
 * @author lally elias
 */

@Config(sdk = 23)
@RunWith(RobolectricTestRunner.class)
public class PreferencesTest {

    @Before
    public void setup() {
        Context context = ShadowApplication.getInstance().getApplicationContext();
        Preferences.initialize(context);
    }

    @Test
    public void testShouldBeAbleToSetBoolean() {

        String key = "ANY_BOOL";
        Boolean value = true;

        Boolean isSet = Preferences.set(key, value);
        Boolean setValue = Preferences.get(key, false);

        assertTrue("String should be set", isSet);
        assertTrue("String should be same value", setValue.equals(value));

    }

    @Test
    public void testShouldBeAbleToSetFloat() {
        String key = "ANY_FLOAT";
        Float value = 1.9f;

        Boolean isSet = Preferences.set(key, value);
        Float setValue = Preferences.get(key, 0f);

        assertTrue("String should be set", isSet);
        assertTrue("String should be same value", setValue.equals(value));

    }

    @Test
    public void testShouldBeAbleToSetInteger() {

        String key = "ANY_INT";
        Integer value = 19;

        Boolean isSet = Preferences.set(key, value);
        Integer setValue = Preferences.get(key, 0);

        assertTrue("String should be set", isSet);
        assertTrue("String should be same value", setValue.equals(value));

    }

    @Test
    public void testShouldBeAbleToSetLong() {

        String key = "ANY_LONG";
        Long value = 19L;

        Boolean isSet = Preferences.set(key, value);
        Long setValue = Preferences.get(key, 0L);

        assertTrue("String should be set", isSet);
        assertTrue("String should be same value", setValue.equals(value));

    }

    @Test
    public void testShouldBeAbleToSetString() {

        String key = "ANY_STRING";
        String value = "Any";

        Boolean isSet = Preferences.set(key, value);
        String setValue = Preferences.get(key, "");

        assertTrue("String should be set", isSet);
        assertTrue("String should be same value", setValue.equals(value));

    }

    @Test
    public void testShouldBeAbleToSetStringSet() {

        String key = "ANY_STRING";
        String v1 = "Any 1";
        String v2 = "Any 2";

        Boolean isSet = Preferences.set(key, v1, v2);
        Set<String> setValue = Preferences.get(key, new HashSet<String>());

        assertTrue("String Set should be set", isSet);
        assertTrue("String Set should have value", setValue.contains(v1));
        assertTrue("String Set should have value", setValue.contains(v2));

    }

    @Test
    public void testShouldBeAbleToCheckExistence_01() {

        String key = "NO_ANY_STRING";

        Boolean contains = Preferences.contains(key);

        assertFalse("String should not exist", contains);

    }

    @Test
    public void testShouldBeAbleToCheckExistence_02() {

        String key = "ANY_STRING";
        String value = "Any";

        Boolean isSet = Preferences.set(key, value);
        Boolean contains = Preferences.contains(key);

        assertTrue("String should be set", isSet);
        assertTrue("String should exist", contains);

    }

    @After
    public void cleanup() {
        Preferences.clear();
    }
}
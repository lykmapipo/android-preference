package com.github.lykmapipo.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Preferences
 * <p>
 * A pack of helpful getter and setter methods for read and write to {@link SharedPreferences}.
 * </p>
 *
 * @author lally elias <a href="mailto:lallyelias87@gmail.com">lallyelias87@gmail.com</a>
 * @version 0.1.0
 * @since 0.1.0
 */
public class Preferences {

    private static SharedPreferences preferences;

    private Preferences() {
    }

    public static synchronized void initialize(@NonNull Context context) {
        if (preferences == null) {
            preferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        }
    }

    /**
     * Helper method to retrieve a String value from {@link SharedPreferences}.
     *
     * @param key
     * @return The value from shared preferences, or null if the value could not be read.
     */
    public static synchronized String get(@NonNull String key, String defaultValue) {
        String value = null;
        if (!TextUtils.isEmpty(key)) {
            value = preferences.getString(key, defaultValue);
        }
        return value;
    }

    /**
     * Helper method to write a String value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    public static synchronized Boolean set(@NonNull String key, String value) {
        if (!TextUtils.isEmpty(key)) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(key, value);
            return editor.commit();
        }
        return false;
    }

    /**
     * Helper method to retrieve a StringSet value from {@link SharedPreferences}.
     *
     * @param key
     * @return The value from shared preferences, or null if the value could not be read.
     */
    public static synchronized Set<String> get(@NonNull String key, Set<String> defaultValue) {
        Set<String> value = defaultValue;
        if (!TextUtils.isEmpty(key)) {
            value = preferences.getStringSet(key, defaultValue);
        }
        return value;
    }


    /**
     * Helper method to write a StringSet value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    public static synchronized Boolean set(@NonNull String key, Set<String> value) {
        if (!TextUtils.isEmpty(key) && value != null) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putStringSet(key, value);
            return editor.commit();
        }
        return false;
    }

    /**
     * Helper method to write a StringSet value to {@link SharedPreferences}.
     *
     * @param key
     * @param values
     * @return true if the new value was successfully written to persistent storage.
     */
    public static synchronized Boolean set(@NonNull String key, String... values) {
        if (!TextUtils.isEmpty(key) && values != null) {
            HashSet<String> _set = new HashSet<String>();
            _set.addAll(Arrays.asList(values));
            return set(key, _set);
        }
        return false;
    }

    /**
     * Helper method to retrieve a float value from {@link SharedPreferences}.
     *
     * @param key
     * @param defaultValue A default to return if the value could not be read.
     * @return The value from shared preferences, or the provided default.
     */
    public static synchronized Float get(@NonNull String key, Float defaultValue) {
        float value = defaultValue;
        if (preferences != null && !TextUtils.isEmpty(key)) {
            value = preferences.getFloat(key, defaultValue);
        }
        return value;
    }

    /**
     * Helper method to write a float value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    public static synchronized Boolean set(@NonNull String key, Float value) {
        if (preferences != null && !TextUtils.isEmpty(key)) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putFloat(key, value);
            return editor.commit();
        }
        return false;
    }

    /**
     * Helper method to retrieve a long value from {@link SharedPreferences}.
     *
     * @param key
     * @param defaultValue A default to return if the value could not be read.
     * @return The value from shared preferences, or the provided default.
     */
    public static synchronized Long get(@NonNull String key, Long defaultValue) {
        long value = defaultValue;
        if (preferences != null && !TextUtils.isEmpty(key)) {
            value = preferences.getLong(key, defaultValue);
        }
        return value;
    }

    /**
     * Helper method to write a long value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    public static synchronized Boolean set(@NonNull String key, Long value) {
        if (preferences != null && !TextUtils.isEmpty(key)) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putLong(key, value);
            return editor.commit();
        }
        return false;
    }

    /**
     * Helper method to retrieve an integer value from {@link SharedPreferences}.
     *
     * @param key
     * @param defaultValue A default to return if the value could not be read.
     * @return The value from shared preferences, or the provided default.
     */
    public static synchronized Integer get(@NonNull String key, Integer defaultValue) {
        int value = defaultValue;
        if (preferences != null && !TextUtils.isEmpty(key)) {
            value = preferences.getInt(key, defaultValue);
        }
        return value;
    }

    /**
     * Helper method to write an integer value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    public static synchronized Boolean set(@NonNull String key, Integer value) {
        if (preferences != null && !TextUtils.isEmpty(key)) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt(key, value);
            return editor.commit();
        }
        return false;
    }

    /**
     * Helper method to retrieve a boolean value from {@link SharedPreferences}.
     *
     * @param key
     * @param defaultValue A default to return if the value could not be read.
     * @return The value from shared preferences, or the provided default.
     */
    public static synchronized Boolean get(@NonNull String key, boolean defaultValue) {
        boolean value = defaultValue;
        if (preferences != null && !TextUtils.isEmpty(key)) {
            value = preferences.getBoolean(key, defaultValue);
        }
        return value;
    }

    /**
     * Helper method to write a boolean value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    public static synchronized Boolean set(@NonNull String key, Boolean value) {
        if (preferences != null && !TextUtils.isEmpty(key)) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean(key, value);
            return editor.commit();
        }
        return false;
    }

    /**
     * Helper method to clear {@link SharedPreferences}.
     */
    public static synchronized void clear() {
        if (preferences != null) {
            SharedPreferences.Editor editor = preferences.edit();
            editor.clear();
        }
    }

    /**
     * Helper method to clear {@link SharedPreferences}.
     */
    public static synchronized Boolean contains(@NonNull String key) {
        if (preferences != null && !TextUtils.isEmpty(key)) {
            boolean contains = preferences.contains(key);
            return contains;
        } else {
            return false;
        }
    }

    /**
     * Helper method to get all {@link SharedPreferences}.
     */
    public static synchronized Map<String, ?> getAll() {
        if (preferences != null) {
            Map<String, ?> all = preferences.getAll();
            return all;
        } else {
            return null;
        }
    }

}
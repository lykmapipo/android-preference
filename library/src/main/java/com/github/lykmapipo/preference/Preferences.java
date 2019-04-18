package com.github.lykmapipo.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

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

    private static Gson gson = new GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .excludeFieldsWithModifiers(Modifier.FINAL, Modifier.TRANSIENT, Modifier.STATIC)
            .serializeNulls()
            .create();

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
    @NonNull
    public static synchronized String get(@NonNull String key, @Nullable String defaultValue) {
        try {
            String value = defaultValue;
            value = preferences.getString(key, defaultValue);
            return value;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * Helper method to write a String value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    @NonNull
    public static synchronized Boolean set(@NonNull String key, @NonNull String value) {
        try {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(key, value);
            return editor.commit();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to retrieve a StringSet value from {@link SharedPreferences}.
     *
     * @param key
     * @return The value from shared preferences, or null if the value could not be read.
     */
    @NonNull
    public static synchronized Set<String> get(@NonNull String key, @Nullable Set<String> defaultValue) {
        try {
            Set<String> value = defaultValue;
            value = preferences.getStringSet(key, defaultValue);
            return value;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * Helper method to write a StringSet value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    @NonNull
    public static synchronized Boolean set(@NonNull String key, @NonNull Set<String> value) {
        try {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putStringSet(key, value);
            return editor.commit();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to write a StringSet value to {@link SharedPreferences}.
     *
     * @param key
     * @param values
     * @return true if the new value was successfully written to persistent storage.
     */
    @NonNull
    public static synchronized Boolean set(@NonNull String key, @NonNull String... values) {
        try {
            HashSet<String> _set = new HashSet<String>();
            _set.addAll(Arrays.asList(values));
            return set(key, _set);
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to retrieve a float value from {@link SharedPreferences}.
     *
     * @param key
     * @param defaultValue A default to return if the value could not be read.
     * @return The value from shared preferences, or the provided default.
     */
    @NonNull
    public static synchronized Float get(@NonNull String key, @Nullable Float defaultValue) {
        try {
            float value = defaultValue;
            value = preferences.getFloat(key, defaultValue);
            return value;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * Helper method to write a float value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    @NonNull
    public static synchronized Boolean set(@NonNull String key, @NonNull Float value) {
        try {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putFloat(key, value);
            return editor.commit();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to retrieve a long value from {@link SharedPreferences}.
     *
     * @param key
     * @param defaultValue A default to return if the value could not be read.
     * @return The value from shared preferences, or the provided default.
     */
    @NonNull
    public static synchronized Long get(@NonNull String key, @Nullable Long defaultValue) {
        try {
            long value = defaultValue;
            value = preferences.getLong(key, defaultValue);
            return value;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * Helper method to write a long value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    @NonNull
    public static synchronized Boolean set(@NonNull String key, @NonNull Long value) {
        try {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putLong(key, value);
            return editor.commit();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to retrieve an integer value from {@link SharedPreferences}.
     *
     * @param key
     * @param defaultValue A default to return if the value could not be read.
     * @return The value from shared preferences, or the provided default.
     */
    @NonNull
    public static synchronized Integer get(@NonNull String key, @Nullable Integer defaultValue) {
        try {
            int value = defaultValue;
            value = preferences.getInt(key, defaultValue);
            return value;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * Helper method to write an integer value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    @NonNull
    public static synchronized Boolean set(@NonNull String key, @NonNull Integer value) {
        try {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt(key, value);
            return editor.commit();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to retrieve a boolean value from {@link SharedPreferences}.
     *
     * @param key
     * @param defaultValue A default to return if the value could not be read.
     * @return The value from shared preferences, or the provided default.
     */
    @NonNull
    public static synchronized Boolean get(@NonNull String key, @Nullable boolean defaultValue) {
        try {
            boolean value = defaultValue;
            value = preferences.getBoolean(key, defaultValue);
            return value;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * Helper method to write a boolean value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    @NonNull
    public static synchronized Boolean set(@NonNull String key, @NonNull Boolean value) {
        try {
            SharedPreferences.Editor editor = preferences.edit();
            editor.putBoolean(key, value);
            return editor.commit();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to clear all {@link SharedPreferences}.
     */
    @NonNull
    public static synchronized Boolean clear() {
        try {
            SharedPreferences.Editor editor = preferences.edit();
            return editor.clear().commit();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to remove {@link SharedPreferences}.
     */
    @NonNull
    public static synchronized Boolean remove(@NonNull String... keys) {
        try {
            SharedPreferences.Editor editor = preferences.edit();
            for (String key : keys) {
                editor.remove(key);
            }
            return editor.commit();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to clear {@link SharedPreferences}.
     */
    @NonNull
    public static synchronized Boolean contains(@NonNull String key) {
        try {
            boolean contains = preferences.contains(key);
            return contains;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to get all {@link SharedPreferences}.
     */
    @Nullable
    public static synchronized Map<String, ?> getAll() {
        try {
            Map<String, ?> all = preferences.getAll();
            return all;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Helper method to write a generic value to {@link SharedPreferences}.
     *
     * @param key
     * @param value
     * @return true if the new value was successfully written to persistent storage.
     */
    @NonNull
    public static synchronized <T> Boolean set(@NonNull String key, @NonNull T value) {
        try {
            String json = gson.toJson(value);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString(key, json);
            return editor.commit();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Helper method to retrieve a boolean value from {@link SharedPreferences}.
     *
     * @param key
     * @param type
     * @return The value from shared preferences, or the provided default.
     */
    @Nullable
    public static synchronized <T> T get(@NonNull String key, @NonNull Class<T> type) {
        try {
            String json = preferences.getString(key, "");
            T value = gson.fromJson(json, type);
            return value;
        } catch (Exception e) {
            return null;
        }
    }

}
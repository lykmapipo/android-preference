package com.github.lykmapipo.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.github.lykmapipo.common.Common;
import com.github.lykmapipo.common.provider.Provider;

import java.util.Map;
import java.util.Set;

/**
 * A pack of helpful getter and setter methods for read and write to {@link SharedPreferences}.
 *
 * @author lally elias <lallyelias87@gmail.com>
 * @version 0.5.0
 * @since 0.1.0
 */
public class Preferences {
    /**
     * Valid instance of {@link SharedPreferences} created once during
     * {@link Preferences} initialization.
     *
     * @since 0.1.0
     */
    private static SharedPreferences preferences;

    private Preferences() {
    }

    /**
     * Initialize and create new {@link Preferences} instance if not exists
     *
     * @param provider {@link Context}
     * @since 0.5.0
     */
    public static synchronized void of(@NonNull Provider provider) {
        if (preferences == null) {
            Context context = provider.getApplicationContext();
            preferences = PreferenceManager.getDefaultSharedPreferences(context);
        }
    }

    /**
     * Dispose existing {@link Preferences} instance and release resources
     *
     * @since 0.4.0
     */
    public static synchronized void dispose() {
        if (preferences != null) {
            preferences = null;
        }
    }

    /**
     * Helper method to retrieve a String value from {@link SharedPreferences}.
     *
     * @param key
     * @return The value from shared preferences, or null if the value could not be read.
     */
    @NonNull
    public static synchronized String get(@NonNull String key, @NonNull String defaultValue) {
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
    public static synchronized Set<String> get(@NonNull String key, @NonNull Set<String> defaultValue) {
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
            Set<String> _set = Common.Value.setOf(values);
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
    public static synchronized Float get(@NonNull String key, @NonNull Float defaultValue) {
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
    public static synchronized Long get(@NonNull String key, @NonNull Long defaultValue) {
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
    public static synchronized Integer get(@NonNull String key, @NonNull Integer defaultValue) {
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
    public static synchronized Boolean get(@NonNull String key, @NonNull Boolean defaultValue) {
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
            String json = Common.Value.toJson(value);
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
            T value = Common.Value.fromJson(json, type);
            return value;
        } catch (Exception e) {
            return null;
        }
    }

}
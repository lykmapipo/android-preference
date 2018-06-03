android-preference
=======================

[![](https://jitpack.io/v/lykmapipo/android-preference.svg)](https://jitpack.io/#lykmapipo/android-preference)

A pack of helpful getter and setter methods for read and write to [SharedPreferences](https://developer.android.com/reference/android/content/SharedPreferences)

## Installation
Add [https://jitpack.io](https://jitpack.io) to your build.gradle with:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
add `android-preference` dependency into your project

```gradle
dependencies {
    compile 'com.github.lykmapipo:android-preference:v0.1.0'
}
```

## Usage

Initialize `android-preference`

```java
public class SampleApp extends Application{

    @Override
    public void onCreate() {
        
        super.onCreate();

        //initialize preference
        Preferences.initialize(getApplicationContext());
        
    }

}
```

In activity(or other component) start listen for broadcasts

```java
public class MainActivity extends AppCompatActivity{

    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String KEY = "USER_ACCOUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtain saved preference
        String account = Preferences.get(KEY, "N/A");

    }
}
```


## Test
```sh
./gradlew test
```

## Contribute
It will be nice, if you open an issue first so that we can know what is going on, then, fork this repo and push in your ideas.
Do not forget to add a bit of test(s) of what value you adding.

## License

(The MIT License)

Copyright (c) 2018 lykmapipo && Contributors

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
'Software'), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED 'AS IS', WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY
CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

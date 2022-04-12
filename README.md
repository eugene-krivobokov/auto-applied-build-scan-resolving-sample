A reproducer for build scan plugin issue.

Build scan plugin 3.9 is configured in a convention plugin: `convention-enterprise.settings.gradle.kts`.  
The root project applies it.

```shell
./gradlew help

https://gradle.com/s/...
```

It fails somehow in case of auto-applied build scan:

```shell
./gradlew help --scan

FAILURE: Build failed with an exception.

* Where:
Auto-applied by using --scan

* What went wrong:
Could not apply requested plugin [id: 'com.gradle.enterprise', version: '3.8.1', artifact: 'com.gradle:gradle-enterprise-gradle-plugin:3.8.1'] as it does not provide a plugin with id 'com.gradle.enterprise'. This is caused by an incorrect plugin implementation. Please contact the plugin author(s).
> Plugin with id 'com.gradle.enterprise' not found.
```

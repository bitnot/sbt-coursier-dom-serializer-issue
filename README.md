SBT 1.3.0-RC1 and sbt-coursier fail to resolve `org.webjars.npm:entities` required by `com.typesafe.sbt:sbt-jshint:1.0.6` plugin.

Here's how SBT 1.2.8 resolves the conflict:
```
+-com.typesafe.sbt:sbt-jshint:1.0.6
| +-org.webjars.npm:jshint:2.9.3
| | +-org.webjars.npm:htmlparser2:3.8.3
| | | +-org.webjars.npm:domutils:1.5.1
| | | | +-org.webjars.npm:dom-serializer:0.1.1
| | | | | +-org.webjars.npm:entities:1.0.0
| | | | | +-org.webjars.npm:entities:[1.1.1,2) (evicted by by: 1.0.0)
| | | +-org.webjars.npm:entities:1.0.0
...
```

Possible workaround: force `libraryDependencies += "org.webjars.npm" % "domutils" % "1.5.0"` in `project/plugins.sbt` to remove `dom-serializer` dependency. 

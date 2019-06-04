Created with `sbt new playframework/play-scala-seed.g8` to demonstrate issue with SBT and `sbt-jshint`/`dom-serializer`

```bash
cd play-scala-seed 
sbt
```

Issue reproduced on OSX 10.14.5 (Mojave)

Log:

```
play-scala-seed » sbt
[info] Loading global plugins from /Users/pchiper/.sbt/1.0/plugins/project/project/project
[info] Updating ProjectRef(uri("file:/Users/pchiper/.sbt/1.0/plugins/project/project/project/"), "global-plugins-build-build-build")...
[info] Done updating.
[info] Loading global plugins from /Users/pchiper/.sbt/1.0/plugins/project/project
[info] Updating ProjectRef(uri("file:/Users/pchiper/.sbt/1.0/plugins/project/project/"), "global-plugins-build-build")...
[info] Done updating.
[info] Loading global plugins from /Users/pchiper/.sbt/1.0/plugins/project
[info] Updating ProjectRef(uri("file:/Users/pchiper/.sbt/1.0/plugins/project/"), "global-plugins-build")...
[info] Done updating.
[info] Loading settings for project global-plugins from idea.sbt,sbt-thanks.sbt,_credentials.sbt,coursier.sbt,sbt-updates.sbt,idea-repo.sbt,metals.sbt ...
[info] Loading global plugins from /Users/pchiper/.sbt/1.0/plugins
[info] Updating ProjectRef(uri("file:/Users/pchiper/.sbt/1.0/plugins/"), "global-plugins")...
[info] Done updating.
[info] Loading settings for project play-scala-seed-build-build from plugins.sbt ...
[info] Loading project definition from /Users/pchiper/GitHub/sbt-coursier-dom-serializer-issue/play-scala-seed/project/project
[info] Updating ProjectRef(uri("file:/Users/pchiper/GitHub/sbt-coursier-dom-serializer-issue/play-scala-seed/project/project/"), "play-scala-seed-build-build")...
[info] Done updating.
[warn] There may be incompatibilities among your library dependencies; run 'evicted' to see detailed eviction warnings.
[info] Loading settings for project play-scala-seed-build from plugins.sbt ...
[info] Loading project definition from /Users/pchiper/GitHub/sbt-coursier-dom-serializer-issue/play-scala-seed/project
[info] Updating play-scala-seed-build
https://some.jfrog.corp.com/artifactory/sbt-ivy-releases/com.typesafe.play/sbt-plugin/scala_2.12/sbt_1.0/2.7.2/ivys/ivy.xml
  100.0% [##########] 4.5 KiB (7.6 KiB / s)
https://some.jfrog.corp.com/artifactory/sbt-ivy-releases/org.foundweekends.giter8/sbt-giter8-scaffold/scala_2.12/sbt_1.0/0.11.0/ivys/ivy.xml
  100.0% [##########] 1.7 KiB (3.2 KiB / s)
https://repo1.maven.org/maven2/org/foundweekends/giter8/giter8-lib_2.12/0.11.0/giter8-lib_2.12-0.11.0.pom
  100.0% [##########] 5.0 KiB (156.3 KiB / s)
https://repo1.maven.org/maven2/com/typesafe/config/1.3.4/config-1.3.4.pom
  100.0% [##########] 2.2 KiB (18.8 KiB / s)
https://repo1.maven.org/maven2/com/typesafe/play/run-support_2.12/2.7.2/run-support_2.12-2.7.2.pom
  100.0% [##########] 2.8 KiB (24.1 KiB / s)
https://repo1.maven.org/maven2/com/typesafe/play/sbt-routes-compiler_2.12/2.7.2/sbt-routes-compiler_2.12-2.7.2.pom
  100.0% [##########] 3.0 KiB (26.8 KiB / s)
https://repo1.maven.org/maven2/org/slf4j/slf4j-simple/1.7.26/slf4j-simple-1.7.26.pom
  100.0% [##########] 1021 B (26.9 KiB / s)
https://some.jfrog.corp.com/artifactory/sbt-ivy-releases/com.typesafe.sbt/sbt-native-packager/scala_2.12/sbt_1.0/1.3.20/ivys/ivy.xml
  100.0% [##########] 3.5 KiB (10.5 KiB / s)
https://repo1.maven.org/maven2/org/slf4j/slf4j-parent/1.7.26/slf4j-parent-1.7.26.pom
  100.0% [##########] 13.4 KiB (267.2 KiB / s)
https://repo1.maven.org/maven2/com/typesafe/play/build-link/2.7.2/build-link-2.7.2.pom
  100.0% [##########] 1.6 KiB (42.1 KiB / s)
https://repo1.maven.org/maven2/org/clapper/scalasti_2.12/2.1.4/scalasti_2.12-2.1.4.pom
  100.0% [##########] 2.3 KiB (59.9 KiB / s)
https://repo1.maven.org/maven2/org/codehaus/plexus/plexus-archiver/2.7.1/plexus-archiver-2.7.1.pom
  100.0% [##########] 3.7 KiB (39.3 KiB / s)
https://repo1.maven.org/maven2/org/eclipse/jgit/org.eclipse.jgit.pgm/4.9.0.201710071750-r/org.eclipse.jgit.pgm-4.9.0.201710071750-r.pom
  100.0% [##########] 9.6 KiB (88.1 KiB / s)
https://repo1.maven.org/maven2/org/slf4j/slf4j-api/1.7.26/slf4j-api-1.7.26.pom
  100.0% [##########] 3.7 KiB (41.6 KiB / s)
https://repo1.maven.org/maven2/org/codehaus/plexus/plexus-components/1.3/plexus-components-1.3.pom
  100.0% [##########] 3.0 KiB (114.9 KiB / s)
https://repo1.maven.org/maven2/org/codehaus/plexus/plexus/3.3/plexus-3.3.pom
  100.0% [##########] 19.4 KiB (335.1 KiB / s)
https://repo1.maven.org/maven2/org/slf4j/slf4j-log4j12/1.7.2/slf4j-log4j12-1.7.2.pom
  100.0% [##########] 1.6 KiB (48.8 KiB / s)
https://repo1.maven.org/maven2/args4j/args4j/2.33/args4j-2.33.pom
  100.0% [##########] 1.3 KiB (19.1 KiB / s)
https://repo1.maven.org/maven2/com/typesafe/play/play-exceptions/2.7.2/play-exceptions-2.7.2.pom
  100.0% [##########] 1.4 KiB (34.1 KiB / s)
https://repo1.maven.org/maven2/log4j/log4j/1.2.15/log4j-1.2.15.pom
  100.0% [##########] 17.4 KiB (369.4 KiB / s)
https://repo1.maven.org/maven2/org/clapper/classutil_2.12/1.1.1/classutil_2.12-1.1.1.pom
  100.0% [##########] 2.3 KiB (18.0 KiB / s)
https://repo1.maven.org/maven2/org/clapper/grizzled-scala_2.12/4.2.0/grizzled-scala_2.12-4.2.0.pom
  100.0% [##########] 1.7 KiB (28.2 KiB / s)
https://repo1.maven.org/maven2/org/codehaus/plexus/plexus-container-default/1.0-alpha-9-stable-1/plexus-container-default-1.0-alpha-9-stable-1.pom
  100.0% [##########] 3.9 KiB (38.2 KiB / s)
https://repo1.maven.org/maven2/org/codehaus/plexus/plexus-io/2.2/plexus-io-2.2.pom
  100.0% [##########] 2.4 KiB (24.6 KiB / s)
https://repo1.maven.org/maven2/org/eclipse/jgit/org.eclipse.jgit.archive/4.9.0.201710071750-r/org.eclipse.jgit.archive-4.9.0.201710071750-r.pom
  100.0% [##########] 7.1 KiB (99.0 KiB / s)
https://repo1.maven.org/maven2/org/eclipse/jgit/org.eclipse.jgit.http.apache/4.9.0.201710071750-r/org.eclipse.jgit.http.apache-4.9.0.201710071750-r.pom
  100.0% [##########] 6.8 KiB (51.8 KiB / s)
https://repo1.maven.org/maven2/org/eclipse/jgit/org.eclipse.jgit.lfs.server/4.9.0.201710071750-r/org.eclipse.jgit.lfs.server-4.9.0.201710071750-r.pom
  100.0% [##########] 4.6 KiB (153.3 KiB / s)
https://repo1.maven.org/maven2/org/eclipse/jgit/org.eclipse.jgit.lfs/4.9.0.201710071750-r/org.eclipse.jgit.lfs-4.9.0.201710071750-r.pom
  100.0% [##########] 4.0 KiB (42.7 KiB / s)
https://repo1.maven.org/maven2/org/eclipse/jgit/org.eclipse.jgit.ui/4.9.0.201710071750-r/org.eclipse.jgit.ui-4.9.0.201710071750-r.pom
  100.0% [##########] 3.5 KiB (86.8 KiB / s)
https://repo1.maven.org/maven2/org/codehaus/plexus/plexus-utils/3.0.8/plexus-utils-3.0.8.pom
  100.0% [##########] 3.1 KiB (74.8 KiB / s)
https://repo1.maven.org/maven2/org/eclipse/jetty/jetty-servlet/9.4.5.v20170502/jetty-servlet-9.4.5.v20170502.pom
  100.0% [##########] 2.1 KiB (41.5 KiB / s)
https://repo1.maven.org/maven2/args4j/args4j-site/2.33/args4j-site-2.33.pom
  100.0% [##########] 4.3 KiB (29.1 KiB / s)
https://repo1.maven.org/maven2/org/codehaus/plexus/plexus-components/1.2/plexus-components-1.2.pom
  100.0% [##########] 3.0 KiB (16.7 KiB / s)
https://repo1.maven.org/maven2/org/codehaus/plexus/plexus-containers/1.0.3/plexus-containers-1.0.3.pom
  100.0% [##########] 492 B (2.7 KiB / s)
https://repo1.maven.org/maven2/org/codehaus/plexus/plexus/1.0.4/plexus-1.0.4.pom
  100.0% [##########] 5.6 KiB (64.4 KiB / s)
https://repo1.maven.org/maven2/org/codehaus/plexus/plexus/3.2/plexus-3.2.pom
  100.0% [##########] 18.3 KiB (101.7 KiB / s)
https://repo1.maven.org/maven2/org/kohsuke/pom/14/pom-14.pom
  100.0% [##########] 5.4 KiB (61.5 KiB / s)
https://repo1.maven.org/maven2/log4j/log4j/1.2.17/log4j-1.2.17.pom
  100.0% [##########] 21.2 KiB (482.6 KiB / s)
https://repo1.maven.org/maven2/org/eclipse/jetty/jetty-security/9.4.5.v20170502/jetty-security-9.4.5.v20170502.pom
  100.0% [##########] 2.0 KiB (45.8 KiB / s)
https://repo1.maven.org/maven2/org/osgi/org.osgi.core/4.3.1/org.osgi.core-4.3.1.pom
  100.0% [##########] 1.4 KiB (33.7 KiB / s)
https://repo1.maven.org/maven2/org/ow2/asm/asm-commons/5.1/asm-commons-5.1.pom
  100.0% [##########] 2.0 KiB (16.5 KiB / s)
https://repo1.maven.org/maven2/org/ow2/asm/asm-util/5.1/asm-util-5.1.pom
  100.0% [##########] 2.0 KiB (17.4 KiB / s)
https://repo1.maven.org/maven2/org/ow2/asm/asm/5.1/asm-5.1.pom
  100.0% [##########] 1.9 KiB (19.5 KiB / s)
https://repo1.maven.org/maven2/org/ow2/asm/asm-parent/5.1/asm-parent-5.1.pom
  100.0% [##########] 5.4 KiB (134.1 KiB / s)
https://repo1.maven.org/maven2/org/eclipse/jetty/jetty-server/9.4.5.v20170502/jetty-server-9.4.5.v20170502.pom
  100.0% [##########] 2.5 KiB (54.4 KiB / s)
https://repo1.maven.org/maven2/org/ow2/asm/asm-tree/5.1/asm-tree-5.1.pom
  100.0% [##########] 2.0 KiB (56.5 KiB / s)
[info] Resolved play-scala-seed-build dependencies
[error] coursier.error.ResolutionError$Several: Error downloading org.webjars.npm:dom-serializer:[0,1)
[error]   Not found
[error]   not found: /Users/pchiper/.ivy2/local/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://repo1.maven.org/maven2/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-ivy-releases/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-plugin-releases/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://some.jfrog.corp.com/artifactory/typesafe-ivy-releases/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-maven-releases/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://some.jfrog.corp.com/artifactory/typesafe-releases/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://some.jfrog.corp.com/artifactory/releases/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   download error: Caught java.io.IOException: Server returned HTTP response code: 409 for URL: https://some.jfrog.corp.com/artifactory/snapshots/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom (Server returned HTTP response code: 409 for URL: https://some.jfrog.corp.com/artifactory/snapshots/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom) while downloading https://some.jfrog.corp.com/artifactory/snapshots/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://some.jfrog.corp.com/artifactory/public/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-ivy-releases-cache/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-plugin-releases-cache/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-maven-releases-cache/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://oss.sonatype.org/content/repositories/snapshots/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://dl.bintray.com/org.jetbrains/sbt-idea-shell/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://repo.typesafe.com/typesafe/ivy-releases/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error] Conflicting dependencies:
[error] org.webjars.npm:entities:1.0.0:default(compile)
[error] org.webjars.npm:entities:1.1.2:default(compile)
[error]         at coursier.error.ResolutionError$.from(ResolutionError.scala:70)
[error]         at coursier.Resolve.validate0$1(Resolve.scala:98)
[error]         at coursier.Resolve.$anonfun$ioWithConflicts$4(Resolve.scala:140)
[error]         at coursier.util.Task$.$anonfun$flatMap$2(Task.scala:11)
[error]         at scala.concurrent.Future.$anonfun$flatMap$1(Future.scala:303)
[error]         at scala.concurrent.impl.Promise.$anonfun$transformWith$1(Promise.scala:37)
[error]         at scala.concurrent.impl.CallbackRunnable.run(Promise.scala:60)
[error]         at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[error]         at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[error]         at java.lang.Thread.run(Thread.java:748)
[error] (coursierResolutions) coursier.error.ResolutionError$Several: Error downloading org.webjars.npm:dom-serializer:[0,1)
[error]   Not found
[error]   not found: /Users/pchiper/.ivy2/local/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://repo1.maven.org/maven2/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-ivy-releases/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-plugin-releases/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://some.jfrog.corp.com/artifactory/typesafe-ivy-releases/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-maven-releases/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://some.jfrog.corp.com/artifactory/typesafe-releases/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://some.jfrog.corp.com/artifactory/releases/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   download error: Caught java.io.IOException: Server returned HTTP response code: 409 for URL: https://some.jfrog.corp.com/artifactory/snapshots/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom (Server returned HTTP response code: 409 for URL: https://some.jfrog.corp.com/artifactory/snapshots/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom) while downloading https://some.jfrog.corp.com/artifactory/snapshots/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://some.jfrog.corp.com/artifactory/public/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-ivy-releases-cache/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-plugin-releases-cache/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://some.jfrog.corp.com/artifactory/sbt-maven-releases-cache/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://oss.sonatype.org/content/repositories/snapshots/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://dl.bintray.com/org.jetbrains/sbt-idea-shell/org/webjars/npm/dom-serializer/%5B0,1)/dom-serializer-%5B0,1).pom
[error]   not found: https://repo.typesafe.com/typesafe/ivy-releases/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error]   not found: https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/org.webjars.npm/dom-serializer/[0,1)/ivys/ivy.xml
[error] Conflicting dependencies:
[error] org.webjars.npm:entities:1.0.0:default(compile)
[error] org.webjars.npm:entities:1.1.2:default(compile)
Project loading failed: (r)etry, (q)uit, (l)ast, or (i)gnore? 
```
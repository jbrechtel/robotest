RoboTest
=========

RoboTest lets you use [Robolectric](http://pivotal.github.com/robolectric/) with [ScalaTest](http://scalatest.org).

Using Robolectric with ScalaTest means that you mean write unit tests for your Android apps
in Scala and run them in a JVM.  Without Robolectric, Android unit tests must be run in
an emulator.  This is slow and painful enough to make TDD impossible with Android.

Robolectric provides a JUnit test runner which does some class loader magic at runtime
to give your unit tests fake versions of Android framework classes.  RoboTest is
similar to Robolectric's JUnit test runner.  RoboTest does not use JUnit.

Using RoboTest is really easy.

Download the latest jar
----------------
Get it here [GitHub](https://github.com/jbrechtel/robotest/archives/master)

Add an SBT dependency
-----------

    val robotest = "com.github.jbrechtel" %% "robotest" % "0.1-SNAPSHOT" % "test"
    val robotestSnapshots  = "snapshots" at "http://jbrechtel.github.com/repo/snapshots"

Add a Maven dependency
-----------

    <dependency>
        <groupId>com.github.jbrechtel</groupId>
        <artifactId>robotest</artifactId>
        <version>0.1-SNAPSHOT</version>
        <scope>test</scope>
    </dependency>

Then you can mix it into your ScalaTest tests:

TODO

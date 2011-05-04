import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {

  /* dependencies */
  val robolectric = "com.pivotallabs" % "robolectric" % "1.0-RC1"
  val scalatest = "org.scalatest" % "scalatest" % "1.3"

  val snapshots = "snapshots" at "http://scala-tools.org/repo-snapshots"
  val releases  = "releases" at "http://scala-tools.org/repo-releases"

  override def testJavaSourcePath = "src" / "test" / "emptyAndroidProject" / "src" / "java"
}

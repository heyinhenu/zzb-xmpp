import sbt._
import Keys._
import com.typesafe.sbt.SbtMultiJvm.MultiJvmKeys._
import twirl.sbt.TwirlPlugin.Twirl
import twirl.sbt.TwirlPlugin._

object Build extends Build {

  import BuildSettings._
  import Dependencies._

  // configure prompt to show current project
  override lazy val settings = super.settings :+ {
    shellPrompt := {
      s => Project.extract(s).currentProject.id + " > "
    }
  }

  lazy val zzbXmpp = Project("zzb-xmpp", file("."))
    .settings(zzbModuleSettings: _*)
    .settings(disableParallelTestSetting:_*)
    .settings(libraryDependencies ++=
    compile(scalaloggingSlf4j,nScalaTime,smackTcp,akkaActor,smackCore,smackExts,sprayUtil) ++
      test(scalatest,akkaTestKit) ++
      runtime(akkaSlf4j, logback)
    )
}

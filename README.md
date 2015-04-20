zzb-xmpp
--------
    XMPP 的Scala包装，基于 eventbus 实现了一个简单易用的xmpp库，支持基本的私聊，进房间，房间内私聊等功能。

在项目中添加依赖

    resolvers += "zzb" at "http://dl.bintray.com/stepover/release"

    libraryDependencies ++= Seq(
        "me.stepover" % "zzb-xmpp_2.10" % "0.1.2-RC6",
    )

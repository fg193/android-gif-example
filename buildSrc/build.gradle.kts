repositories {
  maven {
    setUrl("https://maven.aliyun.com/repository/public/")
  }
}

plugins {
  kotlin("jvm") version "1.4.21-2"
  `kotlin-dsl`
}

dependencies {
  implementation(kotlin("stdlib-jdk8", version = "1.4.21-2"))
}

pipeline {
  agent any
  stages {
    stage('Build the code') {
      steps {
        sh 'mvn package'
	sh 'echo "Code Building is Done"'
 	sh 'cp -rf "$WORKSPACE/target/helloworld-0.0.1-SNAPSHOT.jar" /home/p/Meetup/demo.jar'
      }
    }
  }
}

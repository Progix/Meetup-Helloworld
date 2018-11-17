pipeline {
  agent any
  stages {
    stage('Build the code') {
      steps {
        sh 'mvn package'
        sh 'echo "Code Building is Done"'
      }
    }
    stage('Copy the code') {
      steps {
        sh 'cp -rf "$WORKSPACE/target/helloworld-0.0.1-SNAPSHOT.jar" /home/p/Meetup/demo.jar'
        sh 'echo "Copy is also done"'
      }
    }
    stage('Deploy the code') {
      steps {
        sh 'echo "Pa5sw0rd" | sudo -S service demo restart'
      }
    }
  }
}

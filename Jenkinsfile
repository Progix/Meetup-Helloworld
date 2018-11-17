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
      when {
        branch 'master'
      }
      steps {
        sh 'cp -rf "$WORKSPACE/target/helloworld-0.0.1-SNAPSHOT.jar" /home/p/Meetup/demo.jar'
        sh 'echo "Copy is also done"'
      }
    }
    stage('Do you want to deploy?') {
      steps {
        input(message: 'Do you want to deploy?', ok: 'Oh Yeah!')
      }
    }
    stage('Deploy the code') {
      steps {
        sh 'echo "Pa5sw0rd" | sudo -S service demo restart'
      }
    }
    stage('Monitoring') {
     steps {
       sh 'sleep 5'
       sh 'echo "Pa5sw0rd" | sudo -S service demo status'
     }
   }
  }
}

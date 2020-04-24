@Library('docker-lib@master') _

pipeline {
   agent any

   stages {
      stage('Docker Container') {
          steps{
             script {
              dockerlib.call "nginx"
             }
          }
      }
    }
}

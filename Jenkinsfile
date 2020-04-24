@Library('docker-lib@master') _

pipeline {
   agent any

   stages {
      stage('Docker Container') {
          steps{
             script {
              docker-lib.call "nginx"
             }
          }
      }
    }
}

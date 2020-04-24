@Library('docker-lib@master') _

pipeline {
   agent any

   stages {
      stage('Docker Container') {
          steps{
              withDockerContainer( image: "nginx" )
              {
                  sh "echo 'Container created with nginx image'"
                  sh "starting with clean up ..."
              }
          }
      }
    }
}

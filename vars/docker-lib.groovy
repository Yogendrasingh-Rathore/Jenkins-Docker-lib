def call(Map stageParams)
{
    withDockerContainer(image: stageParams)
     { 
         sh "mvn clean install"
     }
}

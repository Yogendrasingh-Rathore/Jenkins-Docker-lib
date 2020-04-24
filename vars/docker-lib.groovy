def call(String image_name)
{  
  withDockerContainer(image: ${image_name})
     { 
         
     }
}
  

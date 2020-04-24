def call(String image_name)
{  
  withDockerContainer(image: ${image_name})
     { 
         echo "Container created with ${image_name}"
         echo "starting with clean up ..."
     }
}
  

def call(String image_name, String args_value='')
{  
  withDockerContainer(args: args_value, image: image_name)
     { 
         echo "Container created with ${image_name}"
         echo "starting with clean up ..."
     }
}
  

def sayHello(String name){
echo "Hello, ${name}!"
}

def runUnitTests(){
  echo "Running unit tests..."
  sh "echo Running some generic tests..." // Kør en alternativ testkommando her
}


def deployToEnv(String env){
  echo "Deploying to ${env} environment..."
}

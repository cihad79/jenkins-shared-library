def say sayHello(String name){
echo "Hello, ${name}!"
}

def runUnitTests(){
  echo "Running unit tests..."
  sh "mvn test"
}


def deployToEnv(String env){
  echo "Deploying to ${env} environment..."
}

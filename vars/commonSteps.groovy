// Function to stash an artifact
def stashArtifact(String artifactName, String includes) {
    echo "Stashing artifact: ${artifactName}"
    stash includes: includes, name: artifactName, useDefaultExcludes: false
}

// Function to unstash an artifact
def unstashArtifact(String artifactName) {
    echo "Unstashing artifact: ${artifactName}"
    unstash name: artifactName
}

// Function to create an artifact
def createArtifact(String artifactPath, String content) {
    echo "Creating artifact at: ${artifactPath}"
    writeFile file: artifactPath, text: content
}

// Function to run unit tests
def runUnitTests() {
    echo "Running unit tests..."
    sh "echo Running some generic tests..." // Replace with actual test command
}

// Function to deploy to an environment
def deployToEnv(String env) {
    echo "Deploying to ${env} environment..."
    sh "echo Deploying to ${env}"  // Replace with actual deployment command
}

// Function to build another job and get the result
def buildJob(String jobName, List<ParameterValue> parameters = []) {
    echo "Building job: ${jobName}"
    def result = build job: jobName, parameters: parameters
    echo "Build result: ${result.result}"
    return result
}

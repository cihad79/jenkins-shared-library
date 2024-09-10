// Function to stash an artifact
def stashArtifact(String artifactName, String includes) {
    echo "Stashing artifact: ${artifactName}"
    stash includes: includes, name: artifactName
}

// Function to unstash an artifact
def unstashArtifact(String artifactName) {
    echo "Unstashing artifact: ${artifactName}"
    unstash name: artifactName
}

// Function to handle artifact creation (example)
def createArtifact(String artifactPath, String content) {
    echo "Creating artifact at: ${artifactPath}"
    sh "echo '${content}' > ${artifactPath}"
}

// Function to run unit tests
def runUnitTests() {
    echo "Running unit tests..."
    sh "echo Running some generic tests..." // Kør en alternativ testkommando her
}

// Function to deploy to an environment
def deployToEnv(String env) {
    echo "Deploying to ${env} environment..."
}

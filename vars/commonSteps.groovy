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

// Function to receive and process an artifact
def processArtifact(String artifactName) {
    echo "Processing artifact: ${artifactName}"
    // Example: Read the artifact
    sh "cat ${artifactName}"
    // Add processing logic here, e.g., append information to the artifact
    sh "echo 'Processed by second child pipeline' >> ${artifactName}"
}

// Function to send artifact back to parent pipeline
def sendArtifact(String artifactName) {
    echo "Sending artifact back to parent pipeline: ${artifactName}"
    stash includes: artifactName, name: artifactName
}

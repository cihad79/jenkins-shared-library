def modifyArtifact(String artififatcPath, String additionalConcent){
  echo "Modifying artifact at: ${artifactPath}"
  sh "echo '${additionalContent}' >> ${artifactPath}"
}

def archiveModifiedArtifact(String artifactPath){
  echo "Archiving modified artifact at: ${artifactPath}"
  archiveArtifacts artifacts: artifactPath, allowEmptyArchive: true 
}

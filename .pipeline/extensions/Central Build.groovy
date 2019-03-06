void call(Map params) {
    //access stage name
    echo "Start - Extension for stage: ${params.stageName}"
    sh "mvn clean package"
    sh "ls -al"
    sh "ls -al target"
    stash name: 'buildArtifacts', includes: './target/**/*'
    echo "End - Extension for stage: ${params.stageName}"
}
return this

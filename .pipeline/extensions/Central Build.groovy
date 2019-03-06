void call(Map params) {
    //access stage name
    echo "Start - Extension for stage: ${params.stageName}"
    sh "mvn clean package"
    sh "mv .target/spring-echo-example-*.jar ./spring-echo-example.jar"
    stash name: 'buildArtifacts', includes: './spring-echo-example.jar'
    echo "End - Extension for stage: ${params.stageName}"
}
return this

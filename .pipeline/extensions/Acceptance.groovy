void call(Map params) {
    //access stage name
    echo "Start - Extension for stage: ${params.stageName}"
    sh "mvn clean package"
    //execute original stage as defined in the template
    params.originalStage()
    echo "End - Extension for stage: ${params.stageName}"
}
return this

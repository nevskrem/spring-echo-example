void call(Map params) {
    //access stage name
    echo "Start - Extension for stage: ${params.stageName}"
    unstash name: 'buildArtifacts'
    cloudFoundryDeploy script: script
    healthExecuteCheck script: script
    echo "End - Extension for stage: ${params.stageName}"
}
return this

void call(Map params) {
    //access stage name
    echo "Start - Extension for stage: ${params.stageName}"
    unstash name: 'buildArtifacts'
    cloudFoundryDeploy script: params.script
    healthExecuteCheck script: params.script
    echo "End - Extension for stage: ${params.stageName}"
}
return this

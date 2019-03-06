void call(Map params) {
    //access stage name
    echo "Start - Extension for stage: ${params.stageName}"
    unstash name: 'buildArtifacts'
    params.script.globalPipelineEnvironment.configuration.runStep.Acceptance.downloadArtifactsFromNexus = false
    //execute original stage as defined in the template
    params.originalStage()
    echo "End - Extension for stage: ${params.stageName}"
}
return this

pipelineJob('backend') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials("")
                        url("https://github.com/diehard-gmb/Backend.git")
                    }
                    branches('main')
                    scriptPath('Jenkinsfile')
                }
            }
        }
    }
}

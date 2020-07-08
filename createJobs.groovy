pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/cb-steven-matison/spring-boot-api-example.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
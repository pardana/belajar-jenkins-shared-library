def call(Map config) {
    if (config.type == 'library') {
        libraryPipeline()
    }else if(config.type == 'js'){
        // jsPipeline()
    }else {
        pipeline {
            agent any
            stages {
                stage('Unsupported Pipeline') {
                    steps {
                        script {
                            echo("Unsupported Pipeline")
                        }
                    }
                }
            }
        }
    }
}

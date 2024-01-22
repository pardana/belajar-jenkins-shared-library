def call() {
    pipeline {
        agent any
        stages {
            stage('Library Resource') {
                steps {
                    script {
                        def config = libraryResource('config/build.json')
                        echo(config)
                    }
                }
            }

            stage('Hello Person') {
                steps {
                    script {
                        person.person([
                        firstName: 'Aditria',
                        lastName: 'Pardana'
                    ])
                    }
                }
            }

            stage('Global Variable') {
                steps {
                    script {
                        echo(author())
                        echo(author.name())
                        echo(author.channel())
                    }
                }
            }

            stage('Hello Groovy') {
                steps {
                    script {
                        Output.hello(this, 'Groovy')
                    }
                }
            }

            stage('Hello World') {
                steps {
                    script {
                        hello.world()
                    }
                }
            }
        }
    }
}

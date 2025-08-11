@Library('my-shared-library') _

pipeline {
    agent any
    stages {
        stage('Greeting') {
            steps {
                helloWorld('Sanjay')
            }
        }
        stage('logging') {
            steps {
                logMessage('this is a log message   from the pipeline')
            }
        }
    }
}

@Library('my-shared-library') _

pipeline {
    agent any
    tools {
        maven 'maven3'
    }
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
        stage('Build and Test') {
            steps {
                buildAndTest()
            }
        }
    }
}
